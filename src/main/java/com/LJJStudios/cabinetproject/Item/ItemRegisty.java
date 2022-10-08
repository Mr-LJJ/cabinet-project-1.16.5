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
    public static final RegistryObject<Item> WoodIngot = ITEMS.register("wood_ingot", com.LJJStudios.cabinetproject.Item.ingots.WoodIngot::new);
    public static final RegistryObject<Item> LeanCoal = ITEMS.register("lean_coal", com.LJJStudios.cabinetproject.Item.ingots.LeanCoal::new);
    public static final RegistryObject<Item> ForgedIronIngot = ITEMS.register("forged_iron_ingot", com.LJJStudios.cabinetproject.Item.ingots.ForgedIronIngot::new);
    public static final RegistryObject<Item> IronOxideIngot = ITEMS.register("iron_oxide_ingot", com.LJJStudios.cabinetproject.Item.ingots.IronOxideIngot::new);
    public static final RegistryObject<Item> RustyIronIngot = ITEMS.register("rusty_iron_ingot", com.LJJStudios.cabinetproject.Item.ingots.RustyIronIngot::new);
    public static final RegistryObject<Item> Stick = ITEMS.register("stick", com.LJJStudios.cabinetproject.Item.Item.Stick::new);


    public static final RegistryObject<Item> CabinetBlock = ITEMS.register("cabinet_block", () -> new BlockItem(BlockRegistry.CabinetBlock.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> ForgedIronBlock = ITEMS.register("forged_iron_block", () -> new BlockItem(BlockRegistry.ForgedIronBlock.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> IronOxideBlock = ITEMS.register("iron_oxide_block", () -> new BlockItem(BlockRegistry.IronOxideBlock.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> RustyIronBlock = ITEMS.register("rusty_iron_block", () -> new BlockItem(BlockRegistry.RustyIronBlock.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));
    public static final RegistryObject<Item> Wood = ITEMS.register("wood", () -> new BlockItem(BlockRegistry.Wood.get(), new Item.Properties().tab(ItemGroup.TAB_BUILDING_BLOCKS)));

    public static final RegistryObject<Item> Bark = ITEMS.register("bark", com.LJJStudios.cabinetproject.Item.foods.Bark::new);
    public static final RegistryObject<Item> Sawdust = ITEMS.register("sawdust", com.LJJStudios.cabinetproject.Item.foods.Sawdust::new);
    public static final RegistryObject<Item> Moss = ITEMS.register("moss", com.LJJStudios.cabinetproject.Item.foods.Moss::new);
    public static final RegistryObject<Item> PoisonApple = ITEMS.register("poison_apple", com.LJJStudios.cabinetproject.Item.foods.PoisonApple::new);
    public static final RegistryObject<Item> CoalPowder = ITEMS.register("coal_powder", com.LJJStudios.cabinetproject.Item.foods.CoalPowder::new);
    public static final RegistryObject<Item> SmallHammer = ITEMS.register("small_hammer", com.LJJStudios.cabinetproject.Item.tools.SmallHammer::new);
    public static final RegistryObject<Item> IronSaw = ITEMS.register("iron_saw", com.LJJStudios.cabinetproject.Item.tools.IronSaw::new);
    public static final RegistryObject<Item> ScrewDriver = ITEMS.register("screw_driver", com.LJJStudios.cabinetproject.Item.tools.ScrewDriver::new);
    public static final RegistryObject<Item> Wrench = ITEMS.register("wrench", com.LJJStudios.cabinetproject.Item.tools.Wrench::new);
}