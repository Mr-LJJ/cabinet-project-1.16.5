package com.LJJStudios.funnyfood.Item.foods;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Potato extends Item{
    public static final Food food = (new Food.Builder())
            .hunger(10)
            .saturation(1)
            .build();

    public Potato() {
        super(new Item.Properties().food(food).group(ModGroup.ITEM_GROUP));
    }
}