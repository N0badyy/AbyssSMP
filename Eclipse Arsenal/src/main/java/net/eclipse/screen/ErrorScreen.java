package net.eclipse.screen;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.ButtonWidget;
import net.minecraft.text.Text;

public class ErrorScreen extends Screen {
    private final Text errorMessage;

    // Constructor now accepts two Text objects: title and error message
    public ErrorScreen(Text title, Text errorMessage) {
        super(title);
        this.errorMessage = errorMessage;
    }

    @Override
    protected void init() {
        // Add a "Close" button
        this.addDrawableChild(ButtonWidget.builder(Text.literal("Close Client"), button -> {
            assert this.client != null; // Ensure client is not null
           this.client.stop(); // Close the screen when the button is clicked
        }).dimensions(this.width / 2 - 50, this.height - 100, 100, 20).build());
    }

    @Override
    public void render(DrawContext context, int mouseX, int mouseY, float delta) {
        // Clear the background to avoid any blur or leftover UI elements
        
		super.render(context, mouseX, mouseY, delta);
        // Render the title and error message
        context.drawCenteredTextWithShadow(this.textRenderer, this.title, this.width / 2, 20, 0xFFFFFF);
        context.drawCenteredTextWithShadow(this.textRenderer, this.errorMessage, this.width / 2, this.height / 2 - 10, 0xFF5555);

        // Render buttons and other components
        
    }

    @Override
    public boolean shouldCloseOnEsc() {
        return false; // Prevent ESC key from closing the screen
    }
}
