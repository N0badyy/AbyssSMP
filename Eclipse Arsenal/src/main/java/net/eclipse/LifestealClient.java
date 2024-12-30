package net.eclipse;

import net.fabricmc.api.ClientModInitializer;


// import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
// import net.fabricmc.loader.api.FabricLoader;
// import net.lifesteal_decor.screen.ErrorScreen;
// import net.minecraft.client.MinecraftClient;
// import net.minecraft.client.gui.screen.TitleScreen;
// import net.minecraft.text.Text;
import org.slf4j.Logger;

// import com.google.gson.JsonArray;
// import com.google.gson.JsonObject;
// import com.google.gson.JsonParser;

// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.net.HttpURLConnection;
// import java.net.URL;
// import java.util.Arrays;
// import java.util.List;
// import java.util.Set;
// import java.util.stream.Collectors;

public class LifestealClient implements ClientModInitializer {
    private static final Logger LOGGER = LifestealCombat.LOGGER;
    // private static final List<String> BLACKLISTED_MODS = Arrays.asList(
    //         "freecam", "fabric_hider", "viafabricplus", "viafabric", "wurst",
    //         "meteor-client", "baritone", "freelook", "liquidbounce", "vape", "athenaeum", "impact","future","futureclient","future-client"
    // );

    // private static final String WHITELIST_URL = "https://drive.google.com/uc?id=1EypAstkhupNuCVogHCjc-7Yz8hffXSLa&export=download";
    // private boolean blacklistTriggered = false;
    // private boolean whitelistTriggered = false;

    @Override
    public void onInitializeClient() {
        LOGGER.info("Lifesteal Decor Client Initializing...");
         
    //     Set<String> loadedModIds = FabricLoader.getInstance().getAllMods().stream()
    //             .map(mod -> mod.getMetadata().getId())
    //             .collect(Collectors.toSet());

    //     // Check for blacklisted mods
    //     for (String blacklistedMod : BLACKLISTED_MODS) {
    //         if (loadedModIds.contains(blacklistedMod)) {
    //             LOGGER.error("Blacklisted mod detected: " + blacklistedMod);

    //             blacklistTriggered = true;
    //             String errorMessage = "The mod \"" + blacklistedMod + "\" is not allowed! Please remove it to continue.";

    //             // Schedule setting the error screen after the main menu is loaded
    //             scheduleErrorScreen(errorMessage);
    //             return;
    //         }
    //     }

    //     // Fetch and validate whitelist
    //     try {
    //         List<String> whitelist = fetchWhitelist();
    //         String username = MinecraftClient.getInstance().getSession().getUsername();

    //         if (!whitelist.contains(username)) {
    //             LOGGER.error("User not whitelisted: " + username);

    //             whitelistTriggered = true;
    //             String errorMessage = "This account is not whitelisted therefore no access will be allowed to run the instance with this mod.";

    //             // Schedule setting the error screen after the main menu is loaded
    //             scheduleErrorScreen(errorMessage);
    //         }
    //     } catch (Exception e) {
    //         LOGGER.error("Failed to fetch whitelist", e);
    //         scheduleErrorScreen("Failed to verify whitelist. Please contact the server administrator.");
    //     }

    //     LOGGER.info("No blacklisted mods detected. Lifesteal client initialized successfully.");
    // }

    // private void scheduleErrorScreen(String message) {
    //     // This event handler will be triggered on each client tick
    //     ClientTickEvents.END_CLIENT_TICK.register(client -> {
    //         if ((blacklistTriggered || whitelistTriggered) && client instanceof MinecraftClient mc) {
    //             // Ensure we only set the screen once and after the main menu is loaded
    //             if (mc.currentScreen instanceof TitleScreen) {
    //                 mc.setScreen(new ErrorScreen(Text.literal("Mod Error"), Text.literal(message)));
                    
    //                 // Reset the flag to prevent further handling
    //                 blacklistTriggered = false;
    //                 whitelistTriggered = false;
    //             }
    //         }
    //     });
    // }

    // private List<String> fetchWhitelist() throws Exception {
    // // Fetch the whitelist from the Google Drive URL
    // URL url = new URL(WHITELIST_URL);
    // HttpURLConnection connection = (HttpURLConnection) url.openConnection();
    // connection.setRequestMethod("GET");

    // // Parse the JSON response
    // try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
    //     JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
    //     JsonArray whitelistArray = jsonObject.getAsJsonArray("whitelisted");

    //     // Extract player names from the JSON array
    //     return whitelistArray
    //             .asList()
    //             .stream()
    //             .map(element -> element.getAsJsonObject().get("player").getAsString())
    //             .collect(Collectors.toList());
    // }
}
}