package com.LJJStudios.cabinetproject.Item.foods.drinks.alcohol;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ChineseLiquor extends Item {
    private static final Food food = (new Food.Builder())
            .nutrition(2)
            .effect(() -> new EffectInstance(Effects.CONFUSION,5 * 20,1),1)
            .alwaysEat()
            .build();
    public ChineseLiquor(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
