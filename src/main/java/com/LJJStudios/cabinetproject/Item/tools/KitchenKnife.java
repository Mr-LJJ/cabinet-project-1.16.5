package com.LJJStudios.cabinetproject.Item.tools;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import com.LJJStudios.cabinetproject.Item.ItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.SwordItem;

public class KitchenKnife extends SwordItem {
    public KitchenKnife(){ super(ItemTier.CABINET,1,1f,new Item.Properties().group(ModGroup.ITEM_GROUP));}
}
