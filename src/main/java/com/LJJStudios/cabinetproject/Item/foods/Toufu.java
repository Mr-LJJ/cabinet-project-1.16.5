package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Toufu extends Item {
    public static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(1)
            .build();
    public Toufu(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
