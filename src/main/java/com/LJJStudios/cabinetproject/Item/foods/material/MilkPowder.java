package com.LJJStudios.cabinetproject.Item.foods.material;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class MilkPowder extends Item {
    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(1)
            .effect(() -> new EffectInstance(Effects.GLOWING,5 * 20,2),1)
            .alwaysEat()
            .build();
    public MilkPowder(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
