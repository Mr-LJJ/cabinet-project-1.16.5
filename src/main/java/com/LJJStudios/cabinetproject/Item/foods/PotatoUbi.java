package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class PotatoUbi extends Item {
    public static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(4)
            .build();
    public PotatoUbi() {
        super(new Item.Properties().food(food).tab(ModGroup.ITEM_GROUP));
    }
}
