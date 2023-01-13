package com.LJJStudios.funnyfood.Item.foods.drinks;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SodaWater extends Item {
    public SodaWater(){
        super(new Properties().group(ModGroup.ITEM_GROUP)
                .maxStackSize(1)
                .food(new Food.Builder().hunger(6).saturation(1.2f).setAlwaysEdible().build())
        );
    }
}
