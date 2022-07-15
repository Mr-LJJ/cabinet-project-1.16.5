package com.LJJStudios.cabinetproject.Item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Moss extends Item{
    public static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(1)
            .effect(() -> new EffectInstance(Effects.POISON, 5 * 20, 1), 1)
            .effect(() -> new EffectInstance(Effects.BLINDNESS, 10 * 20, 1), 1)
            .build();

    public Moss() {
        super(new Item.Properties().food(food).tab(ItemGroup.TAB_FOOD));
    }
}
