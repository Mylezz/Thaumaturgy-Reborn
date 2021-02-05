package net.mylez.thaumaturgyreborn.init;

import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;
import net.mylez.thaumaturgyreborn.common.items.ThaumaturgyItemTier;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ThaumaturgyReborn.MOD_ID);



    //Picks
    public static final RegistryObject<PickaxeItem> THAUMIUM_PICK = ITEMS.register("thaumium_pick",
            ()-> new PickaxeItem(ThaumaturgyItemTier.THAUMIUM,1, -2.8f,
                    new Item.Properties().group(ModTabGroups.MOD_ITEM_GROUP)));
}
