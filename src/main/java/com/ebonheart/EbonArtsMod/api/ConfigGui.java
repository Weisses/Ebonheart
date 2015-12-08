package com.ebonheart.EbonArtsMod.api;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.Reference;

public class ConfigGui extends GuiConfig {

	public ConfigGui(GuiScreen screen) {
		super(screen, new ConfigElement(EbonArtsMod.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Reference.MOD_NAME, false, true, GuiConfig.getAbridgedConfigPath(EbonArtsMod.config.toString()));
		if(EbonArtsMod.config.hasChanged())
		{
			EbonArtsMod.config.save();
		}
	}
	
	
}
