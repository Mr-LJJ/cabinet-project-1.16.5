package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Bread extends Item {
    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(2)
            .build();
    public Bread(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
