package com.LJJStudios.funnyfood.Item.foods.drinks;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class Coca extends Item {
    public Coca(){
        super(new Properties().group(ModGroup.ITEM_GROUP)
                .maxStackSize(1)
                .food(new Food.Builder().hunger(6).saturation(1.2f).setAlwaysEdible().build())
        );
    }
}
