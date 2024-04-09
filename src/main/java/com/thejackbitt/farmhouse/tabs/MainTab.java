package com.thejackbitt.farmhouse.tabs;

import com.thejackbitt.farmhouse.items.ModItems;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTab.ItemDisplayParameters;
import net.minecraft.world.item.CreativeModeTab.Output;

public class MainTab {
    public static final String ID = "main_tab";

    public static final CreativeModeTab build() {
        return CreativeModeTab.builder()
            .icon(() -> ModItems.STEAK_PICKAXE.get().getDefaultInstance())
            .title(Component.translatable(String.format("creativetab.%s", MainTab.ID)))
            .displayItems(MainTab::getItems)
            .build();
    }

    public static final void getItems(ItemDisplayParameters parameters, Output output) {
        output.accept(ModItems.STEAK_PICKAXE.get());

        // add other items here
    }
}

