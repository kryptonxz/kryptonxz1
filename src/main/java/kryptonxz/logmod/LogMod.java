package kryptonxz.logmod;

import kryptonxz.logmod.item.ModItems;
import kryptonxz.logmod.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import kryptonxz.logmod.item.ModItems;
import kryptonxz.logmod.proxy.CommonProxy;

@Mod(modid = LogMod.modId, name = LogMod.name, version = LogMod.version, acceptedMinecraftVersions = "[1.12.2]")
public class LogMod {

	public static final String modId = "kxz_lm";
	public static final String name = "Log Mod";
	public static final String version = "0.1.0";

	@Mod.Instance(modId)
	public static LogMod instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	@SidedProxy(serverSide = "kryptonxz.logmod.proxy.CommonProxy", clientSide = "kryptonxz.logmod.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) 
		{
			ModItems.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			ModItems.registerModels();
		}
	}
}