package com.collecter128.megamanarmormod.items;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.Optional;
import java.util.function.Consumer;

import org.jetbrains.annotations.NotNull;

import com.collecter128.megamanarmormod.items.client.ColoizableMegamanArmorRenderer;

//import com.collecter128.megamanarmormod.items.client.MegamanArmorRenderer;

import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class ColorizableMegamanArmorItem extends ArmorItem implements GeoItem{
	Type MArrmorType;
	public String GeoModelString;
	public String TextureModelString;
	public String AnimationModelString;
	public int DefaultMainColor;
	public int DefaultSecondaryColor;
	
	private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
	
	public ColorizableMegamanArmorItem(ArmorMaterial material, Type type, Properties properties, 
			String GeoModelString, String TextureModelString, String AnimationModelString,
			int DefaultMainColor, int DefaultSecondaryColor) {
		super(material, type, properties);
		MArrmorType = type;
		this.GeoModelString = GeoModelString;
		this.TextureModelString = TextureModelString;
		this.AnimationModelString = AnimationModelString;
		this.DefaultMainColor = DefaultMainColor;
		this.DefaultSecondaryColor = DefaultSecondaryColor;
	}
	
	@Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private ColoizableMegamanArmorRenderer renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                                                                   EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
            	
            	if (this.renderer == null)
                    this.renderer = new ColoizableMegamanArmorRenderer();
            	
                this.renderer.prepForRender(livingEntity, itemStack, equipmentSlot, original);
                //this.renderer.setAllVisible(true);
                //this.renderer.applyBoneVisibilityByPart(equipmentSlot, null, original);
                return this.renderer;
            }
        });
    }
	
	private PlayState predicate(AnimationState animationState) {
        animationState.getController().setAnimation(RawAnimation.begin().then("idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

	@Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController(this, "controller", 0, this::predicate));
    }

	@Override
	public AnimatableInstanceCache getAnimatableInstanceCache() {
		return cache;
	}
	
	@Override
	public void inventoryTick(ItemStack p_40720_, Level p_40721_, Entity p_40722_, int p_40723_, boolean p_40724_) {

	            CompoundTag compoundtag = p_40720_.getOrCreateTag();
	            if (compoundtag.contains("mcolor1")) {
	               return;
	            }
	            else
	            	p_40720_.getOrCreateTagElement("display").putInt("mcolor1", DefaultMainColor);
	            
	            if (compoundtag.contains("mcolor2")) {
		           return;
		        }
		        else
		            p_40720_.getOrCreateTagElement("display").putInt("mcolor2", DefaultSecondaryColor);

	   }
	
//	public int getColor(int layer) {
//	      return p_43212_ == 0 ? this.backgroundColor : this.highlightColor;
//	   }

}
