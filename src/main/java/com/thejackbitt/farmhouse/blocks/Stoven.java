package com.thejackbitt.farmhouse.blocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FurnaceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class Stoven {
    public static final String ID = "stoven";

    public static final Block build() {
        return new FurnaceBlock(Properties.of());
    }
}
