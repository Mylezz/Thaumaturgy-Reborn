package net.mylez.thaumaturgyreborn.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;
import net.mylez.thaumaturgyreborn.common.blocks.CrucibleBlock;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            ThaumaturgyReborn.MOD_ID);

    public static final RegistryObject<CrucibleBlock> CRUCIBLE_BLOCK = BLOCKS.register("crucible_block",
                    () -> new CrucibleBlock(AbstractBlock.Properties.create(Material.IRON, MaterialColor.PURPLE)
                    .hardnessAndResistance(15f, 30f).harvestTool(ToolType.PICKAXE).harvestLevel(2)
                    .sound(SoundType.METAL).setRequiresTool()));


}
