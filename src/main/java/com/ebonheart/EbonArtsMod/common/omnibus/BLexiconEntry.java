/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Jan 14, 2014, 9:47:21 PM (GMT)]
 */
package com.ebonheart.EbonArtsMod.common.omnibus;

import vazkii.botania.api.BotaniaAPI;
import vazkii.botania.api.lexicon.ITwoNamedPage;
import vazkii.botania.api.lexicon.LexiconCategory;
import vazkii.botania.api.lexicon.LexiconEntry;
import vazkii.botania.api.lexicon.LexiconPage;

public class BLexiconEntry extends OmnibusEntry {

	public BLexiconEntry(String unlocalizedName, OmnibusCategory category) {
		super(unlocalizedName, category);
		EbonArtsAPI.addEntry(this, category);
	}

	@Override
	public OmnibusEntry setLexiconPages(OmnibusPage... pages) {
		for(OmnibusPage page : pages) {
			page.unlocalizedName = "botania.page." + getLazyUnlocalizedName() + page.unlocalizedName;
			if(page instanceof ITwoNamedPage) {
				ITwoNamedPage dou = (ITwoNamedPage) page;
				dou.setSecondUnlocalizedName("botania.page." + getLazyUnlocalizedName() + dou.getSecondUnlocalizedName());
			}
		}

		return super.setLexiconPages(pages);
	}

	@Override
	public String getUnlocalizedName() {
		return "botania.entry." + super.getUnlocalizedName();
	}

	@Override
	public String getTagline() {
		return "botania.tagline." + super.getUnlocalizedName();
	}

	public String getLazyUnlocalizedName() {
		return super.getUnlocalizedName();
	}

	@Override
	public String getWebLink() {
		return "http://botaniamod.net/lexicon.php#" + unlocalizedName;
	}

	@Override
	public int compareTo(OmnibusEntry o) {
		return o instanceof WLexiconEntry ? 1 : super.compareTo(o);
	}

}
