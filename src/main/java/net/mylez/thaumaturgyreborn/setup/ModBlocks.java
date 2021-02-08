//This class is used to create any block that does not require a custom model

package net.mylez.thaumaturgyreborn.setup;

import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.mylez.thaumaturgyreborn.common.blocks.CrucibleBlock;
import net.mylez.thaumaturgyreborn.common.blocks.GreatWoodStairs;

import java.util.function.Supplier;

import static net.mylez.thaumaturgyreborn.init.ModTabGroups.MOD_ITEM_GROUP;

public class ModBlocks {

    // Ores
    public static final RegistryObject<Block> THAUMIUM_ORE = register("thaumium_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));

    // Storage blocks
    public static final RegistryObject<Block> THAUMIUM_BLOCK = register("thaumium_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.METAL)));

    // Manny's To Do list from Trello
    public static final RegistryObject<Block> ANCIENT_STONE = register("ancient_stone", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ANCIENT_STONE_BRICK = register("ancient_stone_brick", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREAT_WOOD_LOG = register("great_wood_log", () ->
            new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREAT_WOOD_PLANKS = register("great_wood_planks", () ->
            new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVER_WOOD_LOG = register("silver_wood_log", () ->
            new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> SILVER_WOOD_PLANKS = register("silver_wood_planks", () ->
            new Block(AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.WOOD)));



    //stairs

    public static final RegistryObject<Block> GREAT_WOOD_STAIRS = register("great_wood_stairs", () ->
            new StairsBlock(() -> GREAT_WOOD_PLANKS.get().getDefaultState(), Block.Properties.from(GREAT_WOOD_PLANKS.get())));
    public static final RegistryObject<Block> SILVER_WOOD_STAIRS = register("silver_wood_stairs", () ->
            new StairsBlock(() -> SILVER_WOOD_PLANKS.get().getDefaultState(), Block.Properties.from(SILVER_WOOD_PLANKS.get())));

    //walls
    public static final RegistryObject<Block> ANCIENT_STONE_WALL = register("ancient_stone_wall", () ->
            new WallBlock(Block.Properties.from(ANCIENT_STONE.get())));
    public static final RegistryObject<Block> ANCIENT_STONE_BRICK_WALL = register("ancient_stone_brick_wall", () ->
                    new WallBlock(Block.Properties.from(ANCIENT_STONE_BRICK.get())));


    // CUSTOM BLOCKS - These blocks require custom models
    public static final RegistryObject<CrucibleBlock> CRUCIBLE_BLOCK = register("crucible_block", () ->
            new CrucibleBlock(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.METAL)));



    static void register() {}





    private static <T extends Block> RegistryObject<T> registerNoItem(String name, Supplier<T> block) {
        return Registration.BLOCKS.register(name, block);

    }

    private static <T extends Block> RegistryObject<T> register (String name, Supplier<T> block) {
        RegistryObject<T> ret = registerNoItem(name, block);
        Registration.ITEMS.register(name,() -> new BlockItem(ret.get(), new Item.Properties().group(MOD_ITEM_GROUP)));
        return ret;
    }
}

