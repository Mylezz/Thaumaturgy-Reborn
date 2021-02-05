package net.mylez.thaumaturgyreborn.setup;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {
    public static final RegistryObject<Item> THAUMIUM_INGOT = Registration.ITEMS.register("thaumium_ingot",()->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> THAUMIUM_NUGGET = Registration.ITEMS.register("thaumium_nugget",()->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));
    public static final RegistryObject<Item> LORDPOPO_INGOT = Registration.ITEMS.register("lordpopo_ingot",()->
            new Item(new Item.Properties().group(ItemGroup.MATERIALS)));

    static void register() {}
}
