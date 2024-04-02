package com.thejackbitt.farmhouse.items;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item.Properties;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;

public class SteakPickaxe {
    public static final String ID = "steak_pickaxe";

    public static final PickaxeItem build() {
        return new PickaxeItem(
            new SteakPickaxe.ItemTier(),
            0,
            0f,
            SteakPickaxe.getProperties()
        );
    }

    public static final Properties getProperties() {
        return new Properties().food(
            new FoodProperties.Builder()
                .nutrition(8)
                .saturationMod(2f)
                .build()
        );
    }

    public static class ItemTier implements Tier {

        @Override
        public int getUses() {
            return 4;
        }

        @Override
        public float getSpeed() {
            return 0.1f;
        }

        @Override
        public float getAttackDamageBonus() {
            return -0.9f;
        }

        @Override
        public int getLevel() {
            return 1;
        }

        @Override
        public int getEnchantmentValue() {
            return 10;
        }

        @Override
        public Ingredient getRepairIngredient() {
            return Ingredient.EMPTY; // TODO(Davey-M): should be steak
        }
    }
}

