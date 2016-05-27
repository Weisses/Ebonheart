package com.ebonheart.EbonArtsMod.common.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

public class EntityEnchantedEbonheart extends EntityThrowable {
	
    public EntityEnchantedEbonheart(World worldIn)
    {
        super(worldIn);
    }

    public EntityEnchantedEbonheart(World worldIn, EntityLivingBase entity)
    {
        super(worldIn, entity);
    }

    public EntityEnchantedEbonheart(World worldIn, double x, double y, double z)
    {
        super(worldIn, x, y, z);
    }

    /**
     * Gets the amount of gravity to apply to the thrown entity with each tick.
     */
    protected float getGravityVelocity()
    {
        return 0.07F;
    }

    protected float func_70182_d()
    {
        return 0.7F;
    }

    protected float func_70183_g()
    {
        return -20.0F;
    }

    
    /**
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition p_70184_1_)
    {
    	if (this.worldObj.isRemote)
    	{
    		for (int ii = 0; ii < 6; ++ii)
            {
            	EbonArtsMod.proxy.generateEnchEbonParticles(this);
            }
    	}
        if (!this.worldObj.isRemote)
        {
            this.worldObj.playAuxSFX(2002, (int)Math.round(this.posX), (int)Math.round(this.posY), (int)Math.round(this.posZ), 0);
            int i = 3 + this.worldObj.rand.nextInt(5) + this.worldObj.rand.nextInt(5);

            while (i > 0)
            {
                int j = EntityXPOrb.getXPSplit(i);
                i -= j;
                this.worldObj.spawnEntityInWorld(new EntityXPOrb(this.worldObj, this.posX, this.posY, this.posZ, j));
            }

            this.setDead();
        }
    }
    
}