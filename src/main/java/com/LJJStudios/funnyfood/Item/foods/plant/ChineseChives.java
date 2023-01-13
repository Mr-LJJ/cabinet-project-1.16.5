package com.LJJStudios.funnyfood.Item.foods.plant;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class ChineseChives extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(1)
            .saturation(1)
            .setAlwaysEdible()
            .build();
    public ChineseChives(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
