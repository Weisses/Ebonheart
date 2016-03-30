package com.ebonheart.EbonArtsMod.references;

import com.ebonheart.EbonArtsMod.api.SoundEventsEA;

import net.minecraft.init.Bootstrap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;


public class SoundsEA {

	//public static final SoundEvent test;
    
    //public static final SoundEventEA entity_creeper_death;
    //public static final SoundEventEA entity_creeper_hurt;
    //public static final SoundEventEA entity_creeper_primed;
    
    //public static final SoundEventEA block_enderchest_close;
    //public static final SoundEventEA block_enderchest_open;
    
    //public static final SoundEventEA item_firecharge_use;
    
    //public static final SoundEventEA music_creative;
    
    //public static final SoundEventEA record_11;
    
    //public static final SoundEventEA ui_button_click;
    
    //public static final SoundEventEA weather_rain;
	
	//public static final SoundEventEA records_dismal;
    
    
    

    private static SoundEventsEA getRegisteredSoundEvent(String id)
    {
        SoundEventsEA soundevent = (SoundEventsEA)SoundEventsEA.SoundEventEARegistry.getObject(new ResourceLocation(id));

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
            
            //entity_creeper_death = getRegisteredSoundEvent("entity.creeper.death");
            //entity_creeper_hurt = getRegisteredSoundEvent("entity.creeper.hurt");
            //entity_creeper_primed = getRegisteredSoundEvent("entity.creeper.primed");
            
            //block_enderchest_close = getRegisteredSoundEvent("block.enderchest.close");
            //block_enderchest_open = getRegisteredSoundEvent("block.enderchest.open");
            
            //item_firecharge_use = getRegisteredSoundEvent("item.firecharge.use");
            
            //music_creative = getRegisteredSoundEvent("music.creative");
            
            //record_11 = getRegisteredSoundEvent("record.11");
            
            //ui_button_click = getRegisteredSoundEvent("ui.button.click");
            
            //weather_rain = getRegisteredSoundEvent("weather.rain");
            
            
            
            
            
        }
    }
}