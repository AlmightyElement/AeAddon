package almightyelement.AeAddon.init;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;

import almightyelement.AeAddon.ModClass;
import almightyelement.AeAddon.Reference;
import almightyelement.AeAddon.init.armour.CustomArmour;
import almightyelement.AeAddon.init.blocks.CustomBlock;
import almightyelement.AeAddon.init.blocks.CustomBlockStairs;
import almightyelement.AeAddon.init.blocks.CustomIngotBlock;
import almightyelement.AeAddon.init.blocks.CustomLightBlock;
import almightyelement.AeAddon.init.blocks.CustomLog;
import almightyelement.AeAddon.init.blocks.CustomOre;
import almightyelement.AeAddon.init.blocks.slab.CustomBlockDoubleSlab;
import almightyelement.AeAddon.init.blocks.slab.CustomBlockHalfSlab;
import almightyelement.AeAddon.init.blocks.slab.CustomBlockSlab;
import almightyelement.AeAddon.init.blocks.slab.CustomSlab;
import almightyelement.AeAddon.init.items.CustomIngot;
import almightyelement.AeAddon.init.items.CustomItem;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;


public class ItemInit 
{
	public static Item kryptonite;
	public static Item saw;


@Mod.EventBusSubscriber(modid = Reference.MODID)
public static class RegistrationHandler {
	public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();


	/**
	 * Register this mod's {@link Block}s.
	 *
	 * @param event The event
	 */
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		final Item[] items = {
				kryptonite = new CustomIngot("kryptonite").setCreativeTab(ModClass.kryptonitetab),
				saw = new CustomItem("saw").setCreativeTab(ModClass.kryptonitetab),

		};

		registry.registerAll(items);

	}

	/**
	 * Register this mod's {@link ItemBlock}s.
	 *
	 * @param event The event
	 */

	
	}


}
