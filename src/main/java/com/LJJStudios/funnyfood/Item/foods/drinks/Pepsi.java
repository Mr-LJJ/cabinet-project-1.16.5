package com.LJJStudios.funnyfood.Item.foods.drinks;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Pepsi extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(2)
            .setAlwaysEdible()
            .build();
    public Pepsi(){
        super(new Properties().group(ModGroup.ITEM_GROUP));
    }
    @Override
    public ItemStack onItemUseFinish(ItemStack stack, World worldIn, LivingEntity entityLiving) {
        if (entityLiving instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity) entityLiving;
            player.heal(2.0F);
            player.getFoodStats().addStats(10,0.5F);
        }
        return super.onItemUseFinish(stack,worldIn,entityLiving);
    }
}
