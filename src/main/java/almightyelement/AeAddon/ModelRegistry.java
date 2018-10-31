package almightyelement.AeAddon;

import almightyelement.AeAddon.ModClass;
import almightyelement.AeAddon.init.BlockInit;
import almightyelement.AeAddon.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MODID)
public final class ModelRegistry {

	private static final String DEFAULT_VARIANT = "normal";

	@SubscribeEvent
	public static void onRegisterModelsEvent(final ModelRegistryEvent event) {

		registerTileEntitySpecialRenderers();
	

		registerEntityRenderers();

		/* item blocks */
		registerItemBlockModel(BlockInit.iskallium);
		registerItemBlockModel(BlockInit.kryptonite_ore);
		registerItemBlockModel(BlockInit.kryptonite_ore_nether);
		registerItemBlockModel(BlockInit.kryptonite_ore_end);
		registerItemBlockModel(BlockInit.kryptonite_block);
		registerItemBlockModel(BlockInit.kryptonite_stairs);
		registerItemBlockModel(BlockInit.stripped_log);
		registerItemBlockModel(BlockInit.smooth_sandstone);
		registerItemBlockModel(BlockInit.block3);
		registerItemBlockModel(BlockInit.block4);


		/* items */
		registerItemModel(ItemInit.kryptonite);
		registerItemModel(ItemInit.saw);


	}

	private static void registerTileEntitySpecialRenderers() {
//		ClientRegistry.bindTileEntitySpecialRenderer(TileEntity___.class, new TileEntity___Renderer());
	}

	private static void registerEntityRenderers() {
//		RenderingRegistry.registerEntityRenderingHandler(Entity___.class, renderManager -> new Entity___Renderer(renderManager));
	}

	private static void registerItemModel(final Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), DEFAULT_VARIANT));
	}

	private static void registerItemBlockModel(final Block block) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), DEFAULT_VARIANT));
	}

}
