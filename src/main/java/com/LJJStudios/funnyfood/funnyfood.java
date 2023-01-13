package com.LJJStudios.funnyfood;

import com.LJJStudios.funnyfood.Block.BlockRegistry;
import com.LJJStudios.funnyfood.Item.ItemRegisty;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod(Utils.MOD_ID)
public class funnyfood {
    public funnyfood() {
        IEventBus eventBus= FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegisty.ITEMS.register(eventBus);
        BlockRegistry.BLOCKS.register(eventBus);
    }
}
