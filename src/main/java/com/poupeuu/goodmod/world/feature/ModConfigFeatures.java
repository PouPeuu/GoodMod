package com.poupeuu.goodmod.world.feature;

import java.util.List;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.poupeuu.goodmod.GoodMod;
import com.poupeuu.goodmod.blocks.CustomBlocks;

import net.minecraft.core.Registry;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModConfigFeatures {
	public static final DeferredRegister<ConfiguredFeature<?, ?>> CONFIGURED_FEATURES = DeferredRegister.create(Registry.CONFIGURED_FEATURE_REGISTRY, GoodMod.MODID);
	
	public static final Supplier<List<OreConfiguration.TargetBlockState>> OVERWORLD_BAD_ORE = Suppliers.memoize(() -> List.of(
			OreConfiguration.target(OreFeatures.STONE_ORE_REPLACEABLES, CustomBlocks.BAD_ORE.get().defaultBlockState()),
			OreConfiguration.target(OreFeatures.DEEPSLATE_ORE_REPLACEABLES, CustomBlocks.BAD_ORE.get().defaultBlockState())));
	
	public static final RegistryObject<ConfiguredFeature<?, ?>> BAD_ORE = CONFIGURED_FEATURES.register("bad_ore", () -> new ConfiguredFeature<>(
			Feature.ORE, new OreConfiguration(OVERWORLD_BAD_ORE.get(), 2)));
}
