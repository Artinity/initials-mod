package nl.artinity.initials.init;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import nl.artinity.initials.init.tools.CustomPickaxe;

public class ToolInit {
	
	public static final ToolMaterial sample = EnumHelper.addToolMaterial("sample", 3, 500, 8.0F, 2.5F, 8);
	public static Item sample_pickaxe;
	
	public static void init() {
		sample_pickaxe = new CustomPickaxe("sample_pickaxe", sample);
	}
	
	public static void register() {
		registerItem(sample_pickaxe);
	}
	
	public static void registerItem(Item item) {
		ForgeRegistries.ITEMS.register(item);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		//Minecraft.getMinecraft().getRenderItem()
		//.getItemModelMesher().register(item, 0, 
		//		new ModelResourceLocation(Variables.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}
}
