package com.LJJStudios.cabinetproject.Item.tools;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import com.LJJStudios.cabinetproject.Item.ItemTier;
import net.minecraft.item.SwordItem;

public class Pliers extends SwordItem {
    public Pliers(){ super(ItemTier.CABINET,1,1f,new Properties().group(ModGroup.ITEM_GROUP));}
}
