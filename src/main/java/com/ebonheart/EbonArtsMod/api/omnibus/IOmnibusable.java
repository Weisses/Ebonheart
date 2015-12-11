/**
 * This class was created by <Vazkii>. It's distributed as
 * part of the Botania Mod. Get the Source Code in github:
 * https://github.com/Vazkii/Botania
 * 
 * Botania is Open Source and distributed under the
 * Botania License: http://botaniamod.net/license.php
 * 
 * File Created @ [Jan 20, 2014, 7:05:44 PM (GMT)]
 */
package com.ebonheart.EbonArtsMod.api.omnibus;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

/**
 * Any block that implements this can be right clicked with
 * a Lexica Botania to open a entry page.
 */
public interface IOmnibusable {

	/**
	 * Gets the lexicon entry to open at this location. null works too.
	 */
	public OmnibusEntry getEntry(World world, int x, int y, int z, EntityPlayer player, ItemStack lexicon);

}
