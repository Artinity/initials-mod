package nl.artinity.initials.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomOre extends CustomBlock {

	public CustomOre(String name, float hardness, float resistance, int harvestLevel) {
		super(name, Material.ROCK, hardness, resistance);
		setHarvestLevel("pickaxe", harvestLevel);
	}

}
