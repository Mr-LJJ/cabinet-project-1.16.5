package com.LJJStudios.cabinetproject.Item.tools;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import com.LJJStudios.cabinetproject.Item.ItemTier;
import net.minecraft.item.SwordItem;

public class SmallHammer extends SwordItem {
    public SmallHammer(){ super(ItemTier.CABINET,3,2.4f,new Properties().tab(ModGroup.ITEM_GROUP));}
}
