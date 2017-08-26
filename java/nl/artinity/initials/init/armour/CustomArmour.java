package nl.artinity.initials.init.armour;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import nl.artinity.initials.InitialsMod;

public class CustomArmour extends ItemArmor {

	public CustomArmour(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(InitialsMod.INITIALS_TAB);
	}
	
}
