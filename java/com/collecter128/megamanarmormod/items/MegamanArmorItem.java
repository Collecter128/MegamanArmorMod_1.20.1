package com.collecter128.megamanarmormod.items;

import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.extensions.common.IClientItemExtensions;

import java.util.function.Consumer;

import org.jetbrains.annotations.NotNull;

import com.collecter128.megamanarmormod.items.client.MegamanArmorRenderer;

import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class MegamanArmorItem extends ArmorItem implements GeoItem{
	Type MArrmorType;
	public String GeoModelString;
	public String TextureModelString;
	public String AnimationModelString;
	
	private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
	
	public MegamanArmorItem(ArmorMaterial material, Type type, Properties properties, 
			String GeoModelString, String TextureModelString, String AnimationModelString) {
		super(material, type, properties);
		MArrmorType = type;
		this.GeoModelString = GeoModelString;
		this.TextureModelString = TextureModelString;
		this.AnimationModelString = AnimationModelString;
	}
	
	@Override
    public void initializeClient(Consumer<IClientItemExtensions> consumer) {
        consumer.accept(new IClientItemExtensions() {
            private MegamanArmorRenderer renderer;

            @Override
            public @NotNull HumanoidModel<?> getHumanoidArmorModel(LivingEntity livingEntity, ItemStack itemStack,
                                                                   EquipmentSlot equipmentSlot, HumanoidModel<?> original) {
            	
            	if (this.renderer == null)
                    this.renderer = new MegamanArmorRenderer();
                	
            	//this.renderer.getRenderColor(null, MAX_BAR_WIDTH, EAT_DURATION);
            	
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
	
//	public int getColor(int layer) {
//	      return p_43212_ == 0 ? this.backgroundColor : this.highlightColor;
//	   }

}
