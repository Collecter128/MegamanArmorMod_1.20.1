package com.collecter128.megamanarmormod.init;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.items.ArmorColorizerItem;

import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@Mod.EventBusSubscriber(modid = MegamanArmorMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ColorsInit implements ItemColor{
	
	public static ColorsInit INSTANCE = new ColorsInit();
	
	@SubscribeEvent
	public static void registerItemColors(RegisterColorHandlersEvent.Item eventofItem)
	{
		eventofItem.register(INSTANCE, ItemInit.TestColorItem.get());
	}

	@Override
	public int getColor(ItemStack p_92672_, int p_92673_) {
		if(p_92672_.getItem() instanceof ArmorColorizerItem) {
			if(p_92672_.getItem() == ItemInit.TestColorItem.get()) {
				if(p_92673_ == 0){
					return 50;
				}
				else 
					return 400;
			}
		}
		return 0;
	}

}
