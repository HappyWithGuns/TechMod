package net.happy.techmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.happy.techmod.block.ModBlocks;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.NICKEL_ORE)
                .add(ModBlocks.BLOCK_OF_NICKEL)
                .add(ModBlocks.PEDESTAL)
                .add(ModBlocks.CONVECTION_FURNACE)
                .add(ModBlocks.NICKEL_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.NICKEL_ORE)
                .add(ModBlocks.BLOCK_OF_NICKEL)
                .add(ModBlocks.NICKEL_DEEPSLATE_ORE);

        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(ModBlocks.PEDESTAL)
                .add(ModBlocks.CONVECTION_FURNACE);
    }
}
