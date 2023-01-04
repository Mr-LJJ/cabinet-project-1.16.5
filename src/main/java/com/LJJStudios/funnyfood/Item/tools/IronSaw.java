package com.LJJStudios.funnyfood.Item.tools;

import com.LJJStudios.funnyfood.Group.ModGroup;
import com.LJJStudios.funnyfood.Item.ItemTier;
import net.minecraft.item.SwordItem;

public class IronSaw extends SwordItem {
    public IronSaw(){ super(ItemTier.CABINET,5,3f,new Properties().group(ModGroup.ITEM_GROUP));}
}
