// This class is used to create any custom item that does not use a custom model

package net.mylez.thaumaturgyreborn.setup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;

public class ModItems {

    //Ingots
    public static final RegistryObject<Item> THAUMIUM_INGOT = Registration.ITEMS.register("thaumium_ingot",()->
            new Item(new Item.Properties().group(CreativeModTabGroups.MOD_ITEM_GROUP)));

    public static final RegistryObject<Item> LORDPOPO_INGOT = Registration.ITEMS.register("lordpopo_ingot",()->
            new Item(new Item.Properties().group(CreativeModTabGroups.MOD_ITEM_GROUP)));

    //Nuggets
    public static final RegistryObject<Item> THAUMIUM_NUGGET = Registration.ITEMS.register("thaumium_nugget",()->
            new Item(new Item.Properties().group(CreativeModTabGroups.MOD_ITEM_GROUP)));





    static void register() {}
}
