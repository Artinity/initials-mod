package nl.artinity.initials.init.blocks.slabs;

import java.util.Random;

import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nl.artinity.initials.init.BlockInit;

public abstract class CustomBlockSlab extends BlockSlab {

	public CustomBlockSlab(String name, Material materialIn, float hardness, float resistance) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setHardness(hardness);
		setResistance(resistance);
		setHarvestLevel("axe", 0);
		
		IBlockState state = this.blockState.getBaseState();
		
		if(!this.isDouble()) {
			state = state.withProperty(HALF, EnumBlockHalf.BOTTOM);
		}
		
		setDefaultState(state);
		this.useNeighborBrightness = true;
	}

	@Override
	public String getUnlocalizedName(int meta) {
		return super.getUnlocalizedName();
	}
	
	@Override
	public IProperty<?> getVariantProperty() {
		return HALF;
	}
	
	@Override
	public Comparable<?> getTypeForItem(ItemStack stack) {
		//This always gives 0. I dont think anything usable is contained in 'stack'.
		System.out.println(/*getStateFromMeta(*/stack.getMetadata()/*).getValue(HALF)*/);
		
		//This makes it so double slabs can only be made bottom-first. Putting TOP there reverses that.
		// However, how to enable both?
		return EnumBlockHalf.BOTTOM;
		
		//Those don't work either.
		//return this.getStateFromMeta(stack.getMetadata() & 7).getValue(HALF);
		//return BlockPlanks.EnumType.byMetadata(stack.getMetadata() & 7);
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return 0;
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		if(!this.isDouble()) {
			return getDefaultState().withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
			
			//This one apparently breaks the slabs when logging in (turns them all into top slabs):
			//return this.getDefaultState().withProperty(HALF, EnumBlockHalf.values()[meta % EnumBlockHalf.values().length]);
		}
		//If we don't have any metadata, return the default state
		return this.getDefaultState();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
//		if(!this.isDouble()) {
//			return 0;
//		}
//		return ((EnumBlockHalf)state.getValue(HALF)).ordinal() + 1;
		int i = 0;

        if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)
        {
            i |= 8;
        }

        return i;
	}
	
	@Override
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(BlockInit.night_planks_slab_half);
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {HALF});
	}
}
