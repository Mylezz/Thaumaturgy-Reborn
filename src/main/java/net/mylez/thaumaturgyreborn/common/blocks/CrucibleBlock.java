package net.mylez.thaumaturgyreborn.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import  net.mylez.thaumaturgyreborn.common.blocks.CrucibleBlock;

import java.util.Map;
import java.util.HashMap;
import java.util.stream.Stream;

public class CrucibleBlock extends BaseHorizontalBlock {
    // MAKE THE SHAPE VARIABLE HAVE THE CLASS NAME!!!!!

    private static final VoxelShape SHAPECrucibleBlock = Stream.of(
            Block.makeCuboidShape(0, 3, 0, 2, 16, 16),
            Block.makeCuboidShape(2, 3, 2, 14, 3, 14),
            Block.makeCuboidShape(14, 3, 0, 16, 16, 16),
            Block.makeCuboidShape(2, 3, 0, 14, 16, 2),
            Block.makeCuboidShape(2, 3, 14, 14, 16, 16),
            Block.makeCuboidShape(0, 0, 0, 3, 3, 2),
            Block.makeCuboidShape(0, 0, 2, 2, 3, 3),
            Block.makeCuboidShape(13, 0, 0, 16, 3, 2),
            Block.makeCuboidShape(14, 0, 2, 16, 3, 3),
            Block.makeCuboidShape(0, 0, 14, 3, 3, 16),
            Block.makeCuboidShape(0, 0, 13, 2, 3, 14),
            Block.makeCuboidShape(13, 0, 14, 16, 3, 16),
            Block.makeCuboidShape(14, 0, 13, 16, 3, 14)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


    public CrucibleBlock(Properties properties) {
        super(properties);
        runCalculation(SHAPECrucibleBlock);
    }
    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.get(HORIZONTAL_FACING));
    }


}
