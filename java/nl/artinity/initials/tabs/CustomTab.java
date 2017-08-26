package nl.artinity.initials.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import nl.artinity.initials.init.ItemInit;

public class CustomTab extends CreativeTabs {
	/*private static final Item icon = ItemInit.nightmare_apple;*/
	
	/**
	 * Constructor. Calls super and sets the tab's icon.
	 * 
	 * @param title the name of the tab. Only used as a technical reference; for a more human-
	 * 				readable format, translate this in the .lang files.
	 * @param icon  the item that will serve as a distinguishing icon for this tab.
	 */
	public CustomTab(String title/*, Item iconItem*/) {
		super(title);
		/*this.icon = iconItem*/
		
		//This next line is not supposed to be here.
		this.setBackgroundImageName("sample.png");
	}
	
	/**
	 * Another constructor. Uses the other one, but also sets a background image for the tab.
	 * 
	 * @param title the name of the tab. Only used as a technical reference; for a more human-
	 * 				readable format, translate this in the .lang files.
	 * @param icon  the item that will serve as a distinguishing icon for this tab.
	 * @param backgroundImage the file name for the background image, e.g. "sample.png"; the
	 * 						  game will look for "tab_sample.png" in the minecraft GUI assets.
	 */
	public CustomTab(String title, Item iconItem, String backgroundImage) {
		this(title/*, iconItem*/);
		this.setBackgroundImageName(backgroundImage);
	}

	@Override
	public ItemStack getTabIconItem() {
		// Tried make this less hard-coded, but it does not seem to want to...
		return new ItemStack(ItemInit.nightmare_apple);
	}
}
