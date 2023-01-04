package com.LJJStudios.funnyfood.Block.Wood;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class Leaves extends Block {
    public Leaves(){super(AbstractBlock.Properties.create(Material.LEAVES).harvestLevel(1).notSolid());
    }
}
