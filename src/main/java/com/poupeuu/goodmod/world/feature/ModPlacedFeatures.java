package com.poupeuu.goodmod.world.feature;

import java.util.List;

import com.poupeuu.goodmod.GoodMod;

import net.minecraft.core.Registry;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.heightproviders.HeightProvider;
import net.minecraft.world.level.levelgen.placement.BiomeFilter;
import net.minecraft.world.level.levelgen.placement.CountPlacement;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.minecraft.world.level.levelgen.placement.PlacementModifier;
import net.minecraft.world.level.levelgen.placement.RarityFilter;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModPlacedFeatures {
	public static final DeferredRegister<PlacedFeature> PLACED_FEATURE = DeferredRegister.create(Registry.PLACED_FEATURE_REGISTRY, GoodMod.MODID);
	public static final RegistryObject<PlacedFeature> BAD_ORE_PLACED = PLACED_FEATURE.register("bad_ore_placed", () -> new PlacedFeature(ModConfigFeatures.BAD_ORE.getHolder().get(),
			commonOrePlacement(7, HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(-50)))));
	
	private static List<PlacementModifier> orePlacement(PlacementModifier p_195347_, PlacementModifier p_195348_) {
		return List.of(p_195347_, InSquarePlacement.spread(), p_195348_, BiomeFilter.biome());
	}

	private static List<PlacementModifier> commonOrePlacement(int p_195344_, PlacementModifier p_195345_) {
		return orePlacement(CountPlacement.of(p_195344_), p_195345_);
	}

	private static List<PlacementModifier> rareOrePlacement(int p_195350_, PlacementModifier p_195351_) {
		return orePlacement(RarityFilter.onAverageOnceEvery(p_195350_), p_195351_);
	}
}
