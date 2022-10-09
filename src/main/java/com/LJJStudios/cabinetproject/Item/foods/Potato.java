package com.LJJStudios.cabinetproject.Item.foods;

import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Potato extends Item{
    public static final Food food = (new Food.Builder())
            .saturationMod(30)
            .nutrition(3)
            .build();

    public Potato() {
        super(new Item.Properties().food(food).tab(ItemGroup.TAB_FOOD));
    }
}