package com.ebonheart.EbonArtsMod.api;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

import com.ebonheart.EbonArtsMod.EbonArtsMod;
import com.ebonheart.EbonArtsMod.init.InitRecipesEA;
import com.ebonheart.EbonArtsMod.references.Reference;

public class ConfigGui extends GuiConfig {

	public ConfigGui(GuiScreen screen) 
	{
		super(screen, new ConfigElement(EbonArtsMod.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), Reference.MOD_NAME, true, true, GuiConfig.getAbridgedConfigPath(EbonArtsMod.config.toString()));
		
		if(EbonArtsMod.config.hasChanged())
		{
			EbonArtsMod.config.save();
		}
	}
	
	@Override
	public void onGuiClosed()
	{
		this.entryList.onGuiClosed();
		
		if (this.configID != null && this.parentScreen instanceof GuiConfig)
		{
			GuiConfig parentGuiConfig = (GuiConfig) this.parentScreen;
			parentGuiConfig.needsRefresh = true;
			parentGuiConfig.initGui();
		}
		
		if (!(this.parentScreen instanceof GuiConfig))
			Keyboard.enableRepeatEvents(false);
			
		if(EbonArtsMod.config.hasChanged())
		{
			EbonArtsMod.config.save();	
		}
	}
}
