package com.collecter128.megamanarmormod.init;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.items.*;

import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MegamanArmorMod.MODID); 
	
	public static final RegistryObject<Item> TestColorItem = ITEMS.register("test_color_item",
			() -> new ArmorColorizerItem(new Item.Properties(), 50, 400));
	
	public static final RegistryObject<Item> MegaMiniForge = ITEMS.register("mega_mini_forge",
			() -> new Item(new Item.Properties()
					));
	public static final RegistryObject<Item> MegaMiniForgePowered = ITEMS.register("mega_mini_forge_powered",
			() -> new Item(new Item.Properties()
					.craftRemainder(MegaMiniForge.get())
					));
	
	public static final RegistryObject<Item> CerataniumRaw = ITEMS.register("ceratanium_raw",
			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<Item> CerataniumIngot = ITEMS.register("ceratanium_ingot",
			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<Item> TitaniumXIngot = ITEMS.register("titaniumx_ingot",
			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<Item> MysteryDataFragmentBlue = ITEMS.register("mysterydatafragmentblue",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> MysteryDataPartBlue = ITEMS.register("mysterydatapartblue",
			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<Item> MysteryDataFragmentPurple = ITEMS.register("mysterydatafragmentpurple",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> MysteryDataPartPurple = ITEMS.register("mysterydatapartpurple",
			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<Item> DataBuster = ITEMS.register("data_buster",
			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<Item> MysteryWaveFragmentBlue = ITEMS.register("mysterywavefragmentblue",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> MysteryWavePartBlue = ITEMS.register("mysterywavepartblue",
			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<Item> MysteryWaveFragmentPurple = ITEMS.register("mysterywavefragmentpurple",
			() -> new Item(new Item.Properties()));
	public static final RegistryObject<Item> MysteryWavePartPurple = ITEMS.register("mysterywavepartpurple",
			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<Item> WaveAM = ITEMS.register("wave_am",
			() -> new Item(new Item.Properties()));
	
	public static final RegistryObject<BlockItem> CerataniumOre_Item = ITEMS.register("ceratanium_ore_item",
			() -> new BlockItem(BlockInit.CerataniumOre.get(), new Item.Properties()
			));
	public static final RegistryObject<BlockItem> CerataniumOreDeepslate_Item = ITEMS.register("ceratanium_oredeepslate_item",
			() -> new BlockItem(BlockInit.CerataniumOreDeepslate.get(), new Item.Properties()
			));
	public static final RegistryObject<BlockItem> CerataniumRawBlock_Item = ITEMS.register("ceratanium_raw_block_item",
			() -> new BlockItem(BlockInit.CerataniumRawBlock.get(), new Item.Properties()
			));
	public static final RegistryObject<BlockItem> CerataniumBlock_Item = ITEMS.register("ceratanium_block_item",
			() -> new BlockItem(BlockInit.CerataniumBlock.get(), new Item.Properties()
			));
	
	public static final RegistryObject<BlockItem> TitaniumXBlock_Item = ITEMS.register("titaniumx_block_item",
			() -> new BlockItem(BlockInit.TitaniumXBlock.get(), new Item.Properties()
			));
	
	public static final RegistryObject<BlockItem> MysteryDataBlue_Item = ITEMS.register("mysterydatablue_item",
			() -> new BlockItem(BlockInit.MysteryDataBlue.get(), new Item.Properties()
			));
	public static final RegistryObject<BlockItem> MysteryDataBlueCompressed_Item = ITEMS.register("mysterydatablue_compressed_item",
			() -> new BlockItem(BlockInit.MysteryDataBlueCompressed.get(), new Item.Properties()
			));
	public static final RegistryObject<BlockItem> MysteryDataPurple_Item = ITEMS.register("mysterydatapurple_item",
			() -> new BlockItem(BlockInit.MysteryDataPurple.get(), new Item.Properties()
			));
	public static final RegistryObject<BlockItem> MysteryDataPurpleCompressed_Item = ITEMS.register("mysterydatapurple_compressed_item",
			() -> new BlockItem(BlockInit.MysteryDataPurpleCompressed.get(), new Item.Properties()
			));
	
	public static final RegistryObject<BlockItem> MysteryWaveBlue_Item = ITEMS.register("mysterywaveblue_item",
			() -> new BlockItem(BlockInit.MysteryWaveBlue.get(), new Item.Properties()
			));
	public static final RegistryObject<BlockItem> MysteryWaveBlueCompressed_Item = ITEMS.register("mysterywaveblue_compressed_item",
			() -> new BlockItem(BlockInit.MysteryWaveBlueCompressed.get(), new Item.Properties()
			));
	public static final RegistryObject<BlockItem> MysteryWavePurple_Item = ITEMS.register("mysterywavepurple_item",
			() -> new BlockItem(BlockInit.MysteryWavePurple.get(), new Item.Properties()
			));
	public static final RegistryObject<BlockItem> MysteryWavePurpleCompressed_Item = ITEMS.register("mysterywavepurple_compressed_item",
			() -> new BlockItem(BlockInit.MysteryWavePurpleCompressed.get(), new Item.Properties()
			));
	
	public static final RegistryObject<Item> MegamanArmorHelmet = ITEMS.register("megamanarmor_helmet",
			() -> new MegamanArmorItem(ModArmorMaterials.BasicMegaman, ArmorItem.Type.HELMET, new Item.Properties(),
					"megaman_helmet",
					"megaman_armor",
					"megaman_helmet"
					));
	public static final RegistryObject<Item> MegamanArmorChestplate = ITEMS.register("megamanarmor_chestplate",
			() -> new MegamanArmorItem(ModArmorMaterials.BasicMegaman, ArmorItem.Type.CHESTPLATE, new Item.Properties(),
					"megaman_chestplate",
					"megaman_armor",
					"megaman_chestplate"
					));
	public static final RegistryObject<Item> MegamanArmorLegs = ITEMS.register("megamanarmor_legs",
			() -> new MegamanArmorItem(ModArmorMaterials.BasicMegaman, ArmorItem.Type.LEGGINGS, new Item.Properties(),
					"megaman_legs",
					"megaman_armor",
					"megaman_legs"
					));
	public static final RegistryObject<Item> MegamanArmorBoots = ITEMS.register("megamanarmor_boots",
			() -> new MegamanArmorItem(ModArmorMaterials.BasicMegaman, ArmorItem.Type.BOOTS, new Item.Properties(),
					"megaman_boots",
					"megaman_armor",
					"megaman_boots"
					));
	
	public static final RegistryObject<Item> MettaurHelmet = ITEMS.register("mettaur_helmet",
			() -> new ColorizableMegamanArmorItem(ModArmorMaterials.BasicMegaman, ArmorItem.Type.HELMET, new Item.Properties(),
					"mettaurhelmet_armor",
					"mettaurhelmet",
					"mettaurhelmet_armor",
					16770079, //Main Color
					246822 //Secondary Color
					));
	
	public static final RegistryObject<Item> MegamanXHelmet = ITEMS.register("megamanx_helmet",
			() -> new MegamanArmorItem(ModArmorMaterials.TitaniumXMegaman, ArmorItem.Type.HELMET, new Item.Properties(),
					"megamanx_helmet",
					"megamanx_armor",
					"megamanx_helmet"
					));
	public static final RegistryObject<Item> MegamanXChestplate = ITEMS.register("megamanx_chestplate",
			() -> new MegamanArmorItem(ModArmorMaterials.TitaniumXMegaman, ArmorItem.Type.CHESTPLATE, new Item.Properties(),
					"megamanx_chestplate",
					"megamanx_armor",
					"megamanx_chestplate"
					));
	public static final RegistryObject<Item> MegamanXLegs = ITEMS.register("megamanx_legs",
			() -> new MegamanArmorItem(ModArmorMaterials.TitaniumXMegaman, ArmorItem.Type.LEGGINGS, new Item.Properties(),
					"megamanx_legs",
					"megamanx_armor",
					"megamanx_legs"
					));
	public static final RegistryObject<Item> MegamanXBoots = ITEMS.register("megamanx_boots",
			() -> new MegamanArmorItem(ModArmorMaterials.TitaniumXMegaman, ArmorItem.Type.BOOTS, new Item.Properties(),
					"megamanx_boots",
					"megamanx_armor",
					"megamanx_boots"
					));
	
	public static final RegistryObject<Item> MegamanExeHelmet = ITEMS.register("megamanexe_helmet",
			() -> new MegamanArmorItem(ModArmorMaterials.DataBusterArmor, ArmorItem.Type.HELMET, new Item.Properties(),
					"megamanexe_helmet",
					"megamanexe_armor",
					"megamanexe_helmet"
					));
	public static final RegistryObject<Item> MegamanExeChestplate = ITEMS.register("megamanexe_chestplate",
			() -> new MegamanArmorItem(ModArmorMaterials.DataBusterArmor, ArmorItem.Type.CHESTPLATE, new Item.Properties(),
					"megamanexe_chestplate",
					"megamanexe_armor",
					"megamanexe_chestplate"
					));
	public static final RegistryObject<Item> MegamanExeLegs = ITEMS.register("megamanexe_legs",
			() -> new MegamanArmorItem(ModArmorMaterials.DataBusterArmor, ArmorItem.Type.LEGGINGS, new Item.Properties(),
					"megamanexe_legs",
					"megamanexe_armor",
					"megamanexe_legs"
					));
	public static final RegistryObject<Item> MegamanExeBoots = ITEMS.register("megamanexe_boots",
			() -> new MegamanArmorItem(ModArmorMaterials.DataBusterArmor, ArmorItem.Type.BOOTS, new Item.Properties(),
					"megamanexe_boots",
					"megamanexe_armor",
					"megamanexe_boots"
					));
	
	public static final RegistryObject<Item> MegamanStarforceHelmet = ITEMS.register("megamanstarforce_helmet",
			() -> new MegamanArmorItem(ModArmorMaterials.WaveAMArmor, ArmorItem.Type.HELMET, new Item.Properties(),
					"megamanstarforce_helmet",
					"megamanstarforce_armor",
					"megamanstarforce_helmet"
					));
	public static final RegistryObject<Item> MegamanStarforceChestplate = ITEMS.register("megamanstarforce_chestplate",
			() -> new MegamanArmorItem(ModArmorMaterials.WaveAMArmor, ArmorItem.Type.CHESTPLATE, new Item.Properties(),
					"megamanstarforce_chestplate",
					"megamanstarforce_armor",
					"megamanstarforce_chestplate"
					));
	public static final RegistryObject<Item> MegamanStarforceLegs = ITEMS.register("megamanstarforce_legs",
			() -> new MegamanArmorItem(ModArmorMaterials.WaveAMArmor, ArmorItem.Type.LEGGINGS, new Item.Properties(),
					"megamanstarforce_legs",
					"megamanstarforce_armor",
					"megamanstarforce_legs"
					));
	public static final RegistryObject<Item> MegamanStarforceBoots = ITEMS.register("megamanstarforce_boots",
			() -> new MegamanArmorItem(ModArmorMaterials.WaveAMArmor, ArmorItem.Type.BOOTS, new Item.Properties(),
					"megamanstarforce_boots",
					"megamanstarforce_armor",
					"megamanstarforce_boots"
					));
}
