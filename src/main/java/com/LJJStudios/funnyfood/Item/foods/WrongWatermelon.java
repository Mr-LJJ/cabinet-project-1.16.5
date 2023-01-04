package com.LJJStudios.funnyfood.Item.foods;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class WrongWatermelon extends Item {
    private final static Food food = (new Food.Builder())
            .hunger(10)
            .saturation(1)
            .effect(() -> new EffectInstance(Effects.JUMP_BOOST,20 * 20,2),1)
            .effect(() -> new EffectInstance(Effects.SPEED,20 * 20,2),1)
            .effect(() -> new EffectInstance(Effects.INSTANT_DAMAGE,20 * 20,2),1)
            .effect(() -> new EffectInstance(Effects.INSTANT_HEALTH,20 * 20,2),1)
            .setAlwaysEdible()
            .build();
    public WrongWatermelon(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
