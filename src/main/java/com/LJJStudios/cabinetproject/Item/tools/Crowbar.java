package com.LJJStudios.cabinetproject.Item.tools;

import com.LJJStudios.cabinetproject.Group.ModGroup;
import com.LJJStudios.cabinetproject.Item.ItemTier;
import net.minecraft.item.SwordItem;

public class Crowbar extends SwordItem {
    public Crowbar(){ super(ItemTier.CABINET,7,2.4f,new Properties().group(ModGroup.ITEM_GROUP));}
}
