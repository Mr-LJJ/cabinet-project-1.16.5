package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;


public class Bark extends Item {
    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(2)
            .effect(() -> new EffectInstance(Effects.POISON, 5 * 20, 1), 1)
            .effect(() -> new EffectInstance(Effects.MOVEMENT_SLOWDOWN, 10 * 20, 1), 1)
            .build();
    public Bark() {
        super(new Properties().food(food).tab(ModGroup.ITEM_GROUP));
    }
}
