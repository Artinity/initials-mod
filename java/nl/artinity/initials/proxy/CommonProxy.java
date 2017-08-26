package nl.artinity.initials.proxy;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nl.artinity.initials.handlers.RegistryHandler;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.Common();
	}
	
	public void init(FMLInitializationEvent event) {
		
	}

	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
