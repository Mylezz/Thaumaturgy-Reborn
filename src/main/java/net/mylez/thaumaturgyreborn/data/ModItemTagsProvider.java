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
        copy(ModTags.Blocks.ANCIENT_STONE, ModTags.Items.BLOCKS_ANCIENT_STONE); // Ancient Stone
        copy(Tags.Blocks.STONE, Tags.Items.STONE);

        copy(ModTags.Blocks.ANCIENT_STONE_BRICK, ModTags.Items.BLOCKS_ANCIENT_STONE_BRICK); // Ancient Stone Brick
        copy(Tags.Blocks.STONE, Tags.Items.STONE);

        copy(ModTags.Blocks.GREAT_WOOD_LOG, ModTags.Items.BLOCKS_GREAT_WOOD_LOG); // Great Wood Log - REMEMBER TO CHANGE TO WOOD ITEM IS STONE FOR PLACE HOLDER
        copy(Tags.Blocks.STONE, Tags.Items.STONE);

        copy(ModTags.Blocks.GREAT_WOOD_PLANKS, ModTags.Items.BLOCKS_GREAT_WOOD_PLANKS); // Great Wood Planks - REMEMBER TO CHANGE TO WOOD ITEM IS STONE FOR PLACE HOLDER
        copy(Tags.Blocks.STONE, Tags.Items.STONE);

        copy(ModTags.Blocks.CREST_WOOD_LOG, ModTags.Items.BLOCKS_CREST_WOOD_LOG); // CREST Wood Log - REMEMBER TO CHANGE TO WOOD ITEM IS STONE FOR PLACE HOLDER
        copy(Tags.Blocks.STONE, Tags.Items.STONE);

        copy(ModTags.Blocks.CREST_WOOD_PLANKS, ModTags.Items.BLOCKS_CREST_WOOD_PLANKS); // CREST Wood Planks - REMEMBER TO CHANGE TO WOOD ITEM IS STONE FOR PLACE HOLDER
        copy(Tags.Blocks.STONE, Tags.Items.STONE);
        //stairs
        copy(ModTags.Blocks.BLOCKS_GREAT_WOOD_STAIRS, ModTags.Items.BLOCKS_GREAT_WOOD_STAIRS);
        copy(Tags.Blocks.STONE, Tags.Items.STONE);

        copy(ModTags.Blocks.BLOCKS_CREST_WOOD_STAIRS, ModTags.Items.BLOCKS_CREST_WOOD_STAIRS);
        copy(Tags.Blocks.STONE, Tags.Items.STONE);

        //walls
        copy(ModTags.Blocks.BLOCKS_ANCIENT_STONE_WALL, ModTags.Items.BLOCKS_ANCIENT_STONE_WALL); // Ancient Stone
        copy(Tags.Blocks.STONE, Tags.Items.STONE);

        copy(ModTags.Blocks.BLOCKS_ANCIENT_STONE_BRICK_WALL, ModTags.Items.BLOCKS_ANCIENT_STONE_BRICK_WALL); // Ancient Stone Brick
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