package kryptonxz.logmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import kryptonxz.logmod.LogMod;

public class ModItems {

	public static ItemBase unicornSapling = new ItemBase("unicorn_sapling").setCreativeTab(CreativeTabs.MATERIALS);

	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(
			unicornSapling
		);
	}

	public static void registerModels() {
		unicornSapling.registerItemModel();
	}

	
}
