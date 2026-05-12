package com.collecter128.megamanarmormod.items.client;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.init.ItemInit;
import com.collecter128.megamanarmormod.items.ColorizableMegamanArmorItem;
import com.collecter128.megamanarmormod.items.MegamanArmorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import software.bernie.geckolib.model.GeoModel;

public class ColorrizableMegamanArmorModel extends GeoModel<ColorizableMegamanArmorItem>{
	 @Override
	    public ResourceLocation getModelResource(ColorizableMegamanArmorItem animatable) {

		 
//		 if(animatable.asItem() == ItemInit.MegamanArmorHelmet.get()) {
			 //return new ResourceLocation(MegamanArmorMod.MODID, "geo/megaman_helmet.geo.json");
			 return new ResourceLocation(MegamanArmorMod.MODID, "geo/" + animatable.GeoModelString + ".geo.json");
//		 }
//		 else if(animatable.asItem() == ItemInit.MegamanArmorChestplate.get()) {
//			 return new ResourceLocation(MegamanArmorMod.MODID, "geo/megaman_chestplate.geo.json");
//		 }
//		 else if(animatable.asItem() == ItemInit.MegamanArmorLegs.get()) {
//			 return new ResourceLocation(MegamanArmorMod.MODID, "geo/megaman_legs.geo.json");
//		 }
//		 else if(animatable.asItem() == ItemInit.MegamanArmorBoots.get()) {
//			 return new ResourceLocation(MegamanArmorMod.MODID, "geo/megaman_boots.geo.json");
//		 }
//		 else if(animatable.asItem() == ItemInit.MegamanExeHelmet.get()) {
//			 return new ResourceLocation(MegamanArmorMod.MODID, "geo/megamanexe_helmet.geo.json");
//		 }
//		 else if(animatable.asItem() == ItemInit.MegamanExeChestplate.get()) {
//			 return new ResourceLocation(MegamanArmorMod.MODID, "geo/megamanexe_chestplate.geo.json");
//		 }
//		 else if(animatable.asItem() == ItemInit.MegamanExeLegs.get()) {
//			 return new ResourceLocation(MegamanArmorMod.MODID, "geo/megamanexe_legs.geo.json");
//		 }
//		 else if(animatable.asItem() == ItemInit.MegamanExeBoots.get()) {
//			 return new ResourceLocation(MegamanArmorMod.MODID, "geo/megamanexe_boots.geo.json");
//		 }
//		 else
//			 return new ResourceLocation(MegamanArmorMod.MODID, "geo/megaman_helmet.geo.json");
		 
		 
	    }
	 
	 	

	    @Override
	    public ResourceLocation getTextureResource(ColorizableMegamanArmorItem animatable) {
	    	
	    	return new ResourceLocation(MegamanArmorMod.MODID, "textures/armor/" + animatable.TextureModelString + ".png");
//	    	if(animatable.asItem() == ItemInit.MegamanArmorHelmet.get()||
//	    		animatable.asItem() == ItemInit.MegamanArmorChestplate.get()||
//	    		animatable.asItem() == ItemInit.MegamanArmorLegs.get()||
//	    				animatable.asItem() == ItemInit.MegamanArmorBoots.get()
//	    			) {
//	    		return new ResourceLocation(MegamanArmorMod.MODID, "textures/armor/megaman_armor.png");
//	    	}
//	    	else if(animatable.asItem() == ItemInit.MegamanExeHelmet.get()||
//		    		animatable.asItem() == ItemInit.MegamanExeChestplate.get()||
//		    		animatable.asItem() == ItemInit.MegamanExeLegs.get()||
//		    				animatable.asItem() == ItemInit.MegamanExeBoots.get()
//		    			) {
//		    		return new ResourceLocation(MegamanArmorMod.MODID, "textures/armor/megamanexe_armor.png");
//		    	}
//	    	else
//	    		return new ResourceLocation(MegamanArmorMod.MODID, "textures/armor/megaman_armor.png");
	    }

	    @Override
	    public ResourceLocation getAnimationResource(ColorizableMegamanArmorItem animatable) {
	    	
	    	return new ResourceLocation(MegamanArmorMod.MODID, "animations/" + animatable.AnimationModelString + ".animation.json");
//	    	if(animatable.asItem() == ItemInit.MegamanArmorHelmet.get()) {
//				 return new ResourceLocation(MegamanArmorMod.MODID, "animations/megaman_helmet.animation.json");
//			 }
//	    	else if(animatable.asItem() == ItemInit.MegamanArmorChestplate.get()) {
//				 return new ResourceLocation(MegamanArmorMod.MODID, "animations/megaman_chestplate.animation.json");
//			 }
//	    	else if(animatable.asItem() == ItemInit.MegamanArmorLegs.get()) {
//				 return new ResourceLocation(MegamanArmorMod.MODID, "animations/megaman_legs.animation.json");
//			 }
//	    	else if(animatable.asItem() == ItemInit.MegamanArmorBoots.get()) {
//				 return new ResourceLocation(MegamanArmorMod.MODID, "animations/megaman_boots.animation.json");
//			 }
//	    	else if(animatable.asItem() == ItemInit.MegamanExeHelmet.get()) {
//				 return new ResourceLocation(MegamanArmorMod.MODID, "animations/megamanexe_helmet.animation.json");
//			 }
//			 else if(animatable.asItem() == ItemInit.MegamanExeChestplate.get()) {
//				 return new ResourceLocation(MegamanArmorMod.MODID, "animations/megamanexe_chestplate.animation.json");
//			 }
//			 else if(animatable.asItem() == ItemInit.MegamanExeLegs.get()) {
//				 return new ResourceLocation(MegamanArmorMod.MODID, "animations/megamanexe_legs.animation.json");
//			 }
//			 else if(animatable.asItem() == ItemInit.MegamanExeBoots.get()) {
//				 return new ResourceLocation(MegamanArmorMod.MODID, "animations/megamanexe_boots.animation.json");
//			 }
//			 else
//				 return new ResourceLocation(MegamanArmorMod.MODID, "animations/megaman_helmet.animation.json");
	    }

}
