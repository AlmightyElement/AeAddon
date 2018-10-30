package almightyelement.AeAddon.proxy;

import almightyelement.AeAddon.ModClass;
import almightyelement.AeAddon.handlers.RegistryHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IThreadListener;
import net.minecraft.world.World;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy implements IProxy
{
    @Override
    public IThreadListener getContextListener()
    {
        return Minecraft.getMinecraft();
    }

    @Override
    public World getClientWorld()
    {
        return Minecraft.getMinecraft().world;
    }

    @Override
    public EntityPlayer getClientPlayer()
    {
        return Minecraft.getMinecraft().player;
    }

    @Override
    public int getViewDistance()
    {
        return Minecraft.getMinecraft().gameSettings.renderDistanceChunks;
    }

    @Override
    public void addToast(ItemStack icon, String langKey)
    {
 
    }
    
    @Override
	public void init(FMLInitializationEvent event) {	
	}

	
}
