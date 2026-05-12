package com.collecter128.megamanarmormod.items;

import java.util.function.Supplier;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.init.ItemInit;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorItem.Type;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterials implements ArmorMaterial{
	BasicMegaman("basic_megaman", 15, new int[]{ 1, 3, 2, 1 }, 15,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.CerataniumIngot.get())),
	TitaniumXMegaman("titaniumx_megaman", 15, new int[]{ 1, 3, 2, 1 }, 15,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.TitaniumXIngot.get())),
	DataBusterArmor("databuster_armor", 15, new int[]{ 1, 3, 2, 1 }, 15,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.DataBuster.get())),
	WaveAMArmor("waveam_armor", 15, new int[]{ 1, 3, 2, 1 }, 15,
            SoundEvents.ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> Ingredient.of(ItemInit.WaveAM.get()));

	private final String name;
    private final int durabilityMultiplier;
    private final int[] protectionAmounts;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Supplier<Ingredient> repairIngredient;

    private static final int[] BASE_DURABILITY = { 11, 16, 16, 13 };

    ModArmorMaterials(String name, int durabilityMultiplier, int[] protectionAmounts, int enchantmentValue, SoundEvent equipSound,
                      float toughness, float knockbackResistance, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredient = repairIngredient;
    }
	
    @Override
    public int getDurabilityForType(ArmorItem.Type pType) {
        return BASE_DURABILITY[pType.ordinal()] * this.durabilityMultiplier;
    }

    @Override
    public int getDefenseForType(ArmorItem.Type pType) {
        return this.protectionAmounts[pType.ordinal()];
    }

    @Override
    public int getEnchantmentValue() {
        return enchantmentValue;
    }

    @Override
    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @Override
    public String getName() {
        return MegamanArmorMod.MODID + ":" + this.name;
    }

    @Override
    public float getToughness() {
        return this.toughness;
    }

    @Override
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

}
