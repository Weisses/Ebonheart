package com.ebonheart.EbonArtsMod.common.blocks.devices;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class ItemDoor extends Item
{
    private Block block;
    private static final String __OBFID = "CL_00000020";

    public ItemDoor(Block block)
    {
        this.block = block;
        this.setCreativeTab(CreativeTabs.REDSTONE);
    }

    /**
     * Called when a Block is right-clicked with this Item
     *  
     * @param pos The block being right-clicked
     * @param side The side being right-clicked
     */
    public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ)
    {
        if (side != EnumFacing.UP)
        {
            return false;
        }
        else
        {
            IBlockState iblockstate = worldIn.getBlockState(pos);
            Block block = iblockstate.getBlock();

            if (!block.isReplaceable(worldIn, pos))
            {
                pos = pos.offset(side);
            }

            if (!playerIn.canPlayerEdit(pos, side, stack))
            {
                return false;
            }
            else if (!this.block.canPlaceBlockAt(worldIn, pos))
            {
                return false;
            }
            else
            {
                placeDoor(worldIn, pos, EnumFacing.fromAngle((double)playerIn.rotationYaw), this.block, iblockstate);
                --stack.stackSize;
                return true;
            }
        }
    }

    public static void placeDoor(World worldIn, BlockPos pos, EnumFacing facing, Block door, IBlockState state)
    {
        BlockPos blockpos1 = pos.offset(facing.rotateY());
        BlockPos blockpos2 = pos.offset(facing.rotateYCCW());
        int i = (worldIn.getBlockState(blockpos2).getBlock().isNormalCube(state) ? 1 : 0) + (worldIn.getBlockState(blockpos2.up()).getBlock().isNormalCube(state) ? 1 : 0);
        int j = (worldIn.getBlockState(blockpos1).getBlock().isNormalCube(state) ? 1 : 0) + (worldIn.getBlockState(blockpos1.up()).getBlock().isNormalCube(state) ? 1 : 0);
        boolean flag = worldIn.getBlockState(blockpos2).getBlock() == door || worldIn.getBlockState(blockpos2.up()).getBlock() == door;
        boolean flag1 = worldIn.getBlockState(blockpos1).getBlock() == door || worldIn.getBlockState(blockpos1.up()).getBlock() == door;
        boolean flag2 = false;

        if (flag && !flag1 || j > i)
        {
            flag2 = true;
        }

        BlockPos blockpos3 = pos.up();
        IBlockState iblockstate = door.getDefaultState().withProperty(EABlockDoor.FACING, facing).withProperty(EABlockDoor.HINGE, flag2 ? EABlockDoor.EnumHingePosition.RIGHT : EABlockDoor.EnumHingePosition.LEFT);
        worldIn.setBlockState(pos, iblockstate.withProperty(EABlockDoor.HALF, EABlockDoor.EnumDoorHalf.LOWER), 2);
        worldIn.setBlockState(blockpos3, iblockstate.withProperty(EABlockDoor.HALF, EABlockDoor.EnumDoorHalf.UPPER), 2);
        worldIn.notifyNeighborsOfStateChange(pos, door);
        worldIn.notifyNeighborsOfStateChange(blockpos3, door);
    }
}