package com.LJJStudios.funnyfood.Item.tools;

import com.LJJStudios.funnyfood.Group.ModGroup;
import com.LJJStudios.funnyfood.Item.ItemTier;
import net.minecraft.item.SwordItem;

public class Pliers extends SwordItem {
    public Pliers(){ super(ItemTier.CABINET,1,1f,new Properties().group(ModGroup.ITEM_GROUP));}
}
