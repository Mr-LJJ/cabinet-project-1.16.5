package com.LJJStudios.cabinetproject.Item;

import com.LJJStudios.cabinetproject.Block.BlockRegistry;
import com.LJJStudios.cabinetproject.Utils;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegisty {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> WoodIngot = ITEMS.register("wood_ingot", WoodIngot::new);
    public static final RegistryObject<Item> ForgedIronIngot = ITEMS.register("forged_iron_ingot", ForgedIronIngot::new);
    public static final RegistryObject<Item> IronOxideIngot = ITEMS.register("iron_oxide_ingot", IronOxideIngot::new);
    public static final RegistryObject<Item> RustyIronIngot = ITEMS.register("rusty_iron_ingot", RustyIronIngot::new);
    public static final RegistryObject<Item> CabinetBlock = ITEMS.register("cabinet_block", () -> new BlockItem(BlockRegistry.CabinetBlock.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ForgedIronBlock = ITEMS.register("forged_iron_block", () -> new BlockItem(BlockRegistry.ForgedIronBlock.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> IronOxideBlock = ITEMS.register("iron_oxide_block", () -> new BlockItem(BlockRegistry.IronOxideBlock.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RustyIronBlock = ITEMS.register("rusty_iron_block", () -> new BlockItem(BlockRegistry.RustyIronBlock.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> Bark = ITEMS.register("bark", Bark::new);
    public static final RegistryObject<Item> Sawdust = ITEMS.register("sawdust", Sawdust::new);
    public static final RegistryObject<Item> Moss = ITEMS.register("moss", Moss::new);
    public static final RegistryObject<Item> CoalPowder = ITEMS.register("coal_powder", CoalPowder::new);
}
