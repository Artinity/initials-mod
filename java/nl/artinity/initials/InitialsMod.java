package nl.artinity.initials;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import nl.artinity.initials.init.ItemInit;
import nl.artinity.initials.proxy.CommonProxy;
import nl.artinity.initials.tabs.CustomTab;

@Mod(modid = Variables.MODID, name = Variables.NAME, version = Variables.VERSION)
public class InitialsMod {
	
	public static final CreativeTabs INITIALS_TAB = new CustomTab("initials_tab");
	
	//Is this annotation connecting to the line below it?
	@SidedProxy(clientSide = Variables.CLIENTPROXY, serverSide = Variables.COMMONPROXY)
	
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		proxy.init(event);
	}

	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
	}
}
