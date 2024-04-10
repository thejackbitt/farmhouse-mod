package com.thejackbitt.farmhouse.blocks;

import com.thejackbitt.farmhouse.FarmhouseMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, FarmhouseMod.MOD_ID);
	
	public static final RegistryObject<Block> STOVEN = ModBlocks.BLOCKS.register(Stoven.ID, Stoven::build);

}
