package com.LJJStudios.funnyfood.Block;

import com.LJJStudios.funnyfood.Utils;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> FunnyBlock = BLOCKS.register( "funny_block" , com.LJJStudios.funnyfood.Block.Metal.FunnyBlock::new);
    public static final RegistryObject<Block> ForgedIronBlock = BLOCKS.register("forged_iron_block" , com.LJJStudios.funnyfood.Block.Metal.ForgedIronBlock::new);
    public static final RegistryObject<Block> RustyIronBlock = BLOCKS.register("rusty_iron_block" , com.LJJStudios.funnyfood.Block.Metal.RustyIronBlock::new);
    public static final RegistryObject<Block> Wood = BLOCKS.register("wood" , com.LJJStudios.funnyfood.Block.Wood.Wood::new);
    public static final RegistryObject<Block> Leaves = BLOCKS.register("leaves" , com.LJJStudios.funnyfood.Block.Wood.Leaves::new);

}
