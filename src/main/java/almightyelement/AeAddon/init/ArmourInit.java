package almightyelement.AeAddon.init;

import almightyelement.AeAddon.Reference;
import almightyelement.AeAddon.ModClass;
import almightyelement.AeAddon.init.armour.CustomArmour;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class ArmourInit 
{
	public static final ArmorMaterial kryptonite_armour = EnumHelper.addArmorMaterial("kryptonite_armour", Reference.MODID + ":kryptonite", 25, new int[]{3, 5, 7, 2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 1.5F);
	
	public static Item kryptonite_helmet, kryptonite_chestplate, kryptonite_leggings, kryptonite_boots;
	
	public static void init()
	{
		kryptonite_helmet = new CustomArmour("kryptonite_helmet", kryptonite_armour, 1, EntityEquipmentSlot.HEAD);
		kryptonite_chestplate = new CustomArmour("kryptonite_chestplate", kryptonite_armour, 1, EntityEquipmentSlot.CHEST);
		kryptonite_leggings = new CustomArmour("kryptonite_leggings", kryptonite_armour, 2, EntityEquipmentSlot.LEGS);
		kryptonite_boots = new CustomArmour("kryptonite_boots", kryptonite_armour, 1, EntityEquipmentSlot.FEET);
	}
	
	public static void register()
	{
		registerItem(kryptonite_helmet);
		registerItem(kryptonite_chestplate);
		registerItem(kryptonite_leggings);
		registerItem(kryptonite_boots);
	}
	
	public static void registerItem(Item item)
	{
		ForgeRegistries.ITEMS.register(item);
		item.setCreativeTab(ModClass.kryptonitetab);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
}
