package nl.artinity.initials.init.blocks.slabs;

import net.minecraft.block.material.Material;

public class CustomBlockHalfSlab extends CustomBlockSlab {

	public CustomBlockHalfSlab(String name, Material materialIn, float hardness, float resistance) {
		super(name, materialIn, hardness, resistance);
	}
	
	@Override
	public boolean isDouble() {
		return false;
	}
	
}
