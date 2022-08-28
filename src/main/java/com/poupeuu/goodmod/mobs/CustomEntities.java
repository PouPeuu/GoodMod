package com.poupeuu.goodmod.mobs;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import com.poupeuu.goodmod.GoodMod;
import com.poupeuu.goodmod.mobs.custom.pig2;

import net.minecraft.client.Minecraft;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.animal.Animal;
public class CustomEntities {

	public static final DeferredRegister<EntityType<?>> ENTITIES = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, GoodMod.MODID);
	public static final RegistryObject<EntityType<pig2>> Pig2 = ENTITIES.register("pig2", ()-> EntityType.Builder.of(pig2::new, MobCategory.CREATURE).build(new ResourceLocation("pig2").toString()));
}
