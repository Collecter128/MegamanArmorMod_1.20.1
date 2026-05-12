package com.collecter128.megamanarmormod.init;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.blocks.*;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MegamanArmorMod.MODID); 
	
	public static final RegistryObject<Block> CerataniumOre = BLOCKS.register("ceratanium_ore",
			() -> new Block(Block.Properties.of()
					.strength(2.0F, 3.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_LIGHT_BLUE)
					.sound(SoundType.METAL)) 
			);
	
	public static final RegistryObject<Block> CerataniumOreDeepslate = BLOCKS.register("ceratanium_oredeepslate",
			() -> new Block(Block.Properties.of()
					.strength(2.0F, 3.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_LIGHT_BLUE)
					.sound(SoundType.METAL)) 
			);
	
	public static final RegistryObject<Block> CerataniumRawBlock = BLOCKS.register("ceratanium_raw_block",
			() -> new Block(Block.Properties.of()
					.strength(2.0F, 3.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_LIGHT_BLUE)
					.sound(SoundType.METAL)) 
			);
	
	public static final RegistryObject<Block> CerataniumBlock = BLOCKS.register("ceratanium_block",
			() -> new Block(Block.Properties.of()
					.strength(2.0F, 3.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_LIGHT_BLUE)
					.sound(SoundType.METAL)) 
			);
	
	public static final RegistryObject<Block> TitaniumXBlock = BLOCKS.register("titaniumx_block",
			() -> new Block(Block.Properties.of()
					.strength(2.0F, 3.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_BLUE)
					.sound(SoundType.METAL)) 
			);
	
	public static final RegistryObject<Block> MysteryDataBlue = BLOCKS.register("mysterydatablue",
			() -> new BlockMysteryDataBlue(Block.Properties.of()
					.strength(1.0F, 2.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_LIGHT_BLUE)
					.sound(SoundType.GLASS)
					.noOcclusion()
					//.isViewBlocking(Blocks::never)
					.isViewBlocking(BlockInit::never)
					) 
			);
	public static final RegistryObject<Block> MysteryDataBlueCompressed = BLOCKS.register("mysterydatablue_compressed",
			() -> new Block(Block.Properties.of()
					.strength(1.0F, 3.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_LIGHT_BLUE)
					.sound(SoundType.GLASS)) 
			);
	
	public static final RegistryObject<Block> MysteryDataPurple = BLOCKS.register("mysterydatapurple",
			() -> new BlockMysteryDataPurple(Block.Properties.of()
					.strength(1.0F, 2.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_PURPLE)
					.sound(SoundType.GLASS)
					.noOcclusion()
					//.isViewBlocking(Blocks::never)
					.isViewBlocking(BlockInit::never)
					) 
			);
	public static final RegistryObject<Block> MysteryDataPurpleCompressed = BLOCKS.register("mysterydatapurple_compressed",
			() -> new Block(Block.Properties.of()
					.strength(1.0F, 3.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_PURPLE)
					.sound(SoundType.GLASS)) 
			);
	
	public static final RegistryObject<Block> MysteryWaveBlue = BLOCKS.register("mysterywaveblue",
			() -> new BlockMysteryWaveBlue(Block.Properties.of()
					.strength(1.0F, 2.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_LIGHT_BLUE)
					.sound(SoundType.GLASS)
					.noOcclusion()
					//.isViewBlocking(Blocks::never)
					.isViewBlocking(BlockInit::never)
					) 
			);
	public static final RegistryObject<Block> MysteryWaveBlueCompressed = BLOCKS.register("mysterywaveblue_compressed",
			() -> new Block(Block.Properties.of()
					.strength(1.0F, 3.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_LIGHT_BLUE)
					.sound(SoundType.GLASS)) 
			);
	
	public static final RegistryObject<Block> MysteryWavePurple = BLOCKS.register("mysterywavepurple",
			() -> new BlockMysteryWaveBlue(Block.Properties.of()
					.strength(1.0F, 2.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_PURPLE)
					.sound(SoundType.GLASS)
					.noOcclusion()
					//.isViewBlocking(Blocks::never)
					.isViewBlocking(BlockInit::never)
					) 
			);
	public static final RegistryObject<Block> MysteryWavePurpleCompressed = BLOCKS.register("mysterywavepurple_compressed",
			() -> new Block(Block.Properties.of()
					.strength(1.0F, 3.0F)//.explosionResistance(0)
					.mapColor(MapColor.COLOR_PURPLE)
					.sound(SoundType.GLASS)) 
			);
	
	private static boolean never(BlockState p_50806_, BlockGetter p_50807_, BlockPos p_50808_) {
	      return false;
	   }
}
