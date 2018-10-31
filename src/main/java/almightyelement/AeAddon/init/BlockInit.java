package almightyelement.AeAddon.init;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;

import almightyelement.AeAddon.ModClass;
import almightyelement.AeAddon.Reference;
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
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;
import net.minecraftforge.registries.IForgeRegistry;


public class BlockInit 
{
	public static Block iskallium;
	public static Block kryptonite_ore, kryptonite_ore_nether, kryptonite_ore_end;
	public static Block kryptonite_block;
	public static Block kryptonite_stairs;
	public static Block stripped_log;
	public static Block smooth_sandstone;
	public static Block block3;
	public static Block block4;


@Mod.EventBusSubscriber(modid = Reference.MODID)
public static class RegistrationHandler {
	public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<ItemBlock>();


	/**
	 * Register this mod's {@link Block}s.
	 *
	 * @param event The event
	 */
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		final IForgeRegistry<Block> registry = event.getRegistry();

		final Block[] blocks = {
				iskallium = new CustomLightBlock("iskallium", 2.5F, 4.5F).setCreativeTab(ModClass.kryptonitetab),
				kryptonite_ore = new CustomOre("kryptonite_ore", 2.0F, 4.0F, 2).setCreativeTab(ModClass.kryptonitetab),
				kryptonite_ore_nether = new CustomOre("kryptonite_ore_nether", 2.0F, 4.0F, 2).setCreativeTab(ModClass.kryptonitetab),
				kryptonite_ore_end = new CustomOre("kryptonite_ore_end", 2.0F, 4.0F, 2).setCreativeTab(ModClass.kryptonitetab),
				kryptonite_block= new CustomIngotBlock("kryptonite_block", 2.5F, 4.5F, 2).setCreativeTab(ModClass.kryptonitetab),
				kryptonite_stairs = new CustomBlockStairs("kryptonite_stairs", kryptonite_block.getDefaultState()).setCreativeTab(ModClass.kryptonitetab),
				stripped_log = new CustomLog("stripped_log",2.5F, 4.5F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS),
				smooth_sandstone = new CustomBlock("smooth_sandstone",2.5F, 4.5F).setCreativeTab(CreativeTabs.BUILDING_BLOCKS),
				block3 = new CustomBlock("block3",2.5F, 4.5F).setCreativeTab(ModClass.kryptonitetab),
				block4 = new CustomBlock("block4",2.5F, 4.5F).setCreativeTab(ModClass.kryptonitetab),

		};

		registry.registerAll(blocks);
		ForgeRegistries.BLOCKS.registerAll(blocks);

		

	}
	public static void registerRecipes(final RegistryEvent.Register<IRecipe> event) {
		final IForgeRegistry<IRecipe> registry = event.getRegistry();
	}


	/**
	 * Register this mod's {@link ItemBlock}s.
	 *
	 * @param event The event
	 */

	@SubscribeEvent
	public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
		final ItemBlock[] items = {
				new ItemBlock(iskallium),
				new ItemBlock(kryptonite_ore),
				new ItemBlock(kryptonite_ore_nether),
				new ItemBlock(kryptonite_ore_end),
				new ItemBlock(kryptonite_block),
				new ItemBlock(kryptonite_stairs),
				new ItemBlock(stripped_log),
				new ItemBlock(smooth_sandstone),
				new ItemBlock(block3),
				new ItemBlock(block4),

		};
		
		
		
		final IForgeRegistry<Item> registry = event.getRegistry();

		for (final ItemBlock item : items) {
			final Block block = item.getBlock();
			final ResourceLocation registryName = Preconditions.checkNotNull(block.getRegistryName(), "Block %s has null registry name", block);
			registry.register(item.setRegistryName(registryName));
			
			ITEM_BLOCKS.add(item);
			
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
	/**
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(iskallium), 0, new ModelResourceLocation(iskallium.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block3), 0, new ModelResourceLocation(block3.getRegistryName(), "inventory"));
			ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block4), 0, new ModelResourceLocation(block4.getRegistryName(), "inventory"));
	**/
		
		}

		registerTileEntities();
		ForgeRegistries.ITEMS.registerAll(items);
	
	}
}



private static void registerTileEntities() {
}

private static void registerTileEntity(final Class<? extends TileEntity> tileEntityClass, final String name) {
	GameRegistry.registerTileEntity(tileEntityClass, Reference.MODID + ":" + name);
}
}
