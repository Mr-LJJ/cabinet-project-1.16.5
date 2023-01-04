package com.LJJStudios.funnyfood.Item.tools;

import com.LJJStudios.funnyfood.Group.ModGroup;
import com.LJJStudios.funnyfood.Item.ItemTier;
import net.minecraft.item.SwordItem;

public class Crowbar extends SwordItem {
    public Crowbar(){ super(ItemTier.CABINET,7,2.4f,new Properties().group(ModGroup.ITEM_GROUP));}
}
