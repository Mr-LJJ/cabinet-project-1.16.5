package com.LJJStudios.cabinetproject.Item.foods.plant;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Lemon extends Item {
    private final static Food food = (new Food.Builder())
            .hunger(10)
            .saturation(1)
            .setAlwaysEdible()
            .effect(() -> new EffectInstance(Effects.NAUSEA,5 * 20,1),1)
            .build();
    public Lemon(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
