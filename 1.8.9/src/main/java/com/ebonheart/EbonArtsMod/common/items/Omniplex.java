package com.ebonheart.EbonArtsMod.common.items;

import java.util.List;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.helper.LogHelper;
import com.ebonheart.EbonArtsMod.common.entity.EntityEnchantedEbonheart;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.event.ClickEvent;
import net.minecraft.event.ClickEvent.Action;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityNote;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.BlockPos;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class Omniplex extends Item {
	
	
	private static final String KEY_SIGN0 = "sign_0";
	private static final String KEY_SIGN1 = "sign_1";
	private static final String KEY_SIGN2 = "sign_2";
	private static final String KEY_SIGN3 = "sign_3";
	
	//private static TileEntitySign sign1;// = "sign";
	
	public Omniplex()
	{  
		super();    
		this.setCreativeTab(EbonArtsMod.tabEbonArtsItems); 
		this.setMaxStackSize(1);
	}
	
	
	 /**
     * Called when a Block is right-clicked with this Item
     */
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
	{
		
		TileEntitySign sign = new TileEntitySign();
		
		if(!playerIn.isSneaking() && pos=Items.sign )
		{

			if()
			
			if(stack.getTagCompound() == null)
			{
				stack.setTagCompound(new NBTTagCompound());
			}
			NBTTagCompound nbt = new NBTTagCompound();

			nbt.setString(KEY_SIGN0, sign.signText[0].getUnformattedText());
			nbt.setString(KEY_SIGN1, sign.signText[1].getFormattedText());
			//nbt.setInteger("dim", playerIn.dimension);
			//nbt.setInteger("posX", pos.getX());
			//nbt.setInteger("posY", pos.getY());
			nbt.setInteger("posZ", pos.getZ());
			//nbt.setString(KEY_SIGN1, sign);
			//nbt.setString("Sign line 1 = ", KEY_SIGN0);
			stack.getTagCompound().setTag("signtext", nbt);
			
			stack.setStackDisplayName(EnumChatFormatting.DARK_PURPLE + "Sign copied.");
		}

		LogHelper.info("stack " + KEY_SIGN0 + "   " + KEY_SIGN1 + "   " +sign.signText[0].getUnformattedText());
		return false;
	}
	
	
	/**
     * Called whenever this item is equipped and the right mouse button is pressed. Args: itemStack, world, entityPlayer
     */
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn
			//, PlayerInteractEvent event
			)
    {
		
		
		
		if(playerIn.isSneaking())
		{
			if(stack.getTagCompound() != null)
			{
				stack.getTagCompound().removeTag("signtext");
				stack.clearCustomName();
			}
		}
        return stack;
    }
	
	
	
	public static void rightClickBlock(PlayerInteractEvent event) 
	{
		ItemStack stack = event.entityPlayer.getCurrentEquippedItem();
		Block block_clicked = event.world.getBlockState(event.pos).getBlock(); 
		TileEntity container = event.world.getTileEntity(event.pos);
		World world = event.world;
		EntityPlayer entityPlayer = event.entityPlayer;
		
		boolean isValid = false;
		boolean wasCopy = false;
		boolean isEmpty = (stack.getTagCompound() == null);
 
		if((block_clicked == Blocks.wall_sign || block_clicked == Blocks.standing_sign) &&  container instanceof TileEntitySign)
		{
			
			TileEntitySign sign = (TileEntitySign)container;
			 
			if(isEmpty) 
			{ 
				Omniplex.copySign(world,entityPlayer,sign,stack); 
				wasCopy = true;
			}
			else
			{
				Omniplex.pasteSign(world,entityPlayer,sign,stack); 
				wasCopy = false;
			} 
			
			isValid = true; 
		}
		
		
		if(isValid)
		{
			if(event.world.isRemote)
			{	
				//spawnParticle(event.world, EnumParticleTypes.PORTAL,event.pos.getX(),event.pos.getY(),event.pos.getZ()); 
			}
	//		else
	//		{ 
	//			if(wasCopy == false)//on paste, we consume the item
	//			{
	//				if (entityPlayer.capabilities.isCreativeMode == false)
	//		        {
	//					entityPlayer.inventory.decrStackSize(entityPlayer.inventory.currentItem, 1);
	//		        }
	//			}
	//		}
	//		
			//playSoundAt(event.entityPlayer, "random.fizz"); 
		}  
	}  
	
	
	
	
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List toolTip, boolean advanced) 
	{
		
		boolean isEmpty = (stack.getTagCompound() == null);
			if(isEmpty)
			{
				toolTip.add("Click to copy a sign!"); 
				return;
			}
		//	 
			String sign = getItemStackNBT(stack, KEY_SIGN0)
					+ getItemStackNBT(stack, KEY_SIGN1)
					+ getItemStackNBT(stack, KEY_SIGN2)
					+ getItemStackNBT(stack, KEY_SIGN3);
			
			if(sign.length() > 0)
			{ 
				toolTip.add(getItemStackNBT(stack, KEY_SIGN0));
				toolTip.add(getItemStackNBT(stack, KEY_SIGN1));
				toolTip.add(getItemStackNBT(stack, KEY_SIGN2));
				toolTip.add(getItemStackNBT(stack, KEY_SIGN3));
			}
	 
			
		
		
		if(stack.getTagCompound() != null)
		{
			if(stack.getTagCompound().hasKey("signtext"))
			{
				NBTTagCompound nbt = (NBTTagCompound) stack.getTagCompound().getTag("signtext");
				String sign1 = nbt.getString(KEY_SIGN0);
				int dim = nbt.getInteger("dim");
				//int posX = nbt.getInteger("posX");
				//int posY = nbt.getInteger("posY");
				int posZ = nbt.getInteger("posZ");
				toolTip.add("Dim: " + sign1 + 
						//" X: " + 
				//posX + " Y: " + posY + 
						" Z: " + posZ);
			}
		}
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack stack)
    {
		if(stack.getTagCompound() != null)
		{
			return stack.getTagCompound().hasKey("signtext");
		}
		return false;
    }
	
	
	
	
	
	
	
	public static void setItemStackNBT(ItemStack item, String prop, String value) 
	{
		item.getTagCompound().setString(prop, value);
	} 
	
	public static String getItemStackNBT(ItemStack item, String prop) 
	{
		String s = item.getTagCompound().getString(prop);
		if(s == null) { s = ""; }
		return s;
	} 
	
	
	
	
	
	public static void copySign(World world, EntityPlayer entityPlayer,	TileEntitySign sign, ItemStack stack) 
	{  
		if(stack.getTagCompound() == null) {stack.setTagCompound(new NBTTagCompound());}
		setItemStackNBT(stack, KEY_SIGN0, sign.signText[0].getUnformattedText());
		setItemStackNBT(stack, KEY_SIGN1, sign.signText[1].getUnformattedText());
		setItemStackNBT(stack, KEY_SIGN2, sign.signText[2].getUnformattedText());
		setItemStackNBT(stack, KEY_SIGN3, sign.signText[3].getUnformattedText());

		entityPlayer.swingItem(); 
	}
	
	
	
	public static void pasteSign(World world, EntityPlayer entityPlayer, TileEntitySign sign, ItemStack stack) 
	{   
		if(stack.getTagCompound() == null) {stack.setTagCompound(new NBTTagCompound());}
		sign.signText[0] = new ChatComponentText(getItemStackNBT(stack, KEY_SIGN0));
		sign.signText[1] = new ChatComponentText(getItemStackNBT(stack, KEY_SIGN1));
		sign.signText[2] = new ChatComponentText(getItemStackNBT(stack, KEY_SIGN2));
		sign.signText[3] = new ChatComponentText(getItemStackNBT(stack, KEY_SIGN3));
  
		world.markBlockForUpdate(sign.getPos());//so update is refreshed on client side

		entityPlayer.swingItem();
	}

	
	
	//@SuppressWarnings({ "unchecked", "rawtypes" })
	//@Override
	//public void addInformation(ItemStack held, EntityPlayer player, List list, boolean par4) 
	//{  
	//	boolean isEmpty = (held.getTagCompound() == null);
	//	if(isEmpty)
	//	{
	//		list.add("Click to copy a sign! - TEST"); 
	//		return;
	//	}
	//	 
	//	String sign = getItemStackNBT(held, KEY_SIGN0)
	//			+ getItemStackNBT(held, KEY_SIGN1)
	//			+ getItemStackNBT(held, KEY_SIGN2)
	//			+ getItemStackNBT(held, KEY_SIGN3);
	//	
	//	if(sign.length() > 0)
	//	{ 
	//		list.add(getItemStackNBT(held, KEY_SIGN0));
	//		list.add(getItemStackNBT(held, KEY_SIGN1));
	//		list.add(getItemStackNBT(held, KEY_SIGN2));
	//		list.add(getItemStackNBT(held, KEY_SIGN3));
	//	}
 
		//String s = noteToString(held.getTagCompound().getByte(KEY_NOTE));

		//if(s != null)
		//{
		//	list.add("Note: " + s);
		//} 
	//}
 
	
	//@Override
	//public ItemStack onItemRightClick(ItemStack stack, World worldIn, EntityPlayer playerIn)
    //{
		
		
	//	PlayerInteractEvent = event;
		
		
		
		
		
		
		
		
	//	
	//	ItemStack held = event.entityPlayer.getCurrentEquippedItem();
	//	Block blockClicked = event.world.getBlockState(event.pos).getBlock(); 
	//	TileEntity container = event.world.getTileEntity(event.pos);
	//	World world = event.world;
	//	EntityPlayer entityPlayer = event.entityPlayer;
	//	boolean isValid = false;
	//	boolean wasCopy = false;
		
	//	boolean isEmpty = (held.getTagCompound() == null);
 
	//	if((blockClicked == Blocks.wall_sign || blockClicked == Blocks.standing_sign) 
	//			&&  container instanceof TileEntitySign)
	//	{
	//		TileEntitySign sign = (TileEntitySign)container;
			 
	//		if(isEmpty) 
	//		{ 
	//			Omniplex.copySign(world,entityPlayer,sign,held); 
	//			wasCopy = true;
	//		}
	//		else
	//		{
	//			Omniplex.pasteSign(world,entityPlayer,sign,held); 
	//			wasCopy = false;
	//		} 
			
	//		isValid = true; 
	//	}
		//if(blockClicked == Blocks.noteblock && container instanceof TileEntityNote)
		//{
		//	TileEntityNote noteblock = (TileEntityNote)container;
			 
		//	if(isEmpty)
		//	{ 
		//		Omniplex.copyNote(world,entityPlayer,noteblock,held);
				//		wasCopy = true; 
		//	}
		//	else
		//	{
		//		Omniplex.pasteNote(world,entityPlayer,noteblock,held); 
		//		wasCopy = false;
		//	} 
			
		//	isValid = true; 
		//} 
		
	//	if(isValid)
	//	{
	//		if(event.world.isRemote)
	//		{	
	//			//spawnParticle(event.world, EnumParticleTypes.PORTAL,event.pos.getX(),event.pos.getY(),event.pos.getZ()); 
	//		}
	//		else
	//		{ 
	//			if(wasCopy == false)//on paste, we consume the item
	//			{
	//				if (entityPlayer.capabilities.isCreativeMode == false)
	//		        {
	//					entityPlayer.inventory.decrStackSize(entityPlayer.inventory.currentItem, 1);
	//		        }
	//			}
	//		}
	//		
	//		playSoundAt(event.entityPlayer, "random.fizz"); 
			//	}  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//	if(playerIn.isSneaking())
	//	{
	//		if (!playerIn.capabilities.isCreativeMode)
	//       {
	//           --stack.stackSize;
	////       }
	//
	//        worldIn.playSoundAtEntity(playerIn, "random.bow", 0.5F, 0.4F / (itemRand.nextFloat() * 0.4F + 0.8F));

	//        if (!worldIn.isRemote)
	//       {
	//            worldIn.spawnEntityInWorld(new EntityEbonheart(worldIn, playerIn));
	//        }
	//        return stack;
	//	}
	//   return stack;
	//}
	
	
	
	//public static void rightClickBlock(PlayerInteractEvent event) 
	//{
	///	ItemStack held = event.entityPlayer.getCurrentEquippedItem();
	//	Block blockClicked = event.world.getBlockState(event.pos).getBlock(); 
	//	TileEntity container = event.world.getTileEntity(event.pos);
	//	World world = event.world;
	//	EntityPlayer entityPlayer = event.entityPlayer;
	//	boolean isValid = false;
	//	boolean wasCopy = false;
		
	//	boolean isEmpty = (held.getTagCompound() == null);
 
	//	if((blockClicked == Blocks.wall_sign || blockClicked == Blocks.standing_sign) 
	//			&&  container instanceof TileEntitySign)
	//	{
	//		TileEntitySign sign = (TileEntitySign)container;
			 
			//if(isEmpty) 
			//{ 
			//	Omniplex.copySign(world,entityPlayer,sign,held); 
			//	wasCopy = true;
			//}
			//else
			//{
			//	Omniplex.pasteSign(world,entityPlayer,sign,held); 
			//	wasCopy = false;
			//} 
			
	//		isValid = true; 
	//	}
		//if(blockClicked == Blocks.noteblock && container instanceof TileEntityNote)
		//{
		//	TileEntityNote noteblock = (TileEntityNote)container;
			 
		//	if(isEmpty)
		//	{ 
		//		Omniplex.copyNote(world,entityPlayer,noteblock,held);
				//		wasCopy = true; 
		//	}
		//	else
		//	{
		//		Omniplex.pasteNote(world,entityPlayer,noteblock,held); 
		//		wasCopy = false;
		//	} 
			
		//	isValid = true; 
		//} 
		
	//	if(isValid)
	//	{
	//		if(event.world.isRemote)
	///		{	
				//spawnParticle(event.world, EnumParticleTypes.PORTAL,event.pos.getX(),event.pos.getY(),event.pos.getZ()); 
	//		}
	//		else
	//		{ 
	//			if(wasCopy == false)//on paste, we consume the item
	//			{
	//				if (entityPlayer.capabilities.isCreativeMode == false)
	//		        {
	//					entityPlayer.inventory.decrStackSize(entityPlayer.inventory.currentItem, 1);
	//		        }
	//			}
	//		}
	//		
	//		playSoundAt(event.entityPlayer, "random.fizz"); 
	//	}  
	//}  
	
	//public static void spawnParticle(World world, EnumParticleTypes type, double x, double y, double z)
	//{ 
	//	//http://www.minecraftforge.net/forum/index.php?topic=9744.0
	//	for(int countparticles = 0; countparticles <= 10; ++countparticles)
	//	{
	//		world.spawnParticle(type, x + (world.rand.nextDouble() - 0.5D) * (double)0.8, y + world.rand.nextDouble() * (double)1.5 - (double)0.1, z + (world.rand.nextDouble() - 0.5D) * (double)0.8, 0.0D, 0.0D, 0.0D);
	//	} 
	//}
	
	//public static void playSoundAt(Entity player, String sound)
	//{ 
	//	player.worldObj.playSoundAtEntity(player, sound, 1.0F, 1.0F);
	//}
	
	//public static String noteToString(byte note) 
	//{
	//	String s = null;
		
	//	switch(note)
	//	{
	//		case 0:   s = EnumChatFormatting.YELLOW + "F#";  	break;//yellow
	//		case 1:   s = EnumChatFormatting.YELLOW + "G";  	break;
	//		case 2:   s = EnumChatFormatting.YELLOW + "G#";  	break;
	//		case 3:   s = EnumChatFormatting.YELLOW + "A";  	break;//or
	//		case 4:   s = EnumChatFormatting.YELLOW + "A#";  	break;//or
	//		case 5:   s = EnumChatFormatting.RED + "B";  		break;//red
	//		case 6:   s = EnumChatFormatting.RED + "C";  		break;//red
	//		case 7:   s = EnumChatFormatting.DARK_RED + "C#";  	break;
	//		case 8:   s = EnumChatFormatting.DARK_RED + "D";  	break;
	//		case 9:   s = EnumChatFormatting.LIGHT_PURPLE + "D#";  	break;//pink
	//		case 10:  s = EnumChatFormatting.LIGHT_PURPLE + "E";  	break;
	//		case 11:  s = EnumChatFormatting.DARK_PURPLE + "F";  	break;//purp
	//		case 12:  s = EnumChatFormatting.DARK_PURPLE + "F#";  	break;
	//		case 13:  s = EnumChatFormatting.DARK_PURPLE + "G";  	break;
	//		case 14:  s = EnumChatFormatting.DARK_BLUE + "G#";  	break;
	//		case 15:  s = EnumChatFormatting.DARK_BLUE + "A";  	break;//blue
	//		case 16:  s = EnumChatFormatting.BLUE + "A#";  	break;
	//		case 17:  s = EnumChatFormatting.BLUE + "B";  	break;
	//		case 18:  s = EnumChatFormatting.DARK_AQUA + "C";  	break;//lt blue?
	//		case 19:  s = EnumChatFormatting.AQUA + "C#";  	break;
	//		case 20:  s = EnumChatFormatting.AQUA + "D";  	break;//EnumChatFormatting.GREEN
	//		case 21:  s = EnumChatFormatting.GREEN + "D#";  	break;//there is no light green or dark green...
	//		case 22:  s = EnumChatFormatting.GREEN + "E";  	break;
	//		case 23:  s = EnumChatFormatting.AQUA + "F";  	break;
	//		case 24:  s = EnumChatFormatting.AQUA + "F#";  	break;//EnumChatFormatting.GREEN
	//	}
		
	//	return s;
	//}
	
	
	
	
}
