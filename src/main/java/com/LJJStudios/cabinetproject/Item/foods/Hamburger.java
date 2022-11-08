package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Hamburger extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(10)
            .saturation(1)
            .effect(() -> new EffectInstance(Effects.LUCK,60 * 20 , 2),1)
            .effect(() -> new EffectInstance(Effects.INSTANT_DAMAGE,40 * 20 , 2),1)
            .effect(() -> new EffectInstance(Effects.JUMP_BOOST,40 * 20 , 2),1)
            .effect(() -> new EffectInstance(Effects.NIGHT_VISION,30 * 20 , 1),1)
            .effect(() -> new EffectInstance(Effects.HEALTH_BOOST,10 * 20 , 3),1)
            .effect(() -> new EffectInstance(Effects.SPEED,30 * 20 , 3),1)
            .effect(() -> new EffectInstance(Effects.WATER_BREATHING,30 * 20 , 1),1)
            .build();
    public Hamburger(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
