package net.happy.techmod.block;

import net.happy.techmod.TechMod;
import net.happy.techmod.block.custom.ConvectionFurnaceBlock;
import net.happy.techmod.block.custom.PedestalBlock;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block BLOCK_OF_NICKEL = registerBlock("block_of_nickel",
            new Block(AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()));

    public static final Block NICKEL_ORE = registerBlock("nickel_ore",
            new Block(AbstractBlock.Settings.create()
                    .strength(3f)
                    .requiresTool()));

    public static final Block NICKEL_DEEPSLATE_ORE = registerBlock("nickel_deepslate_ore",
            new Block(AbstractBlock.Settings.create()
                    .strength(4f)
                    .requiresTool()));

    public static final Block PEDESTAL = registerBlock("pedestal",
            new PedestalBlock(AbstractBlock.Settings.create()
                    .nonOpaque()
                    .strength(2f)
                    .requiresTool()));

    public static final Block CONVECTION_FURNACE = registerBlock("convection_furnace",
            new ConvectionFurnaceBlock(AbstractBlock.Settings.create()
                    .nonOpaque()
                    .strength(2f)
                    .requiresTool()));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(TechMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(TechMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        TechMod.LOGGER.info("Registering ModBlocks for " + TechMod.MOD_ID);
    }
}
