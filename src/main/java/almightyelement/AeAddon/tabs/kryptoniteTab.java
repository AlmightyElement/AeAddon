package almightyelement.AeAddon.tabs;

import almightyelement.AeAddon.init.BlockInit;
import almightyelement.AeAddon.init.ItemInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class kryptoniteTab extends CreativeTabs
{
	public kryptoniteTab(String label) { super("kryptonitetab"); 
	this.setBackgroundImageName("kryptonite.png");}
	public ItemStack getTabIconItem() { return new ItemStack(ItemInit.kryptonite);
	
}
	}


