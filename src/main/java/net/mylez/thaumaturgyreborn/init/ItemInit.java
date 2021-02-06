package net.mylez.thaumaturgyreborn.init;

import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;
import net.mylez.thaumaturgyreborn.common.items.ThaumaturgyItemTier;


public final class ItemInit {

    public static final DeferredRegister<Item> TOOLITEM =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThaumaturgyReborn.MOD_ID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThaumaturgyReborn.MOD_ID);
    //blocks
    public static final RegistryObject<BlockItem> CRUCIBLE_BLOCK = ITEMS.register("crucible_block",
                    () -> new BlockItem(BlockInit.CRUCIBLE_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));


    //Picks
    public static final RegistryObject<PickaxeItem> TOOLITEM_THAUMIUMPICK = TOOLITEM.register("thaumiumpick_tooltiem",
            ()-> new PickaxeItem(ThaumaturgyItemTier.THAUMIUM,1, -2.8f,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));

}
