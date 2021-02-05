package net.mylez.thaumaturgyreborn.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;
import net.mylez.thaumaturgyreborn.setup.ModItems;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public final class ModTabGroups
    //CHANGE THAUMIUM_INGOT to book when finsihed with making it
{
    public static final ItemGroup MOD_ITEM_GROUP =
            new ModTabGroup(ThaumaturgyReborn.MOD_ID, () -> new ItemStack(ModItems.THAUMIUM_INGOT.get()));
    public static final class ModTabGroup extends ItemGroup
    {
        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        /**
         * @param name  String: mod id
         * @param iconSupplier
         */
        public ModTabGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }

    } // end ModTabGroup()

}  // end class ModTabGroup