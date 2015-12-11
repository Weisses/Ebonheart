/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [04/12/2015, 18:29:56 (GMT)]
 */
package com.ebonheart.EbonArtsMod.api.omnibus;

import java.util.Queue;

import net.minecraftforge.fml.common.eventhandler.Event;

//import cpw.mods.fml.common.eventhandler.Event;

/**
 * Fired when the Lexica Botania's tutorial is started. You can add your
 * own entries to the tutorial here. Please use this responsibly.
 */
public class BotaniaTutorialStartEvent extends Event {

	public final Queue<OmnibusEntry> tutorial;

	public BotaniaTutorialStartEvent(Queue<OmnibusEntry> tutorial) {
		this.tutorial = tutorial;
	}

}
