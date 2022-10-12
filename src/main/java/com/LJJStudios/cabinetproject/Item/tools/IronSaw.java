package com.LJJStudios.cabinetproject.Item.tools;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import com.LJJStudios.cabinetproject.Item.ItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SwordItem;

public class IronSaw extends SwordItem {
    public IronSaw(){ super(ItemTier.CABINET,5,3f,new Properties().tab(ModGroup.ITEM_GROUP));}
}
