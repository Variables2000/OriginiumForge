package net.rhelv.originiummod.item;

import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.rhelv.originiummod.OriginiumMod;

public class ModItem {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, OriginiumMod.MODID);

    //Register Item
    public static final RegistryObject<Item> ORIGINIUM = ITEMS.register("originium",
            () -> new Item(new Item.Properties().tab(ModItemTab.ORIGINIUM_TAB).rarity(Rarity.UNCOMMON)));
    public static final RegistryObject<Item> ORIGINIUM_SWORD = ITEMS.register("originium_sword",
            () -> new Item(new Item.Properties().tab(ModItemTab.ORIGINIUM_TAB).rarity(Rarity.RARE)));
    public static void initItem(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
