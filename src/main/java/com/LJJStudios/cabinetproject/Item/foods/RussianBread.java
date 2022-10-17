package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RussianBread extends Item {
    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(3)
            .effect(() -> new EffectInstance(Effects.DIG_SPEED,20 * 20 , 2),1)
            .effect(() -> new EffectInstance(Effects.DAMAGE_BOOST,20 * 20 , 2),1)
            .alwaysEat()
            .build();
    public RussianBread(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
