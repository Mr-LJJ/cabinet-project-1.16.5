package com.LJJStudios.cabinetproject.Item.ingots;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

public class LeanCoal extends Item {
    private final int burnTicks;
    public LeanCoal(int burnTicks){ super(new Properties().tab(ModGroup.ITEM_GROUP)); this.burnTicks = getBurnTime()}
}
