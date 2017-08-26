package nl.artinity.initials.init.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CustomBlock extends Block {

	/**
	 * Constructor for all CustomBlocks.
	 * 
	 * @param name 		 the name of the block.
	 * @param material 	 the material group this block is in, e.g. Material.ROCK.
	 * @param hardness 	 basically, how long it takes to mine.
	 * @param resistance the block's resistance to explosions.
	 */
	public CustomBlock(String name, Material material, float hardness, float resistance) {
		super(material);

		setUnlocalizedName(name);
		setRegistryName(name);

		setHardness(hardness);
		setResistance(resistance);
	}
}
