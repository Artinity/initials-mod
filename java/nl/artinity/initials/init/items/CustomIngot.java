package nl.artinity.initials.init.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nl.artinity.initials.InitialsMod;

public class CustomIngot extends Item {
	
	public CustomIngot(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(InitialsMod.INITIALS_TAB);
	}
	
}
