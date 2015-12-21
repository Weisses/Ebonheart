package com.ebonheart.EbonArtsMod.common.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityEbonheart extends EntityThrowable
{
    //private static final String __OBFID = "CL_00001726";

    public EntityEbonheart(World worldIn)
    {
        super(worldIn);
    }

    public EntityEbonheart(World worldIn, EntityLivingBase p_i1786_2_)
    {
        super(worldIn, p_i1786_2_);
    }

    public EntityEbonheart(World worldIn, double p_i1787_2_, double p_i1787_4_, double p_i1787_6_)
    {
        super(worldIn, p_i1787_2_, p_i1787_4_, p_i1787_6_);
    }

    /**
     * Gets the amount of gravity to apply to the thrown entity with each tick.
     */
    protected float getGravityVelocity()
    {
        return 0.07F;
    }

    protected float getVelocity()
    {
        return 0.7F;
    }

    protected float getInaccuracy()
    {
        return -20.0F;
    }

    /** 
     * Called when this EntityThrowable hits a block or entity.
     */
    protected void onImpact(MovingObjectPosition p_70184_1_)
    {
        if (!this.worldObj.isRemote)
        {
            this.worldObj.playAuxSFX(2002, new BlockPos(this), 0);
            int i = 3 + this.worldObj.rand.nextInt(15) + this.worldObj.rand.nextInt(15);

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