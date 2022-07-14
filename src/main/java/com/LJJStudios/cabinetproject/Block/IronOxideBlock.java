package com.LJJStudios.cabinetproject.Block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class IronOxideBlock extends Block {
    public IronOxideBlock(){
        super(Properties.of(Material.HEAVY_METAL).harvestLevel(2));
    }
}
