package nl.artinity.initials.handlers;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nl.artinity.initials.init.BlockInit;
import nl.artinity.initials.init.ItemInit;

public class RecipeHandler {
	public static void registerCrafting() {
		GameRegistry.addShapedRecipe(new ResourceLocation("in:nightmare_apple_recipe"), new ResourceLocation("in:initials_recipes"), 
				new ItemStack(ItemInit.nightmare_apple), new Object[] {"III", "IAI", "III", 'I', ItemInit.nightmare_ingot, 'A', Items.APPLE});
		GameRegistry.addShapelessRecipe(new ResourceLocation("in:night_planks"), new ResourceLocation("in:initials_recipes"), 
				new ItemStack(BlockInit.night_planks), 
				new Ingredient[]{
							Ingredient.fromItem(Item.getItemFromBlock(Blocks.PLANKS)),
							Ingredient.fromItem(ItemInit.nightmare_dust)
						});
	}
	
	public static void registerSmelting() {
		GameRegistry.addSmelting(BlockInit.sample_ore, new ItemStack(ItemInit.nightmare_ingot), 1.0F);
	}
	
	private static void registerToolCrafting(Item pickaxe, Item ingot) {
		
	}
	
	private static void registerArmorCrafting(Item helmet, Item leggings, Item chestplate, Item boots, Item ingot) {
		GameRegistry.addShapedRecipe(new ResourceLocation("in:nightmare_apple_recipe"), new ResourceLocation("in:sample_blocks"), 
				new ItemStack(ItemInit.nightmare_apple), new Object[] {"III", "IAI", "III", 'I', ItemInit.nightmare_ingot, 'A', Items.APPLE});
	}
}
