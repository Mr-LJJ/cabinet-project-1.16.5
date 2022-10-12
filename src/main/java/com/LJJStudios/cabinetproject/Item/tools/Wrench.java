package com.LJJStudios.cabinetproject.Item.tools;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import com.LJJStudios.cabinetproject.Item.ItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class Wrench extends SwordItem {
    public Wrench(){ super(ItemTier.CABINET,3,2.4f,new Properties().tab(ModGroup.ITEM_GROUP));}
}