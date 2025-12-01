package net.happy.techmod.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.happy.techmod.TechMod;
import net.happy.techmod.screen.custom.PedestalScreenHandler;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {
    public static final ScreenHandlerType<PedestalScreenHandler> PEDESTAL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(TechMod.MOD_ID,
                    "pedestal_screen_handler"),
                    new ExtendedScreenHandlerType<>(PedestalScreenHandler::new,
                            BlockPos.PACKET_CODEC));

    public static void RegisterScreenHandler() {
        TechMod.LOGGER.info("Registering ModScreenHandlers for " + TechMod.MOD_ID);
    }
}
