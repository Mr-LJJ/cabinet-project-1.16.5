package com.LJJStudios.funnyfood.Item.foods;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Laoganma extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(10)
            .saturation(1)
            .effect(() -> new EffectInstance(Effects.INSTANT_DAMAGE,20 * 20 , 2),1)
            .setAlwaysEdible()
            .build();
    public Laoganma(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
