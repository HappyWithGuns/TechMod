package net.happy.techmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.happy.techmod.TechMod;
import net.happy.techmod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TECH_MOD_ITEM_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(TechMod.MOD_ID, "techmod_items"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.NICKEL_INGOT))
                    .displayName(Text.translatable("itemgroup.techmod.techmod_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.NICKEL_DEEPSLATE_ORE);
                        entries.add(ModBlocks.NICKEL_ORE);
                        entries.add(ModBlocks.BLOCK_OF_NICKEL);
                        entries.add(ModItems.RAW_NICKEL);
                        entries.add(ModItems.NICKEL_INGOT);
                    }).build());

    public static void registerItemGroups() {
        TechMod.LOGGER.info("Registering ModItemGroups for " + TechMod.MOD_ID);
    }
}
