package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class FermentedBeanCurd extends Item {
    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(1)
            .effect(() -> new EffectInstance(Effects.CONFUSION,20 * 20 , 1),1)
            .effect(() -> new EffectInstance(Effects.INVISIBILITY,5 * 20 , 1),1)
            .alwaysEat()
            .build();
    public FermentedBeanCurd(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
