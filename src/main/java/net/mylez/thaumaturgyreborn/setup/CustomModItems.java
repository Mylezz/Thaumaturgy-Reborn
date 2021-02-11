package net.mylez.thaumaturgyreborn.setup;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;
import net.mylez.thaumaturgyreborn.common.items.ThaumaturgyItemTier;


public final class CustomModItems {

    public static final DeferredRegister<Item> TOOLITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThaumaturgyReborn.MOD_ID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThaumaturgyReborn.MOD_ID);
    //blocks
    public static final RegistryObject<BlockItem> CRUCIBLE_BLOCK = ITEMS.register("crucible_block",
            () -> new BlockItem(CustomModBlocks.CRUCIBLE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

    public static final RegistryObject<BlockItem> VIZ_CRYSTAL_AQUA = ITEMS.register("viz_crystal_aqua",
            () -> new BlockItem(CustomModBlocks.VIZ_CRYSTAL_AQUA.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));



    //Picks
    public static final RegistryObject<PickaxeItem> TOOLITEM_THAUMIUMPICK = TOOLITEM.register("thaumiumpick_tooltiem",
            ()-> new PickaxeItem(ThaumaturgyItemTier.THAUMIUM,1, -2.8f,
                    new Item.Properties().group(CreativeModTabGroups.MOD_ITEM_GROUP)));

}
