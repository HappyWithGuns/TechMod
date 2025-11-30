package net.happy.techmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.happy.techmod.TechMod;
import net.happy.techmod.item.custom.MortarAndPestleItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item NICKEL_INGOT = registerItem("nickel_ingot", new Item(new Item.Settings()));
    public static final Item STEEL_INGOT = registerItem("steel_ingot", new Item(new Item.Settings()));
    public static final Item RAW_NICKEL = registerItem("raw_nickel", new Item(new Item.Settings()));
    public static final Item NICKEL_DUST = registerItem("nickel_dust", new Item(new Item.Settings()));
    public static final Item IRON_DUST = registerItem("iron_dust", new Item(new Item.Settings()));
    public static final Item STEEL_DUST = registerItem("steel_dust", new Item(new Item.Settings()));

    public static final Item MORTAR_AND_PESTLE = registerItem("mortar_and_pestle", new MortarAndPestleItem(new Item.Settings()
            .maxDamage(32)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(TechMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TechMod.LOGGER.info("Registering ModItems for " + TechMod.MOD_ID);
    }
}
