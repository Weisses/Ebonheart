/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Aug 27, 2015, 7:34:43 PM (GMT)]
 */
package com.ebonheart.EbonArtsMod.common.omnibus;

import vazkii.botania.api.lexicon.LexiconCategory;

public class HLexiconEntry extends ALexiconEntry {

	public HLexiconEntry(String unlocalizedName, OmnibusCategory category) {
		super(unlocalizedName, category);
	}

	@Override
	public String getWebLink() {
		return "http://heads.freshcoal.com/usernames.php";
	}

}
