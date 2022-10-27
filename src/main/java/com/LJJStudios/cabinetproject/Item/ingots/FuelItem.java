package com.LJJStudios.cabinetproject.Item.ingots;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nullable;

public class FuelItem extends Item {
    private final int burnTicks;
    public FuelItem(Item.Properties properties, int burnTimeInTicks) {
        super(properties);
        this.burnTicks = burnTimeInTicks;
    }
    @Override
    public int getBurnTime(ItemStack itemStack) {
        return this.burnTicks;
    }
}