package com.LJJStudios.cabinetproject.Item.foods;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class RussianSausage extends Item {
    public static final Food food = (new Food.Builder())
            .saturationMod(10)
            .nutrition(2)
            .effect(() -> new EffectInstance(Effects.DAMAGE_BOOST,10 * 20,1),1)
            .build();
    public RussianSausage(){super(new Properties().tab(ModGroup.ITEM_GROUP));}
}
