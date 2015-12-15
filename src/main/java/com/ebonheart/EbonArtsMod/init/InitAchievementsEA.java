package com.ebonheart.EbonArtsMod.init;

import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.common.AchievementPage;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.Reference;
import com.ebonheart.EbonArtsMod.api.AchievementHelper;
import com.ebonheart.EbonArtsMod.common.AchievementsEA;

public class InitAchievementsEA 
{
	
	
	public static AchievementPage ebon_arts_page;
	public static int pageIndex;
	
	public static Achievement alchemical_compendium;
	public static Achievement mine_draconium_ore;
	public static Achievement mine_velious_ore;
	public static Achievement mine_arcanite_ore;
	public static Achievement mine_katcheen_ore;
	public static Achievement mine_necrocite_ore;
	public static Achievement mine_soularite_ore;
	public static Achievement mine_ebon_ore;
	//public static Achievement smeltMysticDust;
	//public static Achievement craftEbonSigil;
	
	public static void init()
	{
		
		//alchemical_compendium = new AchievementHelper(Reference.ALCHEMICAL_COMPENDIUM, 0, 0, InitItemsEA.alchemical_compendium, (Achievement)null).setSpecial();//.setSpecial() makes spikes, they are the hard to get achievements
		
		mine_draconium_ore = new AchievementHelper(Reference.MINE_DRACONIUM_ORE, -2, -1, InitBlocksEA.draconium_ore, (Achievement)null);//.func_180788_c();
		mine_velious_ore = new AchievementHelper(Reference.MINE_VELIOUS_ORE, -3, 0, InitBlocksEA.velious_ore, (Achievement)null);//.func_180788_c();
		mine_arcanite_ore = new AchievementHelper(Reference.MINE_ARCANITE_ORE, 2, -1, InitBlocksEA.arcanite_ore, (Achievement)null);//.func_180788_c();
		mine_katcheen_ore = new AchievementHelper(Reference.MINE_KATCHEEN_ORE, 3, 0, InitBlocksEA.katcheen_ore, (Achievement)null);//.func_180788_c();
		mine_necrocite_ore = new AchievementHelper(Reference.MINE_NECROCITE_ORE, -2, 1, InitBlocksEA.necrocite_ore, (Achievement)null);//.func_180788_c();
		mine_soularite_ore = new AchievementHelper(Reference.MINE_SOULARITE_ORE, 2, 1, InitBlocksEA.soularite_ore, (Achievement)null);//.func_180788_c();
		
		mine_ebon_ore = new AchievementHelper(Reference.MINE_EBON_ORE, 0, 2, InitBlocksEA.ebon_ore, (Achievement)null).setSpecial();//.func_180788_c();
		
	//mine_arcanite_ore = new Achievement("achievement.mine_arcanite_ore", "mine_arcanite_ore", -1, -1, InitItemsEA.arcanite, (Achievement)null).func_180788_c();
	//smeltMysticDust = new Achievement("achievement.smeltMysticDust", "smeltMysticDust", -3, -1, EbonArtsBlocks.arcanite_ore, mineMysticDust).func_180788_c();
	//craftEbonSigil = new Achievement("achievement.craftEbonSigil", "craftEbonSigil", -5, -2, EbonArtsBlocks.arcanite_ore, mineMysticDust).func_180788_c();
	
	//public static final Achievement dust = new Achievement(200, "Dusttt", 12, 0, Items.apple, null).registerAchievement().setIndependent();
	
	
	
	
	
		
		pageIndex = AchievementPage.getAchievementPages().size();
		ebon_arts_page = new AchievementPage(Reference.MOD_NAME, AchievementHelper.achievements.toArray(new Achievement[AchievementHelper.achievements.size()]));
		AchievementPage.registerAchievementPage(ebon_arts_page);
	
	FMLCommonHandler.instance().bus().register(new AchievementsEA());
	}
	
	
	
	
}
