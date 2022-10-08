package com.LJJStudios.cabinetproject.Block.Metal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
public class ForgedIronBlock extends Block {
    public ForgedIronBlock(){
        super(Properties.of(Material.HEAVY_METAL).harvestLevel(2));
    }
}
