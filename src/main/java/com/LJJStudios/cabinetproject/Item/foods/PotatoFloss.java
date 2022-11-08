package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class PotatoFloss extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(10)
            .saturation(1)
            .setAlwaysEdible()
            .build();
    public PotatoFloss(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
