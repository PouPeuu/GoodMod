package com.poupeuu.goodmod.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class Purifier extends Block {

	public Purifier(Properties properties) {
		super(properties);
	}
	
	private static final VoxelShape SHAPE = Block.box(0, 0, 0, 16, 10, 16);
	
	@Override
	public VoxelShape getShape(BlockState blockstate, BlockGetter blockGetter, BlockPos blockPos, CollisionContext collContext) {
		return SHAPE;
		
	}
	
}
