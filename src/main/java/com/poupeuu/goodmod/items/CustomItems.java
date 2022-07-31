package com.poupeuu.goodmod.items;

import com.poupeuu.goodmod.GoodMod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CustomItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, GoodMod.MODID);
    
    public static final RegistryObject<Item> GOOD_SHARD = ITEMS.register("good_shard", () -> new Item(new Item.Properties()
    		.tab(GoodMod.GOOD_TAB)
    		.stacksTo(16)
    		));
    
}
