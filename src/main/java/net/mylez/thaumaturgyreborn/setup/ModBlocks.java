package net.mylez.thaumaturgyreborn.setup;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.mylez.thaumaturgyreborn.common.blocks.CrucibleBlock;

import java.util.function.Supplier;

import static net.mylez.thaumaturgyreborn.init.ModTabGroups.MOD_ITEM_GROUP;

public class ModBlocks {
    public static final RegistryObject<Block> THAUMIUM_ORE = register("thaumium_ore", () ->
            new Block(AbstractBlock.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.STONE)));
    public static final RegistryObject<Block> THAUMIUM_BLOCK = register("thaumium_block", () ->
            new Block(AbstractBlock.Properties.create(Material.IRON).hardnessAndResistance(3, 10).harvestLevel(2).sound(SoundType.METAL)));
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

