package net.mylez.thaumaturgyreborn.setup;

import net.minecraft.block.Block;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;
import net.mylez.thaumaturgyreborn.data.ModItemTagsProvider;

public class ModTags extends ModItemTagsProvider {
    public ModTags(DataGenerator dataGenerator, BlockTagsProvider blockTagProvider, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, blockTagProvider, existingFileHelper);
    }

    //Blocks
    public static final class Blocks {
        //blocks

        public static final ITag.INamedTag<Block> ORES_THAUMIUM = forge("ores/thaumium");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_THAUMIUM = forge("storage_blocks/thaumium");
        public static final ITag.INamedTag<Block> BLOCKS_CRUCIBLE = forge("blocks/crucible");
        public static final ITag.INamedTag<Block> BLOCKS_CAULDRON_LARGE = forge("blocks/cauldron_large");
        public static final ITag.INamedTag<Block> BLOCKS_VIZ_CRYSTAL_AQUA = forge("blocks/viz_crystal_aqua");
        public static final ITag.INamedTag<Block> ANCIENT_STONE = forge("blocks/ancient_stone");
        public static final ITag.INamedTag<Block> ANCIENT_STONE_BRICK = forge("blocks/ancient_stone_brick");
        public static final ITag.INamedTag<Block> BLOCKS_ANCIENT_STONE_WALL = forge("blocks/ancient_stone_wall");
        public static final ITag.INamedTag<Block> BLOCKS_ANCIENT_STONE_BRICK_WALL = forge("blocks/ancient_stone_brick_wall");
        public static final ITag.INamedTag<Block> GREAT_WOOD_LOG = forge("blocks/great_wood_log");
        public static final ITag.INamedTag<Block> GREAT_WOOD_PLANKS = forge("blocks/great_wood_planks");
        public static final ITag.INamedTag<Block> CREST_WOOD_LOG = forge("blocks/crest_wood_log");
        public static final ITag.INamedTag<Block> CREST_WOOD_PLANKS = forge("blocks/crest_wood_planks");
        public static final ITag.INamedTag<Block> BLOCKS_GREAT_WOOD_STAIRS = forge("blocks/great_wood_stairs");
        public static final ITag.INamedTag<Block> BLOCKS_CREST_WOOD_STAIRS = forge("blocks/crest_wood_stairs");

        private static ITag.INamedTag<Block> forge(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Block> mod(String path) {
            return BlockTags.makeWrapperTag(new ResourceLocation(ThaumaturgyReborn.MOD_ID, path).toString());
        }
    }
    //Items
    public static final class Items {
        //block items
        public static final ITag.INamedTag<Item> ORES_THAUMIUM = forge("ores/thaumium");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_THAUMIUM = forge("storage_blocks/thaumium");
        public static final ITag.INamedTag<Item> BLOCKS_CRUCIBLE = forge("blocks/crucible");
        public static final ITag.INamedTag<Item> BLOCKS_CAULDRON_LARGE = forge("blocks/cauldron_large");

        public static final ITag.INamedTag<Item> BLOCKS_VIZ_CRYSTAL_AQUA = forge("blocks/viz_crystal_aqua");
        public static final ITag.INamedTag<Item> BLOCKS_ANCIENT_STONE = forge("blocks/ancient_stone_wall");
        public static final ITag.INamedTag<Item> BLOCKS_ANCIENT_STONE_BRICK = forge("blocks/ancient_stone_brick");
        public static final ITag.INamedTag<Item> BLOCKS_ANCIENT_STONE_WALL = forge("blocks/ancient_stone_wall");
        public static final ITag.INamedTag<Item> BLOCKS_ANCIENT_STONE_BRICK_WALL = forge("blocks/ancient_stone_brick_wall");
        public static final ITag.INamedTag<Item> BLOCKS_GREAT_WOOD_LOG = forge("blocks/great_wood_log");
        public static final ITag.INamedTag<Item> BLOCKS_GREAT_WOOD_PLANKS = forge("blocks/great_wood_planks");
        public static final ITag.INamedTag<Item> BLOCKS_CREST_WOOD_LOG = forge("blocks/crest_wood_log");
        public static final ITag.INamedTag<Item> BLOCKS_CREST_WOOD_PLANKS = forge("blocks/crest_wood_planks");
        public static final ITag.INamedTag<Item> BLOCKS_GREAT_WOOD_STAIRS = forge("blocks/great_wood_stairs");
        public static final ITag.INamedTag<Item> BLOCKS_CREST_WOOD_STAIRS = forge("blocks/crest_wood_stairs");


        //items
        public static final ITag.INamedTag<Item> INGOTS_THAUMIUM = forge("ingots/thaumium");
        public static final ITag.INamedTag<Item> NUGGETS_THAUMIUM = forge("nugget/thaumium");
        public static final ITag.INamedTag<Item> INGOTS_LORDPOPO = forge("ingots/lordpopo");

        //Tools
        public static final ITag.INamedTag<Item> TOOLITEM_THAUMIUMPICK = forge("thaumiumpick_tooltiem");



        private static ITag.INamedTag<Item> forge(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation("forge", path).toString());
        }

        private static ITag.INamedTag<Item> mod(String path) {
            return ItemTags.makeWrapperTag(new ResourceLocation(ThaumaturgyReborn.MOD_ID, path).toString());
        }

    }








}