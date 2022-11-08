package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;


public class Bark extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(10)
            .saturation(1)
            .setAlwaysEdible()
            .effect(() -> new EffectInstance(Effects.POISON, 5 * 20, 1), 1)
            .effect(() -> new EffectInstance(Effects.SLOWNESS, 10 * 20, 1), 1)
            .build();

    public Bark() {
        super(new Properties().food(food).group(ModGroup.ITEM_GROUP));
    }
}
