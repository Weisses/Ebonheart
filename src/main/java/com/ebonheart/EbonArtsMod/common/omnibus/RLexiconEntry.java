/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Aug 16, 2015, 10:52:36 PM (GMT)]
 */
package com.ebonheart.EbonArtsMod.common.omnibus;

import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityClientPlayerMP;
import net.minecraft.stats.Achievement;
import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.LexiconCategory;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class RLexiconEntry  extends BLexiconEntry {

	Achievement a;

	public RLexiconEntry(String unlocalizedName, OmnibusCategory category, Achievement a) {
		super(unlocalizedName, category);
		setKnowledgeType(EbonArtsAPI.relicKnowledge);
		this.a = a;
		if(a != null)
			setIcon(a.theItemStack.copy());
	}

	@Override
	@SideOnly(Side.CLIENT)
	public boolean isVisible() {
		EntityClientPlayerMP player = Minecraft.getMinecraft().thePlayer;
		return a == null || player.capabilities.isCreativeMode || player.getStatFileWriter().hasAchievementUnlocked(a);
	}

}
