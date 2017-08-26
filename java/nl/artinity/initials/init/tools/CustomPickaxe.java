package nl.artinity.initials.init.tools;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import nl.artinity.initials.InitialsMod;

public class CustomPickaxe extends ItemPickaxe {
	public CustomPickaxe(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(InitialsMod.INITIALS_TAB);
	}
}
