
package net.mylez.thaumaturgyreborn.data.client;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, ThaumaturgyReborn.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        withExistingParent("thaumium_block", modLoc("block/thaumium_block"));
        withExistingParent("thaumium_ore", modLoc("block/thaumium_ore"));
        withExistingParent("crucible_block", modLoc("block/crucible_block"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));

        builder(itemGenerated, "thaumium_ingot");
        builder(itemGenerated, "thaumium_nugget");
        builder(itemGenerated, "lordpopo_ingot");
        builder(itemGenerated, "thaumiumpick_toolitem");
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}