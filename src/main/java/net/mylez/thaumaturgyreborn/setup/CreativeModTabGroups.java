package net.mylez.thaumaturgyreborn.setup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.mylez.thaumaturgyreborn.ThaumaturgyReborn;
import net.mylez.thaumaturgyreborn.setup.ModItems;

import javax.annotation.Nonnull;
import java.util.function.Supplier;

public final class CreativeModTabGroups
    //CHANGE THAUMIUM_INGOT to book when finsihed with making it
{
    public static final ItemGroup MOD_ITEM_GROUP =
            new CreativeModTabGroup(ThaumaturgyReborn.MOD_ID, () -> new ItemStack(ModItems.THAUMIUM_INGOT.get()));
    public static final class CreativeModTabGroup extends ItemGroup
    {
        @Nonnull
        private final Supplier<ItemStack> iconSupplier;

        /**
         * @param name  String: mod id
         * @param iconSupplier
         */
        public CreativeModTabGroup(@Nonnull final String name, @Nonnull final Supplier<ItemStack> iconSupplier)
        {
            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        @Nonnull
        public ItemStack createIcon() {
            return iconSupplier.get();
        }

    } // end CreativeModTabGroup()

}  // end class CreativeModTabGroup