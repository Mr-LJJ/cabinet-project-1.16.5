package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ChiveFlower extends Item {
    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(1)
            .effect(() -> new EffectInstance(Effects.CONFUSION,5 * 20 , 1),1)
            .alwaysEat()
            .build();
    public ChiveFlower(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
