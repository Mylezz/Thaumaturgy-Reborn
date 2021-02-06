package net.mylez.thaumaturgyreborn.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;

public final class ItemInit {

    public static final DeferredRegister<Item> TOOLITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThaumaturgyReborn.MOD_ID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThaumaturgyReborn.MOD_ID);
    //blocks
    public static final RegistryObject<BlockItem> CRUCIBLE_BLOCK = ITEMS.register("crucible_block",
                    () -> new BlockItem(BlockInit.CRUCIBLE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));


    //Picks

}
