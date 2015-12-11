package com.ebonheart.EbonArtsMod.api.omnibus;

import net.minecraft.item.ItemStack;

/**
 * Basic interface for the Lexica Botania.
 */
public interface IOmnibus {

	/**
	 * Gets if a specific knowledge is unlocked. Check the knowledge types in
	 * BotaniaAPI.
	 */
	public boolean isKnowledgeUnlocked(ItemStack stack, KnowledgeType knowledge);

	/**
	 * Unlocks a specfic type of knowledge.
	 */
	public void unlockKnowledge(ItemStack stack, KnowledgeType knowledge);

}
