package com.LJJStudios.cabinetproject;

import com.LJJStudios.cabinetproject.Block.BlockRegistry;
import com.LJJStudios.cabinetproject.Item.ItemRegisty;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
@Mod(Utils.MOD_ID)
public class cabinetproject {

    public cabinetproject() {
        IEventBus eventBus= FMLJavaModLoadingContext.get().getModEventBus();
        ItemRegisty.ITEMS.register(eventBus);
        BlockRegistry.BLOCKS.register(eventBus);

    }
}
