package com.LJJStudios.funnyfood.Block.Metal;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FunnyBlock extends Block {
    public FunnyBlock(){
        super(Properties.create(Material.ROCK).harvestLevel(3));
    }
}
