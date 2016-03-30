package com.ebonheart.EbonArtsMod.api;

import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.player.PlayerEvent;

//public class ItemPickupEvent {



public class ItemPickupEvent extends PlayerEvent {
	public EntityPlayer player;
    public final EntityItem pickedUp;
    public ItemPickupEvent(EntityPlayer player, EntityItem pickedUp)
    {
        super(player);
        this.pickedUp = pickedUp;
    }
    
    private void PlayerEvent(EntityPlayer player)
    {
        this.player = player;
    }
}

