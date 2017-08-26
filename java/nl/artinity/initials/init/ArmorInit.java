package nl.artinity.initials.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import nl.artinity.initials.Variables;
import nl.artinity.initials.init.armour.CustomArmour;
import nl.artinity.initials.init.items.CustomIngot;

public class ArmorInit {
	
	public static final ArmorMaterial sample_armor_material = EnumHelper.addArmorMaterial("sample_armor_material", Variables.MODID + ":sample", 33, new int[]{3, 6, 8, 3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0F);
	public static Item sample_helmet;
	public static Item sample_chestplate;
	public static Item sample_leggings;
	public static Item sample_boots;
	
	public static void init() {
		sample_helmet = new CustomArmour("sample_helmet", sample_armor_material, 1, EntityEquipmentSlot.HEAD);
		sample_chestplate = new CustomArmour("sample_chestplate", sample_armor_material, 1, EntityEquipmentSlot.CHEST);
		sample_leggings = new CustomArmour("sample_leggings", sample_armor_material, 2, EntityEquipmentSlot.LEGS);
		sample_boots = new CustomArmour("sample_boots", sample_armor_material, 1, EntityEquipmentSlot.FEET);
		//Third arg (layer) is 1 for boots, chest, and helmet, but 2 for leggings
	}
	
	public static void register() {
		registerItem(sample_helmet);
		registerItem(sample_chestplate);
		registerItem(sample_leggings);
		registerItem(sample_boots);
	}
	
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
