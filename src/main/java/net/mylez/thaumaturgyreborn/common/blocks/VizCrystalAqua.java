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

public class VizCrystalAqua extends BaseHorizontalBlock {

    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(6, -0.40000000000000036, 6, 10, 8.5, 10),
            Block.makeCuboidShape(12, 0, 6, 16, 8.5, 10),
            Block.makeCuboidShape(6, 1.8147960265184864, 1.870936367305374, 10, 10.514796026518486, 5.870936367305374),
            Block.makeCuboidShape(6, 2.3147960265184864, 10.129063632694626, 10, 10.514796026518486, 14.129063632694626),
            Block.makeCuboidShape(0, -0.09999999999999964, 6, 4, 8.5, 10),
            Block.makeCuboidShape(6, 8.5, 6, 10, 14.5, 10),
            Block.makeCuboidShape(3, 0, 3, 13, 1, 13),
            Block.makeCuboidShape(13.945879173811704, -0.39999999999999947, 9.385473956129765, 15.870879173811703, 1.0750000000000004, 14.010473956129763),
            Block.makeCuboidShape(0.12464307191890889, -0.39999999999999947, 9.37194405362611, 1.8746430719189071, 1.0500000000000005, 13.97194405362611),
            Block.makeCuboidShape(2.3789727212148986, -0.39999999999999947, -0.020417631306980155, 7.003972721214898, 1.1250000000000004, 1.8795823686930162),
            Block.makeCuboidShape(9.005079427019368, -0.39999999999999947, 14.022477436314295, 13.605079427019367, 1.1000000000000005, 16.047477436314292),
            Block.makeCuboidShape(13.770879173811704, -0.4249999999999995, 6.510473956129768, 15.520879173811702, 0.9750000000000004, 9.510473956129768),
            Block.makeCuboidShape(0.4746430719189103, -0.4249999999999995, 6.4969440536261125, 2.0246430719189084, 0.9750000000000004, 9.496944053626112),
            Block.makeCuboidShape(6.507582020491018, -0.4249999999999995, 0.48364690030543045, 9.507582020491018, 1.0750000000000006, 2.058646900305427),
            Block.makeCuboidShape(6.5014701277432465, -0.4249999999999995, 13.968412904701882, 9.501470127743247, 0.9750000000000004, 15.543412904701878),
            Block.makeCuboidShape(12.358998698459274, -0.39999999999999947, 2.3819640928233685, 14.033998698459273, 1.0750000000000004, 7.0069640928233685),
            Block.makeCuboidShape(1.9615235472713408, -0.39999999999999947, 2.393434190319714, 3.961523547271339, 1.0500000000000005, 6.993434190319713),
            Block.makeCuboidShape(9.005234507063768, -0.39999999999999947, -0.01963799127532795, 13.605234507063768, 1.2250000000000005, 1.855362008724672),
            Block.makeCuboidShape(2.378817641170497, -0.39999999999999947, 13.971697796282633, 7.003817641170497, 1.2000000000000004, 16.046697796282633),
            Block.makeCuboidShape(2, -0.44999999999999996, 3, 3, 1, 12.950000000000001),
            Block.makeCuboidShape(13, -0.3999999999999999, 3, 14, 1, 12.950000000000001),
            Block.makeCuboidShape(3.049999999999999, -0.44999999999999996, 13, 13, 1, 14),
            Block.makeCuboidShape(3.012500000000001, -0.375, 2.062499999999999, 12.962500000000002, 1, 3.0624999999999987),
            Block.makeCuboidShape(1, 0, 4, 2, 0.8750000000000001, 7),
            Block.makeCuboidShape(14, 0, 4, 15, 0.8750000000000001, 7),
            Block.makeCuboidShape(2, 0, 9, 3, 0.9000000000000001, 12),
            Block.makeCuboidShape(13, 0, 9, 14, 0.9000000000000001, 12),
            Block.makeCuboidShape(2.4000000000000004, -0.3999999999999999, 2.1999999999999993, 13.600000000000001, 0.8, 13.600000000000001)
    ).reduce((v1, v2) -> {
        return VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR);}).get();


    public VizCrystalAqua(Properties properties) {
        super(properties);
        runCalculation(SHAPE);
    }
    @SuppressWarnings("deprecation")
    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPES.get(state.get(HORIZONTAL_FACING));
    }


}
