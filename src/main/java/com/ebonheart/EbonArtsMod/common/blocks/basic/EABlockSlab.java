/**
 * Copyright (C) Jon Rowlett. All rights reserved.
 */
package com.ebonheart.EbonArtsMod.common.blocks.basic;

import com.ebonheart.EbonArtsMod.EbonArtsMod;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * A slab or double slab of stained bricks of a certain color.
 */
public abstract class EABlockSlab extends BlockSlab {
	
	//The property used for the variant. Needed for interactions with ItemSlab.
    private static final PropertyBool VARIANT_PROPERTY =
        PropertyBool.create("variant");

	//The ID for the registry.
    private static final String ID = "slab";

    //Hardness value for the material.
    private static final float HARDNESS = 2.0f;

    //Resistance value for the material.
    private static final float RESISTANCE = 10.0f;

    //The bit in metadata used by the half property.
    private static final int HALF_META_BIT = 8;

    public EABlockSlab() {
        super(Material.rock);
        this.useNeighborBrightness = !this.isDouble();
        this.setHardness(HARDNESS);
        this.setResistance(RESISTANCE);
        this.setStepSound(soundTypePiston);
        
        if (!this.isDouble()) 
        {
            setCreativeTab(EbonArtsMod.tabEbonArtsBlocks);
        }

        IBlockState blockState = this.blockState.getBaseState();
        blockState = blockState.withProperty(VARIANT_PROPERTY, false);
        if (!this.isDouble()) 
        {
            blockState = blockState.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }
        this.setDefaultState(blockState);
    }


    /**
     * Gets the unlocalized name based on metadata/damage.
     * @param metadata block metadata.
     * @return the unlocalized name.
     */
    @Override
    public final String getUnlocalizedName(final int metadata) {
        return this.getUnlocalizedName();
    }

    /**
     * Gets the value of the variant property based on the item.
     * @param itemStack item stack.
     * @return the variant value null.
     */
    @Override
    public final Object getVariant(final ItemStack itemStack) {
        return false;
    }

    /**
     * Gets the variant property.
     * @return the variant property null.
     */
    @Override
    public final IProperty getVariantProperty() {
        return VARIANT_PROPERTY;
    }

    /**
     * Gets a block state from metadata.
     * @param meta the metadata or color value.
     * @return a block state with the meta encoded as the variant property.
     */
    @Override
    public final IBlockState getStateFromMeta(final int meta) {
        IBlockState blockState = this.getDefaultState();
        blockState = blockState.withProperty(VARIANT_PROPERTY, false);
        if (!this.isDouble()) {
            EnumBlockHalf value = EnumBlockHalf.BOTTOM;
            if ((meta & HALF_META_BIT) != 0) {
                value = EnumBlockHalf.TOP;
            }

            blockState = blockState.withProperty(HALF, value);
        }

        return blockState;
    }

    /**
     * Gets the metadata value from a block state.
     * @param state the block state.
     * @return the metadata or color value.
     */
    @Override
    public final int getMetaFromState(final IBlockState state) {
        if (this.isDouble()) {
           return 0;
        }

        if ((EnumBlockHalf) state.getValue(HALF) == EnumBlockHalf.TOP) {
            return HALF_META_BIT;
        } else {
            return 0;
        }
    }

    /**
     * Gets the damage for the block's item when dropped.
     * @param state the block's state.
     * @return the metadata or color value.
     */
    @Override
    public final int damageDropped(final IBlockState state) {
        return 0;
    }

    
    
    
    /**
     * Gets the item dropped when the block is broken.
     * @param blockState the block's state.
     * @param random the random number generator
     * @param unused an integer.
     * @return the half slab item.
     */
    @Override
    public final Item getItemDropped(final IBlockState blockState, final java.util.Random random, final int unused) 
    {
        String blockId = this.innerGetId(false);
        return GameUtility.getItemFromBlock(blockId);
    }

    /**
     * Gets the item dropped when the block is broken.
     * @param world the world
     * @param blockPos the block position.
     * @return the item dropped, the half slab.
     */
    @SideOnly(Side.CLIENT)
    @Override
    public final net.minecraft.item.Item getItem(
        final net.minecraft.world.World world,
        final net.minecraft.util.BlockPos blockPos) {
        String blockId = this.innerGetId(false);
        return GameUtility.getItemFromBlock(blockId);
    }

    
    //public abstract void registerInventoryModel(final Item item, final String id, final int metadata);

        /**
         * Helper to add a model variant in the ModelBakery.
         * @param item the main item.
         * @param variantName the variant name.
         */
        //public abstract void addModelBakeryVariant(final Item item, final String variantName);
    
    
    


    /**
     * Creates the block state object.
     * @return the block state with properties defined.
     */
    @Override
    protected final BlockState createBlockState() {
        if (this.isDouble()) {
            return new BlockState(this, new IProperty[] {VARIANT_PROPERTY});
        } else {
            return new BlockState(
                this,
                new IProperty[] {VARIANT_PROPERTY, HALF});
        }
    }

    /**
     * Gets the ID of the block.
     * @param isDoubleStacked override the isDouble() method.
     * @return the unique block id.
     */
    private String innerGetId(final boolean isDoubleStacked) {
        String result = "";
        if (isDoubleStacked) {
            result = "double_";
        }

        //return result + ID + '_' + ColorUtility.COLOR_IDS[this.color];
        return result + ID;
    }
}
