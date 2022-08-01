package com.poupeuu.goodmod.tiers;

import java.util.function.Supplier;

import com.poupeuu.goodmod.items.CustomItems;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

public enum ModArmorMaterials implements ArmorMaterial{
	GOOD(3,new int[]{13,15,16,11},15,10f,10f,"goodmod:good", () -> {return SoundEvents.ARMOR_EQUIP_DIAMOND;},() -> {return Ingredient.of(CustomItems.GOOD_SHARD.get());});
	
	private final int[] durabilityPerSlot = new int[] { 13, 15, 16, 11 };
	private final int durability;
	private final int[] defensePerSlot;
	private final int enchantment;
	private final float toughness, knockbackResistance;
	private final String name;
	private final Supplier<SoundEvent> equipSound;
	private final Supplier<Ingredient> repairMaterial;
	
	ModArmorMaterials(int durability, int[] defensePerSlot, int enchantment, float toughness, float knockbackResistance, String name, Supplier<SoundEvent> equipSound, Supplier<Ingredient> repairMaterial){
		this.durability = durability;
		this.defensePerSlot = defensePerSlot;
		this.enchantment = enchantment;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
		this.name = name;
		this.equipSound = equipSound;
		this.repairMaterial = repairMaterial;
	}
	
	@Override
	public int getDurabilityForSlot(EquipmentSlot slot) {
		return durabilityPerSlot[slot.getIndex()] * durability;
	}

	@Override
	public int getDefenseForSlot(EquipmentSlot slot) {
		return defensePerSlot[slot.getIndex()];
	}

	@Override
	public int getEnchantmentValue() {
		// TODO Auto-generated method stub
		return enchantment;
	}

	@Override
	public SoundEvent getEquipSound() {
		// TODO Auto-generated method stub
		return equipSound.get();
	}

	@Override
	public Ingredient getRepairIngredient() {
		// TODO Auto-generated method stub
		return repairMaterial.get();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public float getToughness() {
		// TODO Auto-generated method stub
		return toughness;
	}

	@Override
	public float getKnockbackResistance() {
		// TODO Auto-generated method stub
		return knockbackResistance;
	}

}
