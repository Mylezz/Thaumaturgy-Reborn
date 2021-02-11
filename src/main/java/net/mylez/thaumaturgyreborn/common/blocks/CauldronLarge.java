package net.mylez.thaumaturgyreborn.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class CauldronLarge extends BaseHorizontalBlockCauldronLarge {
// MAKE THE SHAPE VARIABLE HAVE THE CLASS NAME!!!!!
    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(2, 1, 2, 14, 2, 14),
            Block.makeCuboidShape(3, 1, 14, 13, 2, 15),
            Block.makeCuboidShape(3, 2, 14, 13, 7, 15),
            Block.makeCuboidShape(3, 9, 14, 13, 10, 15),
            Block.makeCuboidShape(3, 1, 1, 13, 2, 2),
            Block.makeCuboidShape(3, 2, 1, 13, 7, 2),
            Block.makeCuboidShape(3, 9, 1, 13, 10, 2),
            Block.makeCuboidShape(14, 1, 3, 15, 2, 13),
            Block.makeCuboidShape(14, 2, 3, 15, 7, 13),
            Block.makeCuboidShape(14, 9, 3, 15, 10, 13),
            Block.makeCuboidShape(1, 1, 3, 2, 2, 13),
            Block.makeCuboidShape(1, 2, 3, 2, 7, 13),
            Block.makeCuboidShape(1, 9, 3, 2, 10, 13),
            Block.makeCuboidShape(2, 7, 3, 3, 9, 13),
            Block.makeCuboidShape(13, 7, 3, 14, 9, 13),
            Block.makeCuboidShape(3, 7, 13, 13, 9, 14),
            Block.makeCuboidShape(3, 7, 2, 13, 9, 3),
            Block.makeCuboidShape(13, 2, 13, 14, 7, 14),
            Block.makeCuboidShape(13, 9, 13, 14, 11, 14),
            Block.makeCuboidShape(13, 2, 2, 14, 7, 3),
            Block.makeCuboidShape(13, 9, 2, 14, 11, 3),
            Block.makeCuboidShape(2, 2, 2, 3, 7, 3),
            Block.makeCuboidShape(2, 9, 2, 3, 11, 3),
            Block.makeCuboidShape(2, 2, 13, 3, 7, 14),
            Block.makeCuboidShape(2, 9, 13, 3, 11, 14),
            Block.makeCuboidShape(1.5, 10.199999999999996, 12.5, 3.5, 11.199999999999996, 14.5),
            Block.makeCuboidShape(12.5, 10.199999999999996, 12.5, 14.5, 11.199999999999996, 14.5),
            Block.makeCuboidShape(1.5, 10.199999999999996, 1.5, 3.5, 11.199999999999996, 3.5),
            Block.makeCuboidShape(12.5, 10.199999999999996, 1.5, 14.5, 11.199999999999996, 3.5),
            Block.makeCuboidShape(4.267766952966367, 9.974873734152919, 13, 5.267766952966367, 16.674873734152918, 14),
            Block.makeCuboidShape(11.74488546339388, 10.392246570962087, 13, 12.74488546339388, 17.092246570962086, 14),
            Block.makeCuboidShape(4.267766952966367, 9.974873734152919, 2, 5.267766952966367, 16.674873734152918, 3),
            Block.makeCuboidShape(11.74488546339388, 10.392246570962087, 2, 12.74488546339388, 17.092246570962086, 3)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


    public CauldronLarge(Properties properties) {
        super(properties);
        runCalculation(SHAPE);
    }
    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.get(HORIZONTAL_FACING));
    }


}
