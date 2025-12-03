package net.happy.techmod.screen.custom;

import com.mojang.blaze3d.systems.RenderSystem;
import net.happy.techmod.TechMod;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.ingame.HandledScreen;
import net.minecraft.client.render.GameRenderer;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;

public class ConvectionFurnaceScreen extends HandledScreen<ConvectionFurnaceScreenHandler> {
    public static final Identifier GUI_TEXTURE = Identifier.of(TechMod.MOD_ID, "textures/gui/convection_furnace/convection_furnace_gui.png");

    public ConvectionFurnaceScreen(ConvectionFurnaceScreenHandler handler, PlayerInventory inventory, Text title) {
        super(handler, inventory, title);
    }

    @Override
    protected void drawBackground(DrawContext context, float delta, int mouseX, int mouseY) {
        RenderSystem.setShader(GameRenderer::getPositionTexProgram);
        RenderSystem.setShaderColor(1f,1f,1f,1f);
        RenderSystem.setShaderTexture(0, GUI_TEXTURE);

        int x = (width - backgroundWidth) / 2;
        int y = (height - backgroundHeight) / 2;

        context.drawTexture(GUI_TEXTURE, x, y, 0, 0, backgroundWidth, backgroundHeight);
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        super.render(context, mouseX, mouseY, delta);
        drawMouseoverTooltip(context, mouseX, mouseY);

        int energyBarSize = (int) ((float) this.handler.getEnergy() / 10_000 * 52);;
        if (isPointWithinBounds(144, 10 + 66 - energyBarSize, 16, energyBarSize, mouseX, mouseY)) {
            context.drawTooltip(this.textRenderer, Text.literal(this.handler.getEnergy() + " / " + this.handler.getMaxEnergy() + " FE"), mouseX, mouseY);
        }

        context.drawTexture(GUI_TEXTURE, 14, 69, 176, 51, 16, energyBarSize);
    }
}
