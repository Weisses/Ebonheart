package com.ebonheart.EbonArtsMod.common.items.tools;

import java.util.List;

import com.ebonheart.EbonArtsMod.common.entity.EntityAirship;
import com.ebonheart.EbonArtsMod.common.items.ItemHelper;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBoat;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

public class ItemAirshiptest extends ItemBoat {
		
		
	   
	    public ItemAirshiptest(EntityBoat.Type typeIn)
	    {
	        super(typeIn);
	        this.setUnlocalizedName("ebon_airship");
	        ItemHelper.setItemName(this, "ebon_airship");
	        
	    }

	
}
