package com.LJJStudios.cabinetproject.Group;


import com.LJJStudios.cabinetproject.Item.ItemRegisty;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class CabinetProjectGroup extends ItemGroup {
    public CabinetProjectGroup() {
        super("cabinet_project_group");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(ItemRegisty.PigIronIngot.get());
    }
}