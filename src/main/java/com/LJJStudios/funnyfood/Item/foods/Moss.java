package com.LJJStudios.funnyfood.Item.foods;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class Moss extends Item{
    public static final Food food = (new Food.Builder())
            .hunger(1)
            .saturation(1)
            .effect(() -> new EffectInstance(Effects.POISON, 5 * 20, 1), 1)
            .effect(() -> new EffectInstance(Effects.BLINDNESS, 10 * 20, 1), 1)
            .setAlwaysEdible()
            .build();

    public Moss() {
        super(new Item.Properties().food(food).group(ModGroup.ITEM_GROUP));
    }
}
