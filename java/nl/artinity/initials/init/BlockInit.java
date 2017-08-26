package nl.artinity.initials.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import nl.artinity.initials.InitialsMod;
import nl.artinity.initials.init.blocks.CustomBlockStairs;
import nl.artinity.initials.init.blocks.CustomOre;
import nl.artinity.initials.init.blocks.CustomWood;
import nl.artinity.initials.init.blocks.fence.CustomBlockFence;
import nl.artinity.initials.init.blocks.fence.CustomBlockFenceGate;
import nl.artinity.initials.init.blocks.slabs.CustomBlockDoubleSlab;
import nl.artinity.initials.init.blocks.slabs.CustomBlockHalfSlab;

public class BlockInit {
	public static Block sample_ore, sample_ore_nether, sample_ore_end;
	public static Block night_planks, night_planks_stairs;
	public static CustomBlockHalfSlab night_planks_slab_half;
	public static CustomBlockDoubleSlab night_planks_slab_double;
	public static CustomBlockFence night_planks_fence;
	public static CustomBlockFenceGate night_planks_fence_gate;
	
	public static void init() {
		sample_ore = new CustomOre("sample_ore", 2.0F, 4.0F, HARVEST_LEVEL_IRON);
		sample_ore_nether = new CustomOre("sample_ore_nether", 2.0F, 4.0F, HARVEST_LEVEL_IRON);
		sample_ore_end = new CustomOre("sample_ore_end", 2.0F, 4.0F, HARVEST_LEVEL_IRON);
		night_planks = new CustomWood("night_planks", 2.0F, 4.0F, HARVEST_LEVEL_IRON);
		night_planks_stairs = new CustomBlockStairs("night_planks_stairs", night_planks.getDefaultState());
		night_planks_slab_half = new CustomBlockHalfSlab("night_planks_slab_half", Material.WOOD, 2.0F, 4.0F);
		night_planks_slab_double = new CustomBlockDoubleSlab("night_planks_slab_double", Material.WOOD, 2.0F, 4.0F);
		night_planks_fence = new CustomBlockFence("night_planks_fence", 2.5F, 4.5F);
		night_planks_fence_gate = new CustomBlockFenceGate("night_planks_fence", 2.5F, 4.5F);
	}
	
	public static void register() {
		registerBlock(sample_ore);
		registerBlock(sample_ore_nether);
		registerBlock(sample_ore_end);
		registerBlock(night_planks);
		registerBlock(night_planks_stairs);
		registerBlock(night_planks_slab_half, new ItemSlab(night_planks_slab_half, night_planks_slab_half, night_planks_slab_double));
		ForgeRegistries.BLOCKS.register(night_planks_slab_double);
		registerBlock(night_planks_fence);
		registerBlock(night_planks_fence_gate);
	}
	
	public static void registerBlock(Block block) {
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(InitialsMod.INITIALS_TAB);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(item);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	public static void registerBlock(Block block, ItemBlock itemBlock) {
		ForgeRegistries.BLOCKS.register(block);
		block.setCreativeTab(InitialsMod.INITIALS_TAB);
		
		itemBlock.setRegistryName(block.getRegistryName());
		ForgeRegistries.ITEMS.register(itemBlock);
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	}
	
	private static final int HARVEST_LEVEL_IRON = 2;
	private static final int HARVEST_LEVEL_DIAMOND = 3;
	
}
