package com.LJJStudios.funnyfood.Item.tools;

import com.LJJStudios.funnyfood.Group.ModGroup;
import com.LJJStudios.funnyfood.Item.ItemTier;
import net.minecraft.item.SwordItem;

public class Scissors extends SwordItem {
    public Scissors(){ super(ItemTier.CABINET,2,1f,new Properties().group(ModGroup.ITEM_GROUP));}
}
