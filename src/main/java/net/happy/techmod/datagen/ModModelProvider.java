package net.happy.techmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.happy.techmod.block.ModBlocks;
import net.happy.techmod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Register Block Model
        //blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.block);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NICKEL_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NICKEL_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLOCK_OF_NICKEL);

        blockStateModelGenerator.registerNorthDefaultHorizontalRotation(ModBlocks.PEDESTAL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //Register Item Model
        //itemModelGenerator.register(Items, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICKEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NICKEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.MORTAR_AND_PESTLE, Models.GENERATED);
        itemModelGenerator.register(ModItems.NICKEL_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.IRON_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.STEEL_DUST, Models.GENERATED);
    }
}
