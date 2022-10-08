package com.LJJStudios.cabinetproject.Block.Wood;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Wood extends Block {
    public Wood(){
        super(Properties.of(Material.WOOD).harvestLevel(1));
    }
}
