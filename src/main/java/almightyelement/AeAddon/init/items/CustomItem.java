package almightyelement.AeAddon.init.items;

import almightyelement.AeAddon.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class CustomItem extends Item {
	
	private ItemStack emptyItem = ItemStack.EMPTY;
	private static int maxDamage = 128;
	
	public CustomItem(String name)
	{
		super();
		setMaxStackSize(0);
        setNoRepair();
        setMaxDamage(128);
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	

	
	public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
        return false;
    }
 
    @Override
    public boolean getShareTag()
    {
        return true;
    }
 
    public boolean hasContainerItem(ItemStack itemStack)
    {
      return true;
    }
  
    
    public ItemStack getContainerItem(ItemStack itemStack)
    {
    	itemStack.setItemDamage(itemStack.getItemDamage() + 1);
        ItemStack stack = itemStack.copy();
        if (stack.getItemDamage() == 128){
        	return emptyItem;
        }
       
        else{
        	return stack;
        }
      
    }
}

