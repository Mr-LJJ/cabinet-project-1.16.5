package com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.vodka;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class DeepWellVodka extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(2)
            .effect(() -> new EffectInstance(Effects.NAUSEA,10 * 20,1),1)
            .setAlwaysEdible()
            .build();
    public DeepWellVodka(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
