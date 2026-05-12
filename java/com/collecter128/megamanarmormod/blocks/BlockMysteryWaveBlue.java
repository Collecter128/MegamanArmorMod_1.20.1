package com.collecter128.megamanarmormod.blocks;

import java.util.Random;

import javax.annotation.Nullable;

import com.collecter128.megamanarmormod.init.ItemInit;

import net.minecraft.world.level.block.HalfTransparentBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;

public class BlockMysteryWaveBlue extends HalfTransparentBlock{
	
	
	   public BlockMysteryWaveBlue(BlockBehaviour.Properties properties) {
		super(properties);
	   }

	/**
	    * Called before the Block is set to air in the world. Called regardless of if the player's tool can actually collect
	    * this block
	    */
	   public void playerWillDestroy(Level worldIn, BlockPos pos, BlockState p_49610_, Player player) {
	   //public void onRemove(World worldIn, BlockPos pos, BlockState state, PlayerEntity player) {
	      if (!worldIn.isClientSide) {
	    	 ItemStack itemstackIn = new ItemStack(ItemInit.WaveAM.get());
	    	 Random random = new Random();
	    	 int RandomInt = random.nextInt(1);
	    	 
	    	
	    	 RandomInt = random.nextInt(1);
	    	 switch(RandomInt) {
	    		 case 0: 
	    		 	itemstackIn = new ItemStack(ItemInit.WaveAM.get());
	    		 	break;
//	    	 		case 1: 
//	    	 			itemstackIn = new ItemStack(Items.BROWN_MUSHROOM);
//	    	 			break;
//	    	 		case 2: 
//	    	 			itemstackIn = new ItemStack(Items.RED_MUSHROOM);
//	    	 			break;
	    	 	
	    	 		
	    		 default:
	    		 	itemstackIn = new ItemStack(ItemInit.WaveAM.get());
	    	 }
	    	 
	    	  
	    	 worldIn.playSound((Player)null, pos, net.minecraft.sounds.SoundEvents.FIREWORK_ROCKET_LAUNCH, SoundSource.BLOCKS, 1.0F, 0.8F + worldIn.random.nextFloat() * 0.4F);
	    	 popResource(worldIn, pos, itemstackIn);
	    	 //player.inventory.addItemStackToInventory(itemstackIn);
	      }

	   }

}
