package com.poupeuu.goodmod.tiers;

import java.util.function.Supplier;

import com.poupeuu.goodmod.items.CustomItems;

import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public enum ItemTiers implements Tier{
	
	//change values lol
	GOOD(3, 1000, 15f, 10f, 15, () -> {
		return Ingredient.of(CustomItems.GOOD_SHARD.get());
	});
	
	private final int level, uses, enchantment;
	private final float speed, damage;
	private final Supplier<Ingredient> repairMaterial;
	
	ItemTiers(int level, int uses, float speed, float damage, int enchantment, Supplier<Ingredient> repairMaterial) {
		this.level = level;
		this.uses = uses;
		this.enchantment = enchantment;
		this.speed = speed;
		this.damage = damage;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public int getUses() {
		return uses;
	}

	@Override
	public float getSpeed() {
		return speed;
	}

	@Override
	public float getAttackDamageBonus() {
		return damage;
	}

	@Override
	public int getLevel() {
		return level;
	}

	@Override
	public int getEnchantmentValue() {
		return enchantment;
	}

	@Override
	public Ingredient getRepairIngredient() {
		return repairMaterial.get();
	}
	
}
