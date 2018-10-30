package almightyelement.AeAddon.proxy;

import almightyelement.AeAddon.util.IListener;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IThreadListener;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;


public interface IProxy extends IListener
{
    IThreadListener getContextListener();

    World getClientWorld();

    EntityPlayer getClientPlayer();

    int getViewDistance();

    void addToast(ItemStack icon, String langKey);


}
