package com.LJJStudios.funnyfood.Item.foods.plant;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Lemon extends Item {
    private final static Food food = (new Food.Builder())
            .hunger(1)
            .saturation(1)
            .effect(() -> new EffectInstance(Effects.NAUSEA,5 * 20,1),1)
            .setAlwaysEdible()
            .build();
    public Lemon(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
