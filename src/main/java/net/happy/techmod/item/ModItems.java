package net.happy.techmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.happy.techmod.TechMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new Item.Settings()));
    public static final Item RAW_NICKEL = registerItem("raw_nickel", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TechMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TechMod.LOGGER.info("Registering ModItems for " + TechMod.MOD_ID);
    }
}
