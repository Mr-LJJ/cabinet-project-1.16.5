package com.LJJStudios.funnyfood.Item.foods.plant;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Garlic extends Item {
    public static Food foods = new Food.Builder()
            .effect(() -> new EffectInstance(Effects.NAUSEA,5 * 20,1),1)
            .saturation(2)
            .hunger(1)
            .setAlwaysEdible()
            .build();
    public Garlic(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
