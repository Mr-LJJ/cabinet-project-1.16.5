package com.LJJStudios.cabinetproject.Block.Metal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class CabinetBlock extends Block {
    public CabinetBlock(){
        super(Properties.of(Material.STONE).harvestLevel(3));
    }
}
