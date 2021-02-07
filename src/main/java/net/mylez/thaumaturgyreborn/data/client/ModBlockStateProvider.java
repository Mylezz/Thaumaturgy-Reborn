package net.mylez.thaumaturgyreborn.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;
import net.mylez.thaumaturgyreborn.setup.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, ThaumaturgyReborn.MOD_ID, exFileHelper);
    }

    // Adds default block models to block
    @Override
    protected void registerStatesAndModels() {
        simpleBlock(ModBlocks.THAUMIUM_BLOCK.get());
        simpleBlock(ModBlocks.THAUMIUM_ORE.get());
        simpleBlock(ModBlocks.ANCIENT_STONE.get());
        simpleBlock(ModBlocks.ANCIENT_STONE_BRICK.get());
        simpleBlock(ModBlocks.GREAT_WOOD_LOG.get());
        simpleBlock(ModBlocks.GREAT_WOOD_PLANKS.get());
        simpleBlock(ModBlocks.SILVER_WOOD_LOG.get());
        simpleBlock(ModBlocks.SILVER_WOOD_PLANKS.get());
        simpleBlock(ModBlocks.GREAT_WOOD_STAIRS.get());

    }
}