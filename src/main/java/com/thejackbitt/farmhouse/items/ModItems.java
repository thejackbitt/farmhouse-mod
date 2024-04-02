package com.thejackbitt.farmhouse.items;

import com.thejackbitt.farmhouse.FarmhouseMod;

import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FarmhouseMod.MOD_ID);

    public static final RegistryObject<Item> STEAK_PICKAXE =
        ModItems.ITEMS.register(SteakPickaxe.ID, SteakPickaxe::build);
}

