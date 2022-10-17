package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class BurgerEmbryo extends Item {
    private static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(2)
            .build();
    public BurgerEmbryo(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
