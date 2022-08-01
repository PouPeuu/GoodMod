package com.poupeuu.goodmod.items;

import com.poupeuu.goodmod.GoodMod;
import com.poupeuu.goodmod.tiers.ItemTiers;

import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ShovelItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CustomItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GoodMod.MODID);
    
    public static final RegistryObject<Item> GOOD_SHARD = ITEMS.register("good_shard", () -> new Item(new Item.Properties().tab(GoodMod.GOOD_TAB).stacksTo(16)));
    
    public static final RegistryObject<Item> GOOD_SWORD = ITEMS.register("good_sword", () -> new SwordItem(ItemTiers.GOOD, 5, -3.0f, new Item.Properties().tab(GoodMod.GOOD_TAB)));
    public static final RegistryObject<Item> GOOD_PICKAXE = ITEMS.register("good_pickaxe", () -> new PickaxeItem(ItemTiers.GOOD, 5, -2.0f, new Item.Properties().tab(GoodMod.GOOD_TAB)));
    public static final RegistryObject<Item> GOOD_AXE = ITEMS.register("good_axe", () -> new AxeItem(ItemTiers.GOOD, 5, -2.0f, new Item.Properties().tab(GoodMod.GOOD_TAB)));
    public static final RegistryObject<Item> GOOD_SHOVEL = ITEMS.register("good_shovel", () -> new ShovelItem(ItemTiers.GOOD, 5, -2.0f, new Item.Properties().tab(GoodMod.GOOD_TAB)));
    public static final RegistryObject<Item> GOOD_HOE = ITEMS.register("good_hoe", () -> new HoeItem(ItemTiers.GOOD, 5, -2.0f, new Item.Properties().tab(GoodMod.GOOD_TAB)));
    
    
}
