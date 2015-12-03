package com.ebonheart.EbonArtsMod.init;

import net.minecraft.init.Items;
import net.minecraft.stats.Achievement;
import net.minecraft.stats.AchievementList;
import net.minecraftforge.fml.common.FMLCommonHandler;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.api.AchievementHelper;

public class InitAchievementsEA 
{
	

	
	public static Achievement mine_arcanite_shard;
	//public static Achievement smeltMysticDust;
	//public static Achievement craftEbonSigil;
	
	public static void init()
	{

	mine_arcanite_shard = new Achievement("achievement.mine_arcanite_shard", "mine_arcanite_shard", -1, -1, InitItemsEA.arcanite_shard, (Achievement)null).func_180788_c();
	//smeltMysticDust = new Achievement("achievement.smeltMysticDust", "smeltMysticDust", -3, -1, EbonArtsBlocks.arcanite_ore, mineMysticDust).func_180788_c();
	//craftEbonSigil = new Achievement("achievement.craftEbonSigil", "craftEbonSigil", -5, -2, EbonArtsBlocks.arcanite_ore, mineMysticDust).func_180788_c();
	
	//public static final Achievement dust = new Achievement(200, "Dusttt", 12, 0, Items.apple, null).registerAchievement().setIndependent();
	
	
	FMLCommonHandler.instance().bus().register(new AchievementHelper());
	}
}
