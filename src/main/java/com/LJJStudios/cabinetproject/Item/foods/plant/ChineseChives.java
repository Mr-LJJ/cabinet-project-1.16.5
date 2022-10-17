package com.LJJStudios.cabinetproject.Item.foods.plant;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ChineseChives extends Item {
    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(2)
            .alwaysEat()
            .build();
    public ChineseChives(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
