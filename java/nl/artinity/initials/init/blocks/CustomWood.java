package nl.artinity.initials.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomWood extends CustomBlock {

	public CustomWood(String name, float hardness, float resistance, int harvestLevel) {
		super(name, Material.WOOD, hardness, resistance);
		setHarvestLevel("axe", harvestLevel);
	}

}
