package almightyelement.AeAddon;

import almightyelement.AeAddon.init.BlockInit;
import almightyelement.AeAddon.init.ItemInit;
import almightyelement.AeAddon.proxy.ClientProxy;
import almightyelement.AeAddon.tabs.kryptoniteTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ModClass 
{	
	public static final CreativeTabs kryptonitetab = new kryptoniteTab("AeAddon");
	
	@SidedProxy(clientSide = Reference.CLIENTPROXY)
	public static ClientProxy proxy;
	
	@Mod.EventHandler
	public static void preInit(FMLPreInitializationEvent event)
	{
		proxy.preInit(event);
	}
	
	@Mod.EventHandler
	public static void init(FMLInitializationEvent event)
	{
		proxy.init(event);
		
	}
	
	@Mod.EventHandler
	public static void postInit(FMLPostInitializationEvent event)
	{
		BlockInit.stripped_log.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		BlockInit.smooth_sandstone.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
		ItemInit.saw.setCreativeTab(CreativeTabs.TOOLS);
		proxy.postInit(event);
	}
}
