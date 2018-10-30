package almightyelement.AeAddon.init;

import java.util.HashSet;
import java.util.Set;

import com.google.common.base.Preconditions;

import almightyelement.AeAddon.Reference;
import almightyelement.AeAddon.init.blocks.slab.CustomBlockDoubleSlab;
import almightyelement.AeAddon.init.blocks.slab.CustomBlockHalfSlab;
import almightyelement.AeAddon.init.blocks.slab.CustomBlockSlab;
import almightyelement.AeAddon.init.blocks.slab.CustomSlab;
import almightyelement.AeAddon.util.Constants;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.registries.IForgeRegistry;


@ObjectHolder(Reference.MODID)
public class BlockInit 
{
	public static Block iskallium;
	public static Block kryptonite_ore, kryptonite_ore_nether, kryptonite_ore_end;
	public static Block kryptonite_block;
	public static Block kryptonite_stairs;
	public static CustomSlab kryptonite_slab_half;
	public static CustomSlab kryptonite_slab_double;
	public static Block stripped_log;
	public static Block smooth_sandstone;
	public static Block block3;
	public static Block block4;


@Mod.EventBusSubscriber(modid = Reference.MODID)
public static class RegistrationHandler {
	public static final Set<ItemBlock> ITEM_BLOCKS = new HashSet<>();


	/**
	 * Register this mod's {@link Block}s.
	 *
	 * @param event The event
	 */
	@SubscribeEvent
	public static void registerBlocks(final RegistryEvent.Register<Block> event) {
		final IForgeRegistry<Block> registry = event.getRegistry();

		final Block[] blocks = {
				iskallium,
				kryptonite_ore,
				kryptonite_ore_nether,
				kryptonite_ore_end,
				kryptonite_block,
				kryptonite_stairs,
				kryptonite_slab_half,
				kryptonite_slab_double,
				stripped_log,
				smooth_sandstone,
				block3,
				block4,

		};

		registry.registerAll(blocks);
		

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
				new ItemBlock(kryptonite_slab_half),
				new ItemBlock(kryptonite_slab_double),
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
		}

		registerTileEntities();
	}


private static void registerTileEntities() {
	
}

private static void registerTileEntity(final Class<? extends TileEntity> tileEntityClass, final String name) {
	GameRegistry.registerTileEntity(tileEntityClass, Constants.RESOURCE_PREFIX + name);
}
}
}