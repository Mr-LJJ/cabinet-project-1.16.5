package com.LJJStudios.cabinetproject.Item.ingots;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;


public class LeanCoal extends Item {
    private final int burnTicks;
    public LeanCoal(Properties properties,int burnTicks){
        super(new Properties().tab(ModGroup.ITEM_GROUP));
        this.burnTicks = burnTicks;
    }
    @Override
    public int getBurnTime(ItemStack itemStack) {
        return this.burnTicks;
    }
}
