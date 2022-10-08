package com.LJJStudios.cabinetproject.Block.Metal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class RustyIronBlock extends Block {
    public RustyIronBlock(){
        super(Properties.of(Material.HEAVY_METAL).harvestLevel(2));
    }
}
