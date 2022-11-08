package com.LJJStudios.cabinetproject.Item.tools;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import com.LJJStudios.cabinetproject.Item.ItemTier;
import net.minecraft.item.SwordItem;

public class Wrench extends SwordItem {
    public Wrench(){ super(ItemTier.CABINET,3,2.4f,new Properties().group(ModGroup.ITEM_GROUP));}
}