package net.mylez.thaumaturgyreborn.setup;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;

import static net.mylez.thaumaturgyreborn.init.ModItems.TOOLITEM;


public class Registration {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ThaumaturgyReborn.MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ThaumaturgyReborn.MOD_ID);

    public  static  void register() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        TOOLITEM.register(modEventBus);



        ModBlocks.register();
        ModItems.register();

    }
}
