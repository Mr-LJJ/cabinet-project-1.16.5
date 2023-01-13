package com.LJJStudios.funnyfood.Item.foods.plant;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Chili extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(1)
            .saturation(1)
            .effect(() -> new EffectInstance(Effects.INSTANT_DAMAGE,5 * 20,2),1)
            .effect(() -> new EffectInstance(Effects.SPEED,30 * 20,3),1)
            .setAlwaysEdible()
            .build();
    public Chili(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
