package nl.artinity.initials.init.blocks.fence;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class CustomBlockFence extends BlockFence {

	public CustomBlockFence(String name, float hardness, float resistance) {
		super(Material.WOOD, Material.WOOD.getMaterialMapColor());
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setHardness(hardness);
		setResistance(resistance);
		
		this.useNeighborBrightness = true;
	}
	
}
