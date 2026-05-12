package com.collecter128.megamanarmormod.worldgen;

import java.util.List;

import com.collecter128.megamanarmormod.MegamanArmorMod;
import com.collecter128.megamanarmormod.init.BlockInit;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.structure.templatesystem.RuleTest;
import net.minecraft.world.level.levelgen.structure.templatesystem.TagMatchTest;

public class ModConfiguredFeatures {
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_Ceratanium_ORE_KEY = registerKey("ceratanium_ore");
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_Mystery_Data_KEY = registerKey("mysterydata");
	public static final ResourceKey<ConfiguredFeature<?, ?>> OVERWORLD_Mystery_Wave_KEY = registerKey("mysterywave");
	
	public static void bootstrap(BootstapContext<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplaceable = new TagMatchTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplaceables = new TagMatchTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreConfiguration.TargetBlockState> overworldCerataniumOres = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.CerataniumOre.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, BlockInit.CerataniumOreDeepslate.get().defaultBlockState()));
        
        List<OreConfiguration.TargetBlockState> overworldMysteryDatas = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.MysteryDataBlue.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, BlockInit.MysteryDataPurple.get().defaultBlockState()));

        List<OreConfiguration.TargetBlockState> overworldMysteryWaves = List.of(OreConfiguration.target(stoneReplaceable,
                BlockInit.MysteryWaveBlue.get().defaultBlockState()),
                OreConfiguration.target(deepslateReplaceables, BlockInit.MysteryWavePurple.get().defaultBlockState()));
        
        register(context, OVERWORLD_Ceratanium_ORE_KEY, Feature.ORE, new OreConfiguration(overworldCerataniumOres, 7));
        register(context, OVERWORLD_Mystery_Data_KEY, Feature.ORE, new OreConfiguration(overworldMysteryDatas, 6));
        register(context, OVERWORLD_Mystery_Wave_KEY, Feature.ORE, new OreConfiguration(overworldMysteryWaves, 6));
        
    }
	
	public static ResourceKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, new ResourceLocation(MegamanArmorMod.MODID, name));
    }

    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstapContext<ConfiguredFeature<?, ?>> context,
                                                                                          ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }
	
}
