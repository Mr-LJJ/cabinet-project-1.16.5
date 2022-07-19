package com.LJJStudios.cabinetproject.Item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class CoalPowder extends Item{
    public static final Food food = (new Food.Builder())
            .saturationMod(5)
            .nutrition(1)
            .effect(() -> new EffectInstance(Effects.HEAL , 5 * 20, 1), 1)
            .build();

    public CoalPowder() {
        super(new Item.Properties().food(food).tab(ItemGroup.TAB_FOOD));
    }
}
