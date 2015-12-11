/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Jan 14, 2014, 6:34:34 PM (GMT)]
 */
package com.ebonheart.EbonArtsMod.api.internal;

import java.util.List;

import com.ebonheart.EbonArtsMod.api.omnibus.OmnibusPage;

import net.minecraft.client.gui.ScaledResolution;
//import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.tileentity.TileEntity;
//import net.minecraft.util.IIcon;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
//import vazkii.botania.api.boss.IBotaniaBoss;
//import vazkii.botania.api.Omnibus.multiblock.MultiblockSet;
//import vazkii.botania.api.recipe.RecipeBrew;
//import vazkii.botania.api.recipe.RecipeElvenTrade;
//import vazkii.botania.api.recipe.RecipeManaInfusion;
//import vazkii.botania.api.recipe.RecipePetals;
//import vazkii.botania.api.recipe.RecipeRuneAltar;
//import vazkii.botania.api.subtile.SubTileEntity;
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;

/**
 * Any methods that refer to internal methods in Botania are here.
 * This is defaulted to a dummy handler, whose methods do nothing.
 * This handler is set to a proper one on PreInit. Make sure to
 * make your mod load after Botania if you have any intention of
 * doing anythign with this on PreInit.
 */
public interface IInternalMethodHandler {

	public OmnibusPage textPage(String key);

	public OmnibusPage elfPaperTextPage(String key);

	public OmnibusPage imagePage(String key, String resource);

	public OmnibusPage craftingRecipesPage(String key, List<IRecipe> recipes);

	public OmnibusPage craftingRecipePage(String key, IRecipe recipe);

	//public OmnibusPage petalRecipesPage(String key, List<RecipePetals> recipes);

	//public OmnibusPage petalRecipePage(String key, RecipePetals recipe);

	//public OmnibusPage runeRecipesPage(String key, List<RecipeRuneAltar> recipes);

	//public OmnibusPage runeRecipePage(String key, RecipeRuneAltar recipe);

	//public OmnibusPage manaInfusionRecipesPage(String key, List<RecipeManaInfusion> recipes);

	//public OmnibusPage manaInfusionRecipePage(String key, RecipeManaInfusion recipe);

	//public OmnibusPage elvenTradePage(String key, List<RecipeElvenTrade> recipes);

	//public OmnibusPage elvenTradesPage(String key, RecipeElvenTrade recipe);

	//public OmnibusPage brewPage(String key, String bottomText, RecipeBrew recipe);

	//public OmnibusPage multiblockPage(String key, MultiblockSet mb);

	public IManaNetwork getManaNetworkInstance();

	public ItemStack getSubTileAsStack(String subTile);

	public ItemStack getSubTileAsFloatingFlowerStack(String subTile);

	public String getStackSubTileKey(ItemStack stack);

	//public IIcon getSubTileIconForName(String name);

	//public void registerBasicSignatureIcons(String name, IIconRegister register);

	public boolean shouldForceCheck();

	public int getPassiveFlowerDecay();

	public IInventory getBaublesInventory(EntityPlayer player);

	public void breakOnAllCursors(EntityPlayer player, Item item, ItemStack stack, int x, int y, int z, int side);

	public boolean hasSolegnoliaAround(Entity e);

	@SideOnly(Side.CLIENT)
	public void drawSimpleManaHUD(int color, int mana, int maxMana, String name, ScaledResolution res);

	@SideOnly(Side.CLIENT)
	public void drawComplexManaHUD(int color, int mana, int maxMana, String name, ScaledResolution res, ItemStack bindDisplay, boolean properlyBound);

	//@SideOnly(Side.CLIENT)
	//public ItemStack getBindDisplayForFlowerType(SubTileEntity e);

	@SideOnly(Side.CLIENT)
	public void renderOmnibusText(int x, int y, int width, int height, String unlocalizedText);

	@SideOnly(Side.CLIENT)
	public ResourceLocation getDefaultBossBarTexture();

	//@SideOnly(Side.CLIENT)
	//public void setBossStatus(IBotaniaBoss status);

	public boolean isBuildcraftPipe(TileEntity tile);

	public void sparkleFX(World world, double x, double y, double z, float r, float g, float b, float size, int m);

	public long getWorldElapsedTicks();

	public boolean isBotaniaFlower(World world, int x, int y, int z);

	public void sendBaubleUpdatePacket(EntityPlayer player, int slot);

}
