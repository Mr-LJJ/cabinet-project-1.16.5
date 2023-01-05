package com.LJJStudios.funnyfood.Item.foods.drinks;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Coca extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(2)
            .setAlwaysEdible()
            .build();
    public Coca(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
