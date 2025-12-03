package net.happy.techmod.block.entity;

import net.happy.techmod.TechMod;
import net.happy.techmod.block.ModBlocks;
import net.happy.techmod.block.entity.custom.ConvectionFurnaceBlockEntity;
import net.happy.techmod.block.entity.custom.PedestalBlockEntity;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import team.reborn.energy.api.EnergyStorage;

public class ModBlockEntities{
    public static final BlockEntityType<PedestalBlockEntity> PEDESTAL_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(TechMod.MOD_ID, "pedestal_be"),
                    BlockEntityType.Builder.create(PedestalBlockEntity::new, ModBlocks.PEDESTAL).build(null));

    public static final BlockEntityType<ConvectionFurnaceBlockEntity> CONVECTION_FURNACE_BE =
            Registry.register(Registries.BLOCK_ENTITY_TYPE, Identifier.of(TechMod.MOD_ID, "convection_furnace_be"),
                    BlockEntityType.Builder.create(ConvectionFurnaceBlockEntity::new, ModBlocks.CONVECTION_FURNACE).build(null));

    public static void registerBlockEntities() {
        TechMod.LOGGER.info("Registering ModBlockEntities for " + TechMod.MOD_ID);
    }
}
