package net.rhelv.originiummod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModItemTab {
    public static final CreativeModeTab ORIGINIUM_TAB = new CreativeModeTab("originiumtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItem.ORIGINIUM.get());
        }
    };
}
