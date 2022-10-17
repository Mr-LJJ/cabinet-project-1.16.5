package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Hamburger extends Item {
    private static final Food food = (new Food.Builder())
            .saturationMod(16)
            .nutrition(8)
            .effect(() -> new EffectInstance(Effects.LUCK,60 * 20 , 2),1)
            .effect(() -> new EffectInstance(Effects.DAMAGE_BOOST,40 * 20 , 2),1)
            .effect(() -> new EffectInstance(Effects.DIG_SPEED,40 * 20 , 2),1)
            .effect(() -> new EffectInstance(Effects.NIGHT_VISION,30 * 20 , 1),1)
            .effect(() -> new EffectInstance(Effects.HEALTH_BOOST,10 * 20 , 3),1)
            .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED,30 * 20 , 3),1)
            .effect(() -> new EffectInstance(Effects.WATER_BREATHING,30 * 20 , 1),1)
            .build();
    public Hamburger(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
