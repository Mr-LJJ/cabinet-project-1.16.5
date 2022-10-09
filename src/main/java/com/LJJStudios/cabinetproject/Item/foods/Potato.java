package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class Potato extends Item{
    public static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(4)
            .build();

    public Potato() {
        super(new Item.Properties().food(food).tab(ModGroup.ITEM_GROUP));
    }
}