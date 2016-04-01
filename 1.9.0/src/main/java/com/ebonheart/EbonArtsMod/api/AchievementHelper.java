package com.ebonheart.EbonArtsMod.api;

import java.util.ArrayList;
import java.util.List;

import com.ebonheart.EbonArtsMod.init.InitAchievementsEA;
import com.ebonheart.EbonArtsMod.init.InitItemsEA;
import com.google.common.collect.Lists;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Achievement;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.PlayerEvent;

public class AchievementHelper extends Achievement {
	
	public static List<Achievement> achievements = Lists.<Achievement>newArrayList();
	//List<Achievement> achievements = new ArrayList();
	
	public AchievementHelper(String name, int column, int row, ItemStack icon, Achievement parent) 
	{
		super("achievement.ea:" + name, "ea:" + name, column, row, icon, parent);
		achievements.add(this);
		registerStat();
	}

	public AchievementHelper(String name, int x, int y, Item icon, Achievement parent) 
	{
		this(name, x, y, new ItemStack(icon), parent);
	}

	public AchievementHelper(String name, int x, int y, Block icon, Achievement parent) 
	{
		this(name, x, y, new ItemStack(icon), parent);
	}
}
