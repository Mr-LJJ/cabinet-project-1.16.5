package com.LJJStudios.funnyfood.Item.foods;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class FrenchFries extends Item{
    public static final Food food = (new Food.Builder())
            .hunger(3)
            .saturation(1)
            .setAlwaysEdible()
            .build();
    public FrenchFries(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
