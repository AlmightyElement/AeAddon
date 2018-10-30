package almightyelement.AeAddon.handlers;

import almightyelement.AeAddon.init.ArmourInit;
import almightyelement.AeAddon.init.BlockInit;
import almightyelement.AeAddon.init.ItemInit;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipeHandler 
{
	public static void registerCrafting()
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("almightyelement:iskallium"), new ResourceLocation("almightyelement:kryptonite_blocks"), new ItemStack(BlockInit.iskallium), new Object[]{" S "," M ","   ", 'S', ItemInit.saw, 'M', Blocks.MAGMA});
		GameRegistry.addShapedRecipe(new ResourceLocation("almightyelement:kryptonite_ore"), new ResourceLocation("almightyelement:kryptonite_blocks"), new ItemStack(BlockInit.kryptonite_ore), new Object[]{"SSS","SIS","SSS",'S', Blocks.STONE, 'I', ItemInit.kryptonite});
		registerArmourCrafting(ArmourInit.kryptonite_helmet, ArmourInit.kryptonite_chestplate, ArmourInit.kryptonite_leggings, ArmourInit.kryptonite_boots, ItemInit.kryptonite);
		GameRegistry.addShapelessRecipe(new ResourceLocation("almightyelement:kryptonite"), new ResourceLocation("almightyelement:kryptonite_items"), new ItemStack(ItemInit.kryptonite, 9), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(BlockInit.kryptonite_block))});
		GameRegistry.addShapelessRecipe(new ResourceLocation("almightyelement:stripped_log"), new ResourceLocation("almightyelement:stripped_log"), new ItemStack(BlockInit.stripped_log, 1), new Ingredient[]{Ingredient.fromItem(Item.getItemFromBlock(Blocks.LOG)), Ingredient.fromItem(ItemInit.saw)});
	}
	
	public static void registerSmelting()
	{
		GameRegistry.addSmelting(BlockInit.kryptonite_ore, new ItemStack(ItemInit.kryptonite), 10);
		GameRegistry.addSmelting(BlockInit.kryptonite_ore_end, new ItemStack(ItemInit.kryptonite), 10);
		GameRegistry.addSmelting(BlockInit.kryptonite_ore_nether, new ItemStack(ItemInit.kryptonite), 10);
	}
	
	private static void registerToolCrafting(Item axe, Item hoe, Item pickaxe, Item shovel, Item sword, Item multitool, Item ingot)
	{
		
		GameRegistry.addShapedRecipe(new ResourceLocation("" + axe.getRegistryName()), new ResourceLocation("almightyelement:kryptonite_tools"), new ItemStack(axe), new Object[]{"II ","IS "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + hoe.getRegistryName()), new ResourceLocation("almightyelement:kryptonite_tools"), new ItemStack(hoe), new Object[]{"II "," S "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + pickaxe.getRegistryName()), new ResourceLocation("almightyelement:kryptonite_tools"), new ItemStack(pickaxe), new Object[]{"III"," S "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + shovel.getRegistryName()), new ResourceLocation("almightyelement:kryptonite_tools"), new ItemStack(shovel), new Object[]{" I "," S "," S ",'S', Items.STICK, 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + sword.getRegistryName()), new ResourceLocation("almightyelement:kryptonite_tools"), new ItemStack(sword), new Object[]{" I "," I "," S ",'S', Items.STICK, 'I', ingot});
	}
	
	private static void registerArmourCrafting(Item helmet, Item chestplate, Item leggings, Item boots, Item ingot)
	{
		GameRegistry.addShapedRecipe(new ResourceLocation("" + helmet.getRegistryName()), new ResourceLocation("almightyelement:kryptonite_armour"), new ItemStack(helmet), new Object[]{"III","I I","   ", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + chestplate.getRegistryName()), new ResourceLocation("almightyelement:kryptonite_armour"), new ItemStack(chestplate), new Object[]{"I I","III","III", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + leggings.getRegistryName()), new ResourceLocation("almightyelement:kryptonite_armour"), new ItemStack(leggings), new Object[]{"III","I I","I I", 'I', ingot});
		GameRegistry.addShapedRecipe(new ResourceLocation("" + boots.getRegistryName()), new ResourceLocation("almightyelement:kryptonite_armour"), new ItemStack(boots), new Object[]{"I I","I I", "   ", 'I', ingot});
	}
}
