package com.ebonheart.EbonArtsMod.init;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraftforge.fml.common.FMLCommonHandler;

import com.ebonheart.EbonArtsMod.AchievementHelper;
import com.ebonheart.EbonArtsMod.EbonArtsMod;

public class EbonArtsAchievements {
	
	public static Achievement mineMysticDust;
	public static Achievement smeltMysticDust;
	public static Achievement craftEbonSigil;
	
	public static void init(){

	mineMysticDust = new Achievement("achievement.mineMysticDust", "mineMysticDust", -1, -1, EbonArtsBlocks.arcanite_ore, (Achievement)null).func_180788_c();
	smeltMysticDust = new Achievement("achievement.smeltMysticDust", "smeltMysticDust", -3, -1, EbonArtsBlocks.arcanite_ore, mineMysticDust).func_180788_c();
	craftEbonSigil = new Achievement("achievement.craftEbonSigil", "craftEbonSigil", -5, -2, EbonArtsBlocks.arcanite_ore, mineMysticDust).func_180788_c();
	
	//public static final Achievement dust = new Achievement(200, "Dusttt", 12, 0, Items.apple, null).registerAchievement().setIndependent();
	
	
	FMLCommonHandler.instance().bus().register(new AchievementHelper());
	}
}
