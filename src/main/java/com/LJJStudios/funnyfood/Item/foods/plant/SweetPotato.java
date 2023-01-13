package com.LJJStudios.funnyfood.Item.foods.plant;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class SweetPotato extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(2)
            .saturation(1)
            .effect(() -> new EffectInstance(Effects.INSTANT_DAMAGE,5 * 20 , 1),1)
            .setAlwaysEdible()
            .build();
    public SweetPotato(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
