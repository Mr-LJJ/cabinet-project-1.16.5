package com.LJJStudios.cabinetproject.Item.tools;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import com.LJJStudios.cabinetproject.Item.ItemTier;
import net.minecraft.item.SwordItem;

public class Scissors extends SwordItem {
    public Scissors(){ super(ItemTier.CABINET,2,1f,new Properties().tab(ModGroup.ITEM_GROUP));}
}
