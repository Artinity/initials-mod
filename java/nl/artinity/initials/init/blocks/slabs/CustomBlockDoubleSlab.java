package nl.artinity.initials.init.blocks.slabs;

import net.minecraft.block.material.Material;

public class CustomBlockDoubleSlab extends CustomBlockSlab {
	
	public CustomBlockDoubleSlab(String name, Material materialIn, float hardness, float resistance) {
		super(name, materialIn, hardness, resistance);
	}
	
	@Override
	public boolean isDouble() {
		return true;
	}
	
}
