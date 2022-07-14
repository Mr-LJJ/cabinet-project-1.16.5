package com.LJJStudios.cabinetproject.Food;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Moss extends Item {
    public static final Food FOOD = (new Food.Builder())
            .effect(() -> new EffectInstance(Effects.POISON, 3 * 20, 1), 1)
            .build();

    public Moss() {
        super(new Properties().food(FOOD).tab(ItemGroup.TAB_FOOD));
    }
}
