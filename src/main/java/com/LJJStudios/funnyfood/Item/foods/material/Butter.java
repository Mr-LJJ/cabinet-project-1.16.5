package com.LJJStudios.funnyfood.Item.foods.material;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Butter extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(1)
            .effect(() -> new EffectInstance(Effects.LUCK,30 * 20,2),1)
            .setAlwaysEdible()
            .build();
    public Butter(){super(new Properties().group(ModGroup.ITEM_GROUP));}
}
