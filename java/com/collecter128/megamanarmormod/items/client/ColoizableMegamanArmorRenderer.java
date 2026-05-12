package com.collecter128.megamanarmormod.items.client;

import org.jetbrains.annotations.NotNull;
import org.joml.Matrix4f;

import com.collecter128.megamanarmormod.items.ColorizableMegamanArmorItem;
//import com.collecter128.megamanarmormod.items.MegamanArmorItem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.cache.object.BakedGeoModel;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.object.Color;
import software.bernie.geckolib.renderer.GeoArmorRenderer;
import software.bernie.geckolib.renderer.GeoRenderer;
import software.bernie.geckolib.renderer.DyeableGeoArmorRenderer;

public class ColoizableMegamanArmorRenderer extends DyeableGeoArmorRenderer<ColorizableMegamanArmorItem>  {
	public ColoizableMegamanArmorRenderer() {
        super(new ColorrizableMegamanArmorModel());
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

	@Override
	protected boolean isBoneDyeable(GeoBone bone) {
		return true;
	}

	@Override
	protected @NotNull Color getColorForBone(GeoBone bone) {
		if(bone.getName().equals("armorHead1")){
			CompoundTag compoundtag = currentStack.getTagElement("display");
			if(compoundtag != null && compoundtag.contains("mcolor1", 99)) {
				return new Color(compoundtag.getInt("mcolor1"));
			}
			else {
				return Color.WHITE;
			}
		}
//		if(bone.getName().equals("armorHead2")){
//			CompoundTag compoundtag = currentStack.getTagElement("display");
//			if(compoundtag != null && compoundtag.contains("mcolor2", 99)) {
//				return new Color(compoundtag.getInt("mcolor2"));
//			}
//			else
//				return Color.WHITE;
//		}
		
		return Color.WHITE;
	}
	
//	@Override
//	public RenderType getRenderType(T animatable, ResourceLocation texture, @org.jetbrains.annotations.Nullable MultiBufferSource bufferSource, float partialTick) {
//		return RenderType.armorCutoutNoCull(texture);
//		//return RenderType.translucent();
//	}
	
//Look at Rendertobuffer actuallyrender possibly for coloriztion?   GeoArmorRenderer
	
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
