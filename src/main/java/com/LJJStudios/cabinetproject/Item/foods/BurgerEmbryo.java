package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class BurgerEmbryo extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(10)
            .saturation(1)
            .build();
    public BurgerEmbryo(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
