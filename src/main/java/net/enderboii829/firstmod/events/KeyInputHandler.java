package net.enderboii829.firstmod.events;

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.util.InputUtil;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;





public class KeyInputHandler {
    public static final String KEY_CATEGORY_FIRST = "key.category.firstmod.first";
    public static final String KEY_DRINK_WATER = "key.firstmod.drink_water";

    public static KeyBinding drinkingKey;

    public static void registerKeyInputs() {
        ClientTickEvents.END_CLIENT_TICK.register(client -> {
            if(drinkingKey.wasPressed()) {
                // This happens when our custom key is pressed
                client.player.sendMessage(Text.of("Hello I pressed a Key"));
            }
        });
    }

    public static void register(){
        drinkingKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
                KEY_DRINK_WATER,
                InputUtil.Type.KEYSYM,
                GLFW.GLFW_KEY_O,
                KEY_CATEGORY_FIRST
        ));

        registerKeyInputs();
    }
}
