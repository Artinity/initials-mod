package nl.artinity.initials.handlers;

import net.minecraftforge.fml.common.registry.GameRegistry;
import nl.artinity.initials.gen.SampleOreGen;
import nl.artinity.initials.init.ArmorInit;
import nl.artinity.initials.init.BlockInit;
import nl.artinity.initials.init.ItemInit;
import nl.artinity.initials.init.ToolInit;

public class RegistryHandler {

	public static void Client() {
		RecipeHandler.registerCrafting();

		RecipeHandler.registerSmelting();
	}
	
	public static void Common() {
		ItemInit.init();
		ItemInit.register();
		
		BlockInit.init();
		BlockInit.register();
		
		ArmorInit.init();
		ArmorInit.register();
		
		ToolInit.init();
		ToolInit.register();
		
		GameRegistry.registerWorldGenerator(new SampleOreGen(), 0);
	}
}
