package nl.artinity.initials.init.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import nl.artinity.initials.InitialsMod;
import static nl.artinity.initials.factories.PotionFactory.getNewPotionEffect;
import static nl.artinity.initials.factories.PotionFactory.NIGHT_VISION;

public class CustomFoodItem extends ItemFood {
	
	public CustomFoodItem(String name) {
		super(0, false);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		this.setAlwaysEdible();
		this.setPotionEffect(getNewPotionEffect(NIGHT_VISION, 50), 1.0F);
		
		setCreativeTab(InitialsMod.INITIALS_TAB);
	}
}
