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


public class ArmourInit 
{
	public static final ArmorMaterial kryptonite_armour = EnumHelper.addArmorMaterial("kryptonite_armour", Reference.MODID + ":kryptonite", 25, new int[]{3, 5, 7, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
	public static Item kryptonite_helmet, kryptonite_chestplate, kryptonite_leggings, kryptonite_boots;


@Mod.EventBusSubscriber(modid = Reference.MODID)
public static class RegistrationHandler {

	/**
	 * Register this mod's {@link Block}s.
	 *
	 * @param event The event
	 */
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Item> event) {
		final IForgeRegistry<Item> registry = event.getRegistry();

		final Item[] items = {
				kryptonite_helmet = new CustomArmour("kryptonite_helmet", kryptonite_armour, 1, EntityEquipmentSlot.HEAD).setCreativeTab(ModClass.kryptonitetab),
				kryptonite_chestplate = new CustomArmour("kryptonite_chestplate", kryptonite_armour, 1, EntityEquipmentSlot.CHEST).setCreativeTab(ModClass.kryptonitetab),
				kryptonite_leggings = new CustomArmour("kryptonite_leggings", kryptonite_armour, 2, EntityEquipmentSlot.LEGS).setCreativeTab(ModClass.kryptonitetab),
				kryptonite_boots = new CustomArmour("kryptonite_boots", kryptonite_armour, 1, EntityEquipmentSlot.FEET).setCreativeTab(ModClass.kryptonitetab),

		};

		registry.registerAll(items);
		ForgeRegistries.ITEMS.registerAll(items);
		
		ModelLoader.setCustomModelResourceLocation(kryptonite_helmet, 0, new ModelResourceLocation(kryptonite_helmet.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(kryptonite_chestplate, 0, new ModelResourceLocation(kryptonite_chestplate.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(kryptonite_leggings, 0, new ModelResourceLocation(kryptonite_leggings.getRegistryName(), "inventory"));
		ModelLoader.setCustomModelResourceLocation(kryptonite_boots, 0, new ModelResourceLocation(kryptonite_boots.getRegistryName(), "inventory"));
		

	}

	/**
	 * Register this mod's {@link ItemBlock}s.
	 *
	 * @param event The event
	 */

	
	}


private static void registerTileEntities() {
	
}

private static void registerTileEntity(final Class<? extends TileEntity> tileEntityClass, final String name) {
	GameRegistry.registerTileEntity(tileEntityClass, Reference.MODID + ":" + name);
}
}
