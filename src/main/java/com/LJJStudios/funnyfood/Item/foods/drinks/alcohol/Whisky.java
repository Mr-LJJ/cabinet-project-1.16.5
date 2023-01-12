package com.LJJStudios.funnyfood.Item.foods.drinks.alcohol;

import com.LJJStudios.funnyfood.Group.ModGroup;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.world.World;

public class Whisky extends Item {
    private static final Food food = (new Food.Builder())
            .hunger(2)
            .effect(() -> new EffectInstance(Effects.NAUSEA,5 * 20,1),1)
            .setAlwaysEdible()
            .build();
    public Whisky(){
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
