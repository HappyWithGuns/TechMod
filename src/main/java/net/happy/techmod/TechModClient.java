package net.happy.techmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendereregistry.v1.BlockEntityRendererRegistry;
import net.happy.techmod.block.ModBlocks;
import net.happy.techmod.block.entity.ModBlockEntities;
import net.happy.techmod.block.entity.renderer.PedestalBlockEntityRenderer;
import net.happy.techmod.screen.ModScreenHandlers;
import net.happy.techmod.screen.custom.PedestalScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.block.entity.BlockEntityRendererFactories;

public class TechModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        // Register Irregular Block Models
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PEDESTAL, RenderLayer.getCutout());

        // Register GUI
        HandledScreens.register(ModScreenHandlers.PEDESTAL_SCREEN_HANDLER, PedestalScreen::new);

        // Register Block Entities
        BlockEntityRendererFactories.register(ModBlockEntities.PEDESTAL_BE, PedestalBlockEntityRenderer::new);
    }
}
