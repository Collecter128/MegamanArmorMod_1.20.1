package com.collecter128.megamanarmormod.items.client;

import org.jetbrains.annotations.NotNull;

import com.collecter128.megamanarmormod.items.MegamanArmorItem;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.entity.EquipmentSlot;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.core.object.Color;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.DyeableGeoArmorRenderer;

public class MegamanArmorRenderer extends GeoArmorRenderer<MegamanArmorItem> {
	public MegamanArmorRenderer() {
        super(new MegamanArmorModel());
        //this.renderType.equals(RenderType.translucent());
    }
	
	@Override
	protected void applyBoneVisibilityBySlot(EquipmentSlot currentSlot) {
		setAllBonesVisible(false);
		HumanoidModel<?> model = this;

		switch (currentSlot) {
		case HEAD -> setBoneVisible(this.head, model.head.visible);
		//setBoneVisible(this.head, model.head.visible);
		case CHEST -> {
				setBoneVisible(this.body, model.body.visible);
				setBoneVisible(this.rightArm, model.rightArm.visible);
				setBoneVisible(this.leftArm, model.leftArm.visible);
			}
			case LEGS -> {
				setBoneVisible(this.body, model.body.visible);
				setBoneVisible(this.rightLeg, model.rightLeg.visible);
				setBoneVisible(this.leftLeg, model.leftLeg.visible);
			}
			case FEET -> {
				setBoneVisible(this.rightBoot, model.rightLeg.visible);
				setBoneVisible(this.leftBoot, model.leftLeg.visible);
			}
			default -> {}
		}
	}
	
//	@Override
//	public void applyBoneVisibilityByPart(EquipmentSlot currentSlot, ModelPart currentPart, HumanoidModel<?> model) {
//		setAllBonesVisible(true);
//
//		//currentPart.visible = true;
////		GeoBone bone = null;
////		
//////		if() {
//////			
//////		}
//////		
//////
//////		if (currentPart == model.hat || currentPart == model.head) {
////			bone = this.head;
////			bone.setHidden(false);
//////		}
//////		else if (currentPart == model.body) {
////			bone = this.body;
////			bone.setHidden(false);
//////			//bone = currentSlot == EquipmentSlot.CHEST ? this.leftBoot : this.leftLeg
//////		}
//////		else if (currentPart == model.leftArm) {
////			bone = this.leftArm;
////			bone.setHidden(false);
//////		}
//////		else if (currentPart == model.rightArm) {
////			bone = this.rightArm;
////			bone.setHidden(false);
//////		}
//////		else if (currentPart == model.leftLeg) {
////			//bone = currentSlot == EquipmentSlot.FEET ? this.leftBoot : this.leftLeg;
////			bone = this.leftLeg;
////			bone.setHidden(false);
//////		}
//////		else if (currentPart == model.rightLeg) {
////			//bone = currentSlot == EquipmentSlot.FEET ? this.rightBoot : this.rightLeg;
////			bone = this.rightLeg;
////			bone.setHidden(false);
//////		}
////
//////		if (bone != null)
//////			//this.setBoneVisible(bone, true);
//////			bone.setHidden(false);
//	}
	
	
}
