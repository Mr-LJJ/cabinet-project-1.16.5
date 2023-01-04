package com.LJJStudios.funnyfood.Group;


import com.LJJStudios.funnyfood.Item.ItemRegisty;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FunnyFoodGroup extends ItemGroup {
    public FunnyFoodGroup() {
        super("funny_food_group");
    }

    @Override
    public ItemStack createIcon() {
        return new ItemStack(ItemRegisty.PigIronIngot.get());
    }
}