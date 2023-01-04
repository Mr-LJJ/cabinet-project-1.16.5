package com.LJJStudios.funnyfood.Item.tools;

import com.LJJStudios.funnyfood.Group.ModGroup;
import com.LJJStudios.funnyfood.Item.ItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class Knife extends SwordItem {
    public Knife(){ super(ItemTier.CABINET,8,5f,new Item.Properties().group(ModGroup.ITEM_GROUP));}
}
