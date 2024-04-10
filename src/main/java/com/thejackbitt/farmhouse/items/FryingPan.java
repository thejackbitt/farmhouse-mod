package com.thejackbitt.farmhouse.items;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Item.Properties;

public class FryingPan {
    public static final String ID = "frying_pan";

    public static final Item build() {
        return new PickaxeItem(
            new FryingPanTier(),
            0,
            0f, // attack speed
            new Properties()
                .stacksTo(1)
                .durability(100)
        );
    }

    public static class FryingPanTier implements Tier {

		@Override
		public int getUses() {
            return 0;
		}

		@Override
		public float getSpeed() {
            return 0f;
		}

		@Override
		public float getAttackDamageBonus() {
            return 0f;
		}

		@Override
		public int getLevel() {
            return 0;
		}

		@Override
		public int getEnchantmentValue() {
            return 0;
		}

		@Override
		public Ingredient getRepairIngredient() {
            return Ingredient.EMPTY;
		}
    }
}

