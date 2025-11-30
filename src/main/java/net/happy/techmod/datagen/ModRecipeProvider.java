package net.happy.techmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.happy.techmod.block.ModBlocks;
import net.happy.techmod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        //Register Shaped Recipe
        //
        //ShapedRecipeJsonBuilder.create(RecipeCategory, Result)
        //        .pattern("RRR")
        //        .pattern("RRR")
        //        .pattern("RRR")
        //        .input('R', Input)
        //        .offerTo(exporter);
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.MORTAR_AND_PESTLE)
                .pattern(" W ")
                .pattern("SWS")
                .pattern("SSS")
                .input('W', Items.STICK)
                .input('S', Items.STONE)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        //Register Shapeless Recipe
        //
        //ShapelessRecipeJsonBuilder.create(RecipeCategory, Result, Amount)
        //        .input(Item)
        //        .offerTo(exporter);
        //
        //If you have to shapeless recipes the produce the same result use
        //.offerTo(exporter, Identifier.of(ModID, UniqueName));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.NICKEL_DUST, 1)
                .input(ModItems.MORTAR_AND_PESTLE)
                .input(ModItems.NICKEL_INGOT)
                .criterion(hasItem(ModItems.NICKEL_DUST), conditionsFromItem(ModItems.NICKEL_INGOT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_DUST, 1)
                .input(ModItems.MORTAR_AND_PESTLE)
                .input(Items.IRON_INGOT)
                .criterion(hasItem(Items.IRON_INGOT), conditionsFromItem(Items.IRON_INGOT))
                .offerTo(exporter);

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.STEEL_DUST)
                .input(ModItems.IRON_DUST, 1)
                .input(ModItems.NICKEL_DUST, 4)
                .criterion(hasItem(ModItems.IRON_DUST), conditionsFromItem(ModItems.IRON_DUST))
                .criterion(hasItem(ModItems.NICKEL_DUST), conditionsFromItem(ModItems.NICKEL_DUST))
                .offerTo(exporter);

        //Register a list of items that smelt into one item
        //
        //List<ItemConvertible> ORE_SMELTABLES = List.of(ModItems.RAW_ORE, ModBlocks.ORE,
        //        ModBlocks.DEEPSLATE_ORE);
        //
        //offerSmelting(exporter, ORE_SMELTABLES, RecipeCategory, ModItems.RESULT, Experience,
        //        CookTime, group);

        List<ItemConvertible> NICKEL_SMELTABLES = List.of(ModItems.RAW_NICKEL);
        offerSmelting(exporter, NICKEL_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_INGOT, 0.25f, 200, "nickel_ingot");
        offerBlasting(exporter, NICKEL_SMELTABLES, RecipeCategory.MISC, ModItems.NICKEL_INGOT, 0.25f, 100, "nickel_ingot");


        //Register Item to Block and Block to Item (ex. Iron to Block of Iron and vice versa)
        //
        //offerReversibleCompactingRecipes(exporter, RecipeCategory, ModItems.Item, RecipeCategory,
        //        ModBlocks.Block);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.NICKEL_INGOT, RecipeCategory.DECORATIONS, ModBlocks.BLOCK_OF_NICKEL);
    }
}
