package com.thejackbitt.farmhouse;

import com.thejackbitt.farmhouse.blocks.ModBlocks;
import com.thejackbitt.farmhouse.items.ModItems;
import com.thejackbitt.farmhouse.tabs.ModTabs;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(FarmhouseMod.MOD_ID)
public class FarmhouseMod {
    public static final String MOD_ID = "farmhouse";

    public FarmhouseMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.ITEMS.register(modEventBus);
        // ModBlocks.BLOCKS.register(modEventBus);

        ModTabs.CREATIVE_MODE_TABS.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
