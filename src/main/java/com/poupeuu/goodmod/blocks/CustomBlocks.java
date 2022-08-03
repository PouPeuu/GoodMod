package com.poupeuu.goodmod.blocks;

import com.poupeuu.goodmod.GoodMod;
import com.poupeuu.goodmod.blocks.custom.GoodBlock;
import com.poupeuu.goodmod.items.CustomItems;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class CustomBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, GoodMod.MODID);
    
    //Blocks
    public static final RegistryObject<Block> GOOD_BLOCK = BLOCKS.register("good_block", () -> new GoodBlock(BlockBehaviour.Properties
    		.of(Material.AMETHYST)
    		.sound(SoundType.AMETHYST)
    		.friction(10f)
    		.requiresCorrectToolForDrops()
    		.strength(3.0f,2.0f)
    		));
    public static final RegistryObject<Block> BAD_ORE = BLOCKS.register("bad_ore", () -> new Block(BlockBehaviour.Properties
    		.of(Material.STONE)
    		.sound(SoundType.STONE)
    		.friction(2)
    		.requiresCorrectToolForDrops()
    		.strength(3.0f,2.0f)
    		));
    
    //BlockItems
    public static final RegistryObject<Item> GOOD_BLOCK_ITEM = CustomItems.ITEMS.register("good_block", () -> new BlockItem(GOOD_BLOCK.get(), new Item.Properties().tab(GoodMod.GOOD_TAB)));
    public static final RegistryObject<Item> BAD_ORE_ITEM = CustomItems.ITEMS.register("bad_ore", () -> new BlockItem(BAD_ORE.get(), new Item.Properties().tab(GoodMod.GOOD_TAB)));
}
