/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Jan 14, 2014, 6:17:06 PM (GMT)]
 */
package com.ebonheart.EbonArtsMod.api.omnibus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.ebonheart.EbonArtsMod.api.EbonArtsAPI;

import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
//import vazkii.botania.api.BotaniaAPI;
//import cpw.mods.fml.relauncher.Side;
//import cpw.mods.fml.relauncher.SideOnly;

public class OmnibusEntry implements Comparable<OmnibusEntry> {

	public final String unlocalizedName;
	public final OmnibusCategory category;

	private KnowledgeType type = EbonArtsAPI.basicKnowledge;

	public List<OmnibusPage> pages = new ArrayList<OmnibusPage>();
	private boolean priority = false;
	private ItemStack icon = null;

	/**
	 * @param unlocalizedName The unlocalized name of this entry. This will be localized by the client display.
	 */
	public OmnibusEntry(String unlocalizedName, OmnibusCategory category) {
		this.unlocalizedName = unlocalizedName;
		this.category = category;
	}

	/**
	 * Sets this page as prioritized, as in, will appear before others in the lexicon.
	 */
	public OmnibusEntry setPriority() {
		priority = true;
		return this;
	}

	/**
	 * Sets the Knowledge type of this entry.
	 */
	public OmnibusEntry setKnowledgeType(KnowledgeType type) {
		this.type = type;
		return this;
	}

	public KnowledgeType getKnowledgeType() {
		return type;
	}

	/**
	 * Sets the display icon for this entry. Overriding the one already there. When adding recipe pages to the
	 * entry, this will be called once for the result of the first found recipe.
	 */
	public void setIcon(ItemStack stack) {
		icon = stack;
	}

	public ItemStack getIcon() {
		return icon;
	}

	public boolean isPriority() {
		return priority;
	}

	public String getUnlocalizedName() {
		return unlocalizedName;
	}

	public String getTagline() {
		return null; // Override this if you want a tagline. You probably do
	}

	@SideOnly(Side.CLIENT)
	public boolean isVisible() {
		return true;
	}

	/**
	 * Sets what pages you want this entry to have.
	 */
	public OmnibusEntry setLexiconPages(OmnibusPage... pages) {
		this.pages.addAll(Arrays.asList(pages));

		for(int i = 0; i < this.pages.size(); i++) {
			OmnibusPage page = this.pages.get(i);
			if(!page.skipRegistry)
				page.onPageAdded(this, i);
		}

		return this;
	}

	/**
	 * Returns the web link for this entry. If this isn't null, looking at this entry will
	 * show a "View Online" button in the book. The String returned should be the URL to
	 * open when the button is clicked.
	 */
	public String getWebLink() {
		return null;
	}

	/**
	 * Adds a page to the list of pages.
	 */
	public void addPage(OmnibusPage page) {
		pages.add(page);
	}

	public final String getNameForSorting() {
		return (priority ? 0 : 1) + StatCollector.translateToLocal(getUnlocalizedName());
	}

	public List<ItemStack> getDisplayedRecipes() {
		ArrayList<ItemStack> list = new ArrayList();
		for(OmnibusPage page : pages) {
			List<ItemStack> l = page.getDisplayedRecipes();

			if(l != null) {
				ArrayList<ItemStack> itemsAddedThisPage = new ArrayList();

				for(ItemStack s : l) {
					addItem: {
					for(ItemStack s1 : itemsAddedThisPage)
						if(s1.getItem() == s.getItem())
							break addItem;
					for(ItemStack s1 : list)
						if(s1.isItemEqual(s) && ItemStack.areItemStackTagsEqual(s1, s))
							break addItem;

					itemsAddedThisPage.add(s);
					list.add(s);
				}
				}
			}
		}

		return list;
	}

	@Override
	public int compareTo(OmnibusEntry o) {
		return getNameForSorting().compareTo(o.getNameForSorting());
	}

}