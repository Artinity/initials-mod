package nl.artinity.initials.gen;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import nl.artinity.initials.init.BlockInit;

public class SampleOreGen implements IWorldGenerator {
	private WorldGenerator sample_ore, nether, end;
	
	public SampleOreGen() {
		sample_ore = new WorldGenMinable(BlockInit.sample_ore.getDefaultState(), 9);
		nether = new WorldGenMinable(BlockInit.sample_ore_nether.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.NETHERRACK));
		end = new WorldGenMinable(BlockInit.sample_ore_end.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.END_STONE));
	}
	
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		
		//Btw, these chances of 50 are ridiculously high.
		case 0:
			runGenerator(sample_ore, world, random, chunkX, chunkZ, 50, 0, 255);
			break;
		case 1://end
			runGenerator(end, world, random, chunkX, chunkZ, 50, 0, 50);
			break;
		case -1:
			runGenerator(nether, world, random, chunkX, chunkZ, 50, 0, 50);
			break;
		}
		
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int ChunkX, int ChunkZ, int chance, int minHeight, int maxHeight) {
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 255) {
			throw new IllegalArgumentException("Ore generated out of bounds.");
		}
		int heightDif = maxHeight - minHeight + 1;
		for(int i = 0; i < chance; i++) {
			int x = ChunkX*16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDif);
			int z = ChunkZ*16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}

}
