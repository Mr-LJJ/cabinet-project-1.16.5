package com.LJJStudios.cabinetproject.Block;

import com.LJJStudios.cabinetproject.Utils;
import net.minecraft.block.Block;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class BlockRegistry {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Utils.MOD_ID);
    public static final RegistryObject<Block> CabinetBlock = BLOCKS.register( "cabinet_block" , CabinetBlock::new);
    public static final RegistryObject<Block> ForgedIronBlock = BLOCKS.register("forged_iron_block" , ForgedIronBlock::new);
    public static final RegistryObject<Block> IronOxideBlock = BLOCKS.register("iron_oxide_block" , IronOxideBlock::new);
    public static final RegistryObject<Block> RustyIronBlock = BLOCKS.register("rusty_iron_block" , RustyIronBlock::new);

}
