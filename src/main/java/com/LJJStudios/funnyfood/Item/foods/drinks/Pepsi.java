package com.LJJStudios.funnyfood.Item.foods.drinks;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Pepsi extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(2)
            .setAlwaysEdible()
            .build();
    public Pepsi(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
