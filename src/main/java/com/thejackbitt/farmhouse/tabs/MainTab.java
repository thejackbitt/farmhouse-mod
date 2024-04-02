package com.thejackbitt.farmhouse.tabs;

import com.thejackbitt.farmhouse.tabs.ModTabs;
import com.thejackbitt.farmhouse.items.ModItems;
import com.thejackbitt.farmhouse.items.SteakPickaxe;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters;
import net.minecraft.world.item.CreativeModeTab.Output;
import net.minecraftforge.registries.RegistryObject;

public class MainTab {
    public static String ID = "farmhouse_tab";

    public static CreativeModeTab build() {
        return CreativeModeTab.builder()
            .icon(() -> ModItems.STEAK_PICKAXE.get().getDefaultInstance())
            .displayItems(MainTab::getItems)
            .build();
    }

    public static void getItems(ItemDisplayParameters parameters, Output output) {
        output.accept(ModItems.STEAK_PICKAXE.get());

        // add other items here
    }
}

