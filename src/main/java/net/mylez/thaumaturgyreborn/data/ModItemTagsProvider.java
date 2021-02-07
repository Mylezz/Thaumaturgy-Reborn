package net.mylez.thaumaturgyreborn.data;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;
import net.mylez.thaumaturgyreborn.init.ModTabGroups;
import net.mylez.thaumaturgyreborn.setup.ModItems;
import net.mylez.thaumaturgyreborn.setup.ModTags;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, ThaumaturgyReborn.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerTags() {
        //ores
        copy(ModTags.Blocks.ORES_THAUMIUM, ModTags.Items.ORES_THAUMIUM);
        copy(Tags.Blocks.ORES, Tags.Items.ORES);
        //storage blocks
        copy(ModTags.Blocks.STORAGE_BLOCKS_THAUMIUM, ModTags.Items.STORAGE_BLOCKS_THAUMIUM);
        copy(Tags.Blocks.STORAGE_BLOCKS, Tags.Items.STORAGE_BLOCKS);

        //crucible
        copy(ModTags.Blocks.BLOCKS_CRUCIBLE, ModTags.Items.BLOCKS_CRUCIBLE);
        copy(Tags.Blocks.STONE, Tags.Items.STONE);

        //blocks
        copy(ModTags.Blocks.ANCIENT_STONE, ModTags.Items.BLOCKS_ANCIENT_STONE);
        copy(Tags.Blocks.STONE, Tags.Items.STONE);

        //ingots
        getOrCreateBuilder(ModTags.Items.INGOTS_THAUMIUM).add(ModItems.THAUMIUM_INGOT.get());
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_THAUMIUM);

        //nuggets
        getOrCreateBuilder(ModTags.Items.NUGGETS_THAUMIUM).add(ModItems.THAUMIUM_NUGGET.get());
        getOrCreateBuilder(Tags.Items.NUGGETS).addTag(ModTags.Items.NUGGETS_THAUMIUM);

        //ALL HAIL LORD POPO
        getOrCreateBuilder(ModTags.Items.INGOTS_LORDPOPO).add(ModItems.LORDPOPO_INGOT.get());
        getOrCreateBuilder(Tags.Items.INGOTS).addTag(ModTags.Items.INGOTS_LORDPOPO);

        //tools




        

        
        

    }
}