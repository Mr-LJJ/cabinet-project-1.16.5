package com.LJJStudios.cabinetproject.Item.tools;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import com.LJJStudios.cabinetproject.Item.ItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class Knife extends SwordItem {
    public Knife(){ super(ItemTier.CABINET,8,5f,new Item.Properties().group(ModGroup.ITEM_GROUP));}
}
