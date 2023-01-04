package com.LJJStudios.funnyfood.Item.tools;

import com.LJJStudios.funnyfood.Group.ModGroup;
import com.LJJStudios.funnyfood.Item.ItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class KitchenKnife extends SwordItem {
    public KitchenKnife(){ super(ItemTier.CABINET,1,1f,new Item.Properties().group(ModGroup.ITEM_GROUP));}
}
