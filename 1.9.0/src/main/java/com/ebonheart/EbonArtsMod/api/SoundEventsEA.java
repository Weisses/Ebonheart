package com.ebonheart.EbonArtsMod.api;

import com.ebonheart.EbonArtsMod.api.helper.LogHelper;
import com.ebonheart.EbonArtsMod.references.Reference;
import com.ebonheart.EbonArtsMod.references.SoundsEA;

import net.minecraft.client.audio.SoundManager;
import net.minecraft.init.Bootstrap;
//import net.minecraft.init.SoundEvents;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



public class SoundEventsEA extends net.minecraftforge.client.event.sound.SoundEvent
{
    
    public SoundEventsEA(SoundManager manager) {
		super(manager);
		// TODO Auto-generated constructor stub
	}

	public static final SoundEvent record_glowing_disc;


    private static SoundEvent getRegisteredSoundEvent(String id)
    {
        SoundEvent soundevent = (SoundEvent)SoundEvent.soundEventRegistry.getObject(new ResourceLocation(
    //    		Reference.MOD_ID + ":" + "sounds/records/" +
        id));

        
        //LogHelper.warn("MUSIC TEST : " + //(SoundEvent)SoundEvent.soundEventRegistry.getObject(new ResourceLocation(
        		//Reference.MOD_ID + ":" + 
        //id);
        
        if (soundevent == null)
        {
            throw new IllegalStateException("Invalid Sound requested: " + id);
        }
        else
        {
            return soundevent;
        }
    }

    static
    {
        if (!Bootstrap.isRegistered())
        {
            throw new RuntimeException("Accessed Sounds before Bootstrap!");
        }
        else
        {
            
        	
            record_glowing_disc = getRegisteredSoundEvent(//"record_
            		//"glowing_disc"
            		"record.ward"
            		);
            

        }
    }
}