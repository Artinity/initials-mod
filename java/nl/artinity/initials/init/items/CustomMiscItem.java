package nl.artinity.initials.init.items;

import net.minecraft.item.Item;
import nl.artinity.initials.InitialsMod;

public class CustomMiscItem extends Item {
	
	public CustomMiscItem(String name) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(InitialsMod.INITIALS_TAB);
	}
	
}
