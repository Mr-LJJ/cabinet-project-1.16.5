package com.LJJStudios.cabinetproject.Item;

import com.LJJStudios.cabinetproject.Block.BlockRegistry;
import com.LJJStudios.cabinetproject.Group.ModGroup;
import com.LJJStudios.cabinetproject.Item.Item.ScrewNut;
import com.LJJStudios.cabinetproject.Utils;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegisty {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> WoodIngot = ITEMS.register("wood_ingot", com.LJJStudios.cabinetproject.Item.ingots.WoodIngot::new);
    public static final RegistryObject<Item> LeanCoal = ITEMS.register("lean_coal", com.LJJStudios.cabinetproject.Item.ingots.LeanCoal::new);
    public static final RegistryObject<Item> ForgedIronIngot = ITEMS.register("forged_iron_ingot", com.LJJStudios.cabinetproject.Item.ingots.ForgedIronIngot::new);
    public static final RegistryObject<Item> RustyIronIngot = ITEMS.register("rusty_iron_ingot", com.LJJStudios.cabinetproject.Item.ingots.RustyIronIngot::new);
    public static final RegistryObject<Item> CopperIngot = ITEMS.register("copper_ingot" , com.LJJStudios.cabinetproject.Item.ingots.CopperIngot::new);
    public static final RegistryObject<Item> PigIronIngot = ITEMS.register("pig_iron_ingot" , com.LJJStudios.cabinetproject.Item.ingots.PigIronIngot::new);
    public static final RegistryObject<Item> StainlessSteelIngot = ITEMS.register("stainless_steel_ingot" , com.LJJStudios.cabinetproject.Item.ingots.StainlessSteelIngot::new);


    public static final RegistryObject<Item> CopperRod = ITEMS.register("copper_rod" , com.LJJStudios.cabinetproject.Item.Item.CopperRod::new);
    public static final RegistryObject<Item> CopperScrew = ITEMS.register("copper_screw" , com.LJJStudios.cabinetproject.Item.Item.CopperScrew::new);
    public static final RegistryObject<Item> ExpansionScrew = ITEMS.register("expansion_screw" , com.LJJStudios.cabinetproject.Item.Item.ExpansionScrew::new);
    public static final RegistryObject<Item> IronScrew = ITEMS.register("iron_screw" , com.LJJStudios.cabinetproject.Item.Item.IronScrew::new);
    public static final RegistryObject<Item> ScrewNut = ITEMS.register("screw_nut" , ScrewNut::new);
    public static final RegistryObject<Item> Stick = ITEMS.register("stick", com.LJJStudios.cabinetproject.Item.Item.Stick::new);
    public static final RegistryObject<Item> IronRod = ITEMS.register("iron_rod", com.LJJStudios.cabinetproject.Item.Item.IronRod::new);


    public static final RegistryObject<Item> CabinetBlock = ITEMS.register("cabinet_block", () -> new BlockItem(BlockRegistry.CabinetBlock.get(), new Item.Properties().tab(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> ForgedIronBlock = ITEMS.register("forged_iron_block", () -> new BlockItem(BlockRegistry.ForgedIronBlock.get(), new Item.Properties().tab(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> RustyIronBlock = ITEMS.register("rusty_iron_block", () -> new BlockItem(BlockRegistry.RustyIronBlock.get(), new Item.Properties().tab(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> Wood = ITEMS.register("wood", () -> new BlockItem(BlockRegistry.Wood.get(), new Item.Properties().tab(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> Leaves = ITEMS.register("leaves", () -> new BlockItem(BlockRegistry.Leaves.get(), new Item.Properties().tab(ModGroup.ITEM_GROUP)));

    public static final RegistryObject<Item> Bark = ITEMS.register("bark", com.LJJStudios.cabinetproject.Item.foods.Bark::new);
    public static final RegistryObject<Item> Sawdust = ITEMS.register("sawdust", com.LJJStudios.cabinetproject.Item.foods.Sawdust::new);
    public static final RegistryObject<Item> Moss = ITEMS.register("moss", com.LJJStudios.cabinetproject.Item.foods.Moss::new);
    public static final RegistryObject<Item> PoisonApple = ITEMS.register("poison_apple", com.LJJStudios.cabinetproject.Item.foods.PoisonApple::new);
    public static final RegistryObject<Item> Potato = ITEMS.register("potato" , com.LJJStudios.cabinetproject.Item.foods.Potato::new);
    public static final RegistryObject<Item> CoalPowder = ITEMS.register("coal_powder", com.LJJStudios.cabinetproject.Item.foods.CoalPowder::new);
    public static final RegistryObject<Item> PotatoUbi = ITEMS.register("potato_ubi", com.LJJStudios.cabinetproject.Item.foods.PotatoUbi::new);

    public static final RegistryObject<Item> SmallHammer = ITEMS.register("small_hammer", com.LJJStudios.cabinetproject.Item.tools.SmallHammer::new);
    public static final RegistryObject<Item> IronSaw = ITEMS.register("iron_saw", com.LJJStudios.cabinetproject.Item.tools.IronSaw::new);
    public static final RegistryObject<Item> ScrewDriver = ITEMS.register("screw_driver", com.LJJStudios.cabinetproject.Item.tools.ScrewDriver::new);
    public static final RegistryObject<Item> Wrench = ITEMS.register("wrench", com.LJJStudios.cabinetproject.Item.tools.Wrench::new);
    public static final RegistryObject<Item> Crowbar = ITEMS.register("crowbar", com.LJJStudios.cabinetproject.Item.tools.Crowbar::new);
    public static final RegistryObject<Item> Pliers = ITEMS.register("pliers", com.LJJStudios.cabinetproject.Item.tools.Pliers::new);
    public static final RegistryObject<Item> Scissors = ITEMS.register("scissors", com.LJJStudios.cabinetproject.Item.tools.Scissors::new);
    public static final RegistryObject<Item> KitchenKnife = ITEMS.register("kitchen_knife", com.LJJStudios.cabinetproject.Item.tools.KitchenKnife::new);
    public static final RegistryObject<Item> Knife = ITEMS.register("knife", com.LJJStudios.cabinetproject.Item.tools.Knife::new);
}