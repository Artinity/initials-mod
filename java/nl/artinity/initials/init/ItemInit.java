package nl.artinity.initials.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nl.artinity.initials.Variables;
import nl.artinity.initials.init.items.CustomFoodItem;
import nl.artinity.initials.init.items.CustomIngot;
import nl.artinity.initials.init.items.CustomMiscItem;

public class ItemInit {
	public static Item nightmare_ingot;
	public static Item nightmare_apple;
	public static Item nightmare_dust;
	
	public static void init() {
		nightmare_ingot = new CustomIngot("nightmare_ingot");
		nightmare_apple = new CustomFoodItem("nightmare_apple");
		nightmare_dust = new CustomMiscItem("nightmare_dust");
	}
	
	public static void register() {
		registerItem(nightmare_ingot);
		registerItem(nightmare_apple);
		registerItem(nightmare_dust);
	}
	
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
