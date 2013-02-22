package ml.boxes;

import ml.boxes.data.ItemIBox;
import ml.boxes.item.ItemBox;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

public class BoxesCreativeTab extends CreativeTabs {

	public BoxesCreativeTab(String label) {
		super(label);
	}

	@Override
	public ItemStack getIconItemStack() {
		ItemStack is = new ItemStack(Boxes.BlockBox);
		ItemIBox iib = new ItemIBox(is);
		iib.getBoxData().boxColor = ItemDye.dyeColors[12];
		iib.saveData();
		return is;
	}
	
}
