package com.ebonheart.EbonArtsMod.common.omnibus;

import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.LexiconCategory;

public class ALexiconEntry extends BLexiconEntry {

	public ALexiconEntry(String unlocalizedName, OmnibusCategory category) {
		super(unlocalizedName, category);
		setKnowledgeType(EbonArtsAPI.elvenKnowledge);
	}

}
