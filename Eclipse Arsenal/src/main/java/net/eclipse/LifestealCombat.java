package net.eclipse;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import net.eclipse.block.ModBlocks;
import net.eclipse.enchantment.ModEnchantmentEffects;
import net.eclipse.item.ModItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.Set;

public class LifestealCombat implements ModInitializer {
    public static final String MOD_ID = "eclipse";
    public static final Logger LOGGER = LoggerFactory.getLogger("EclipseArsenal");
    
    // Hardcoded list of expected mixins
    private static final Set<String> EXPECTED_MIXINS = new HashSet<>() {{
        add("ExampleMixin");
        
        // add("HeartManagementMixin");
        // add("PlayerLoginMixin");
        // add("ModEntityDataSaver");
        // add("EndCrystalPlacementMixin");
        // add("AnchorGlowstoneMixin");
        // add("PvPToggleMixin");
        // add("TNTMinecartPlacementMixin");
        // add("DisableElytraItemMixin");
    }};
    private static final Set<String> EXPECTED_CLIENT_MIXINS = new HashSet<>() {{
        add("ItemRendererAccessor");
        add("ItemRendererMixin");
    }};
    @Override
    public void onInitialize() {
        // Check if the fabric.mod.json is correct
        if (!isValidFabricModJson()) {
            LOGGER.error("The fabric.mod.json does not match the expected template. Exiting...");
            System.exit(1);  // Terminate the mod initialization if the json is incorrect
        }

        // Check if the eclipse.mixins.json is correct
        if (!isValidMixinJson()) {
            LOGGER.error("The eclipse.mixins.json file is invalid. Exiting...");
            System.exit(1);  // Terminate the mod initialization if the mixin JSON is incorrect
        }

        LOGGER.info("Lifesteal Decor initialized successfully.");
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
        ModEnchantmentEffects.registerEnchantmentEffects();
       
    }

    private boolean isValidFabricModJson() {
        try {
            ModContainer modContainer = FabricLoader.getInstance().getModContainer(MOD_ID).get();
            InputStream inputStream = modContainer.getPath("fabric.mod.json").toUri().toURL().openStream();
            
            // Parse the JSON file
            JsonObject modJson = JsonParser.parseReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).getAsJsonObject();

            // Validate Mod ID
            if (!modJson.has("id") || !modJson.get("id").getAsString().equals(MOD_ID)) {
                LOGGER.error("Mod ID in fabric.mod.json is incorrect.");
                return false;
            }

            // Validate EntryPoints
            if (!modJson.has("entrypoints") || !modJson.getAsJsonObject("entrypoints").has("main") || !modJson.getAsJsonObject("entrypoints").has("client")) {
                LOGGER.error("Entry points in fabric.mod.json are incorrect.");
                return false;
            }

            // Validate Dependencies
            if (!modJson.has("depends")) {
                LOGGER.error("Dependencies in fabric.mod.json are missing.");
                return false;
            }

            JsonObject depends = modJson.getAsJsonObject("depends");

            // Check if specific dependencies exist
            if (!depends.has("fabricloader") || !depends.has("minecraft") || !depends.has("fabric-api") || !depends.has("lifesteal") ) {
                LOGGER.error("Missing required dependencies in fabric.mod.json.");
                return false;
            }

            return true;
        } catch (Exception e) {
            LOGGER.error("Failed to read or parse the fabric.mod.json file", e);
            return false;
        }
    }

    private boolean isValidMixinJson() {
		try {
			// Load the eclipse.mixins.json file from the classpath
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream("eclipse.mixins.json");
	
			if (inputStream == null) {
				LOGGER.error("The eclipse.mixins.json file is missing from resources.");
				return false;
			}
	
			// Parse the JSON file
			JsonObject mixinJson = JsonParser.parseReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8)).getAsJsonObject();
	
			// Validate required fields
			if (!mixinJson.has("required") || !mixinJson.get("required").getAsBoolean()) {
				LOGGER.error("Mixin JSON does not have the required field set to true.");
				return false;
			}
	
			if (!mixinJson.has("package")) {
				LOGGER.error("Mixin JSON is missing the package field.");
				return false;
			}
	
			if (!mixinJson.has("mixins")) {
				LOGGER.error("Mixin JSON is missing the mixins field.");
				return false;
			}
	
			// Check if the mixins list contains the expected mixins
			JsonArray mixins = mixinJson.getAsJsonArray("mixins");
			Set<String> foundMixins = new HashSet<>();
	
			for (int i = 0; i < mixins.size(); i++) {
				foundMixins.add(mixins.get(i).getAsString());
			}
	
			if (!foundMixins.containsAll(EXPECTED_MIXINS)) {
				LOGGER.error("Some expected mixins are missing in eclipse.mixins.json.");
				return false;
			}
            if (mixinJson.has("client")) {
                JsonArray clientMixins = mixinJson.getAsJsonArray("client");
                Set<String> foundClientMixins = new HashSet<>();
                for (int i = 0; i < clientMixins.size(); i++) {
                    foundClientMixins.add(clientMixins.get(i).getAsString());
                }
                if (!foundClientMixins.containsAll(EXPECTED_CLIENT_MIXINS)) {
                    LOGGER.error("Some expected client mixins are missing in eclipse.mixins.json.");
                    return false;
                }
            } else if (!EXPECTED_CLIENT_MIXINS.isEmpty()) {
                LOGGER.error("Client-specific mixins section is missing in eclipse.mixins.json.");
                return false;
            }
			return true;
		} catch (Exception e) {
			LOGGER.error("Failed to read or parse the eclipse.mixins.json file", e);
			return false;
		}
	}}
