package com.LJJStudios.cabinetproject.Item.foods.plant;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Cucumber extends Item {
    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(1)
            .alwaysEat()
            .build();
    public Cucumber(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
