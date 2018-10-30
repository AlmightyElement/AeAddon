package almightyelement.AeAddon.init;

import almightyelement.AeAddon.Reference;
import almightyelement.AeAddon.ModClass;
import almightyelement.AeAddon.init.items.CustomIngot;
import almightyelement.AeAddon.init.items.CustomItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;

public class ItemInit 
{
	public static Item kryptonite;
	public static Item saw;

	
	public static void init()
	{
		kryptonite = new CustomIngot("kryptonite");
		saw = new CustomItem("saw");

	}
	
	public static void register()
	{
		registerItem(kryptonite);
		registerItem(saw);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(ModClass.kryptonitetab);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
