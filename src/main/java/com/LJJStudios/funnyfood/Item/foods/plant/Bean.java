package com.LJJStudios.funnyfood.Item.foods.plant;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Bean extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(10)
            .saturation(1)
            .setAlwaysEdible()
            .build();
    public Bean(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
