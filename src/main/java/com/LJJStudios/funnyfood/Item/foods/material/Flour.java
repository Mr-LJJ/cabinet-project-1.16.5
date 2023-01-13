package com.LJJStudios.funnyfood.Item.foods.material;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Flour extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(1)
            .effect(() -> new EffectInstance(Effects.SLOWNESS,20 * 20,3),1)
            .setAlwaysEdible()
            .build();
    public Flour(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
