package com.ebonheart.EbonArtsMod.api;

import com.ebonheart.EbonArtsMod.references.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.RegistryNamespaced;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SoundEventEA
{
    public static final RegistryNamespaced<ResourceLocation, SoundEventEA> SoundEventEARegistry = new RegistryNamespaced();
    private final ResourceLocation soundName;
    private static int SoundEventEAId = 0;

    public SoundEventEA(ResourceLocation soundNameIn)
    {
        this.soundName = soundNameIn;
    }
    
    @SideOnly(Side.CLIENT)
    public ResourceLocation getSoundName()
    {
        return this.soundName;
    }
    
    //@SideOnly(Side.CLIENT)
    //public ResourceLocation getSoundName()
    //{
    	//ResourceLocation location = super.getRecordResource(Reference.MOD_ID + ":" + this.soundName);
		//return location;
        //return this.soundName;
    //}

    public static void registerSounds()
    {
        //registerSound("record.13");
        //registerSound("record.blocks");
        //registerSound("record.cat");
        //registerSound("record.chirp");
        //registerSound("record.far");
        //registerSound("record.mall");
        //registerSound("record.mellohi");
        //registerSound("record.stal");
        //registerSound("record.strad");
        //registerSound("record.wait");
        registerSound("records.glowing_disc");
        
    }

    private static void registerSound(String soundNameIn)
    {
        ResourceLocation resourcelocation = new ResourceLocation(soundNameIn);
        SoundEventEARegistry.register(SoundEventEAId++, resourcelocation, new SoundEventEA(resourcelocation));
    }
}
