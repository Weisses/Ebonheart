package com.ebonheart.EbonArtsMod.compendium;

import com.ebonheart.EbonArtsMod.api.CompendiumHelper;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class AlchemicalCompendium  implements CompendiumHelper {

	@Override
	public void AddCompenidumEntry(Object entryItem, String entryKey, String entryName, String entryDesc, String parent, boolean allowReplace, String... relatedKeys) {
		
		
		
	}

	
	
	
	
	
	/**
	 * Unlocks Related Items
	 */
	public void unlockRelatedItems(ItemStack stack){
		//initial error checking
		if (stack == null)
			return;

		//initialize variables (definitely don't miss the C days...)
		//initialize not at the top of the function.  Take that, old school!
		CompendiumEntry entry = null;
		String itemID = "";

		//ensure the unlocalized name has been set
		if (stack.getItem().getUnlocalizedName() == null)
			return;

		//construct a search ID based on what is passed in
		if (stack.getItem() instanceof Item){
			itemID = stack.getItem().getUnlocalizedName().replace("item.", "").replace("arsmagica2:", "");
		}else if (stack.getItem() instanceof ItemBlock){
			itemID = stack.getItem().getUnlocalizedName().replace("arsmagica2:", "").replace("tile.", "");
		}

		//append meta specific search if needed
		if (stack.getItemDamage() > -1)
			itemID += "@" + stack.getItemDamage();

		//search based on our constructed ID
		entry = getEntry(itemID);

		//did we find something?
		if (entry != null){
			//great!  ensure it's unlocked in the compendium
			unlockEntry(entry, true);
		}
	}
}
