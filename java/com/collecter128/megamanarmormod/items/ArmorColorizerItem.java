package com.collecter128.megamanarmormod.items;

import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;

public class ArmorColorizerItem extends Item {//implements ItemColor
	
	int backgroundColor;
	int highlightColor;

	public ArmorColorizerItem(Properties p_41383_, int backgroundColor, int highlightColor) {
		super(p_41383_);
		this.backgroundColor = backgroundColor;
		this.highlightColor = highlightColor;
		
	}
	
	public int getbackgroundColor() {
		return this.backgroundColor;
	}
	
	public int getHighlightColor() {
		return this.highlightColor;
	}

//	@Override
//	public int getColor(ItemStack p_92672_, int layer) {
//		return layer == 0 ? this.backgroundColor : this.highlightColor;
//		//return 0;
//	}

//	@Override
//	public int getColor(int layer) {
//		return layer == 0 ? this.backgroundColor : this.highlightColor;
//	}
}
