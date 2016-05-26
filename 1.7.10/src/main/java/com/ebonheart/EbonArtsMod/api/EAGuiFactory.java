package com.ebonheart.EbonArtsMod.api;

import java.util.Set;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;

import com.ebonheart.EbonArtsMod.common.utils.gui.ConfigGui;

import cpw.mods.fml.client.IModGuiFactory;
import cpw.mods.fml.client.IModGuiFactory.RuntimeOptionCategoryElement;
import cpw.mods.fml.client.IModGuiFactory.RuntimeOptionGuiHandler;

public class EAGuiFactory implements IModGuiFactory {

	@Override
	public void initialize(Minecraft minecraftInstance) 
	{
		
	}

	@Override
	public Class<? extends GuiScreen> mainConfigGuiClass() 
	{
		return ConfigGui.class;
	}

	@Override
	public Set<RuntimeOptionCategoryElement> runtimeGuiCategories() 
	{
		return null;
	}

	@Override
	public RuntimeOptionGuiHandler getHandlerFor(RuntimeOptionCategoryElement element) 
	{
		return null;
	}
}
