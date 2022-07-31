package com.poupeuu.goodmod.blocks.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class GoodBlock extends Block{

	public GoodBlock(Properties properties) {
		super(properties);
	}
	
	@Override
	public void stepOn(Level level, BlockPos blockPos, BlockState blockState, Entity entity) {
		if(entity instanceof LivingEntity livingEntity) {
			livingEntity.addEffect(new MobEffectInstance(MobEffects.CONFUSION,4*20,1));
		}
		
		
		super.stepOn(level,blockPos,blockState,entity);
	}
}
