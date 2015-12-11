/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Mar 2, 2015, 6:27:58 PM (GMT)]
 */
package com.ebonheart.EbonArtsMod.client.gui.omnibus;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.StatCollector;

import com.ebonheart.EbonArtsMod.api.omnibus.IOmnibus;
import com.ebonheart.EbonArtsMod.api.omnibus.OmnibusEntry;
//import vazkii.botania.api.lexicon.ILexicon;
//import vazkii.botania.api.lexicon.LexiconEntry;

public class GuiOmnibusHistory extends GuiOmnibusIndex {

	public static List<OmnibusEntry> history = new ArrayList();

	public GuiOmnibusHistory() {
		super(null);
		title = StatCollector.translateToLocal("botaniamisc.historyLong");
	}

	@Override
	void buildEntries() {
		entriesToDisplay.clear();
		IOmnibus lex = (IOmnibus) stackUsed.getItem();
		for(int i = history.size() - 1; i >= 0; i--) {
			OmnibusEntry entry = history.get(i);
			if(lex.isKnowledgeUnlocked(stackUsed, entry.getKnowledgeType()) && StatCollector.translateToLocal(entry.getUnlocalizedName()).toLowerCase().contains(searchField.getText().toLowerCase().trim()))
				entriesToDisplay.add(entry);
		}
	}

	public static void visit(OmnibusEntry entry) {
		if(history.contains(entry))
			history.remove(entry);
		history.add(entry);
	}

	@Override
	public GuiOmnibus copy() {
		return new GuiOmnibusHistory();
	}

	@Override
	public void load(NBTTagCompound cmp) {
		// NO-OP
	}

	@Override
	public String getNotesKey() {
		return "history";
	}

}
