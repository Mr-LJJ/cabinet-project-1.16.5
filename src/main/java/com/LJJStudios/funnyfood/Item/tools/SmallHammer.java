package com.LJJStudios.funnyfood.Item.tools;

import com.LJJStudios.funnyfood.Group.ModGroup;
import com.LJJStudios.funnyfood.Item.ItemTier;
import net.minecraft.item.SwordItem;

public class SmallHammer extends SwordItem {
    public SmallHammer(){ super(ItemTier.CABINET,3,2.4f,new Properties().group(ModGroup.ITEM_GROUP));}
}
