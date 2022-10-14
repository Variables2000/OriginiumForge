package net.rhelv.originiummod.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTier {
    public static final ForgeTier ORIGINIUM = new ForgeTier(4, 2711, 12.5f,
        4.5f, 20, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItem.ORIGINIUM.get()));
}
