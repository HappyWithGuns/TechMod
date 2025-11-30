package net.happy.techmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModEnglishLangProvider extends FabricLanguageProvider {
    public ModEnglishLangProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add("item.techmod.nickel_ingot", "Nickel Ingot");
        translationBuilder.add("item.techmod.steel_ingot", "Steel Ingot");
        translationBuilder.add("item.techmod.raw_nickel", "Raw Nickel");
        translationBuilder.add("item.techmod.mortar_and_pestle", "Mortar and Pestle");
        translationBuilder.add("item.techmod.nickel_dust", "Nickel Dust");
        translationBuilder.add("item.techmod.iron_dust", "Iron Dust");
        translationBuilder.add("item.techmod.steel_dust", "Steel Dust");

        translationBuilder.add("block.techmod.nickel_ore", "Nickel Ore");
        translationBuilder.add("block.techmod.nickel_deepslate_ore", "Nickel Deepslate Ore");
        translationBuilder.add("block.techmod.block_of_nickel", "Block of Nickel");

        translationBuilder.add("itemgroup.techmod.techmod_items", "Tech Mod Items");
    }
}
