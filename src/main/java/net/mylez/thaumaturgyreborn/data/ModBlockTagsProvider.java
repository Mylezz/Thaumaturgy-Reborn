package net.mylez.thaumaturgyreborn.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;
import net.mylez.thaumaturgyreborn.setup.ModBlocks;
import net.mylez.thaumaturgyreborn.setup.ModTags;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator generatorIn, ExistingFileHelper existingFileHelper) {
        super(generatorIn, ThaumaturgyReborn.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        getOrCreateBuilder(ModTags.Blocks.ORES_THAUMIUM).add(ModBlocks.THAUMIUM_ORE.get());
        getOrCreateBuilder(Tags.Blocks.ORES).addTag(ModTags.Blocks.ORES_THAUMIUM);
        getOrCreateBuilder(ModTags.Blocks.STORAGE_BLOCKS_THAUMIUM).add(ModBlocks.THAUMIUM_BLOCK.get());
        getOrCreateBuilder(ModTags.Blocks.ANCIENT_STONE).add(ModBlocks.ANCIENT_STONE.get());
        getOrCreateBuilder(ModTags.Blocks.ANCIENT_STONE_BRICK).add(ModBlocks.ANCIENT_STONE_BRICK.get());
        getOrCreateBuilder(ModTags.Blocks.GREAT_WOOD_LOG).add(ModBlocks.GREAT_WOOD_LOG.get());
        getOrCreateBuilder(ModTags.Blocks.GREAT_WOOD_PLANKS).add(ModBlocks.GREAT_WOOD_PLANKS.get());
    }
}
