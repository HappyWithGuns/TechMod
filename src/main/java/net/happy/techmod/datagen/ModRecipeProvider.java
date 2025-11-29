package net.happy.techmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
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

        //Register Shapeless Recipe
        //
        //ShapelessRecipeJsonBuilder.create(RecipeCategory, Result, Amount)
        //        .input(Item)
        //        .offerTo(exporter);
        //
        //If you have to shapeless recipes the produce the same result use
        //.offerTo(exporter, Identifier.of(ModID, UniqueName));

        //Register a list of items that smelt into one item
        //
        //List<ItemConvertible> ORE_SMELTABLES = List.of(ModItems.RAW_ORE, ModBlocks.ORE,
        //        ModBlocks.DEEPSLATE_ORE);
        //
        //offerSmelting(exporter, ORE_SMELTABLES, RecipeCategory, ModItems.RESULT, Experience,
        //        CookTime, group);

        //Register Item to Block and Block to Item (ex. Iron to Block of Iron and vice versa)
        //
        //offerReversibleCompactingRecipes(exporter, RecipeCategory, ModItems.Item, RecipeCategory,
        //        ModBlocks.Block);

    }
}
