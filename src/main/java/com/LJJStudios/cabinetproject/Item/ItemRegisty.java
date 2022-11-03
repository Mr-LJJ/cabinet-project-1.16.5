package com.LJJStudios.cabinetproject.Item;

import com.LJJStudios.cabinetproject.Block.BlockRegistry;
import com.LJJStudios.cabinetproject.Group.ModGroup;
import com.LJJStudios.cabinetproject.Item.Item.ScrewNut;
import com.LJJStudios.cabinetproject.Item.ingots.FuelItem;
import com.LJJStudios.cabinetproject.Item.ingots.LeanCoal;
import com.LJJStudios.cabinetproject.Utils;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegisty {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> WoodIngot = ITEMS.register("wood_ingot", com.LJJStudios.cabinetproject.Item.ingots.WoodIngot::new);
    public static final RegistryObject<Item> ForgedIronIngot = ITEMS.register("forged_iron_ingot", com.LJJStudios.cabinetproject.Item.ingots.ForgedIronIngot::new);
    public static final RegistryObject<Item> RustyIronIngot = ITEMS.register("rusty_iron_ingot", com.LJJStudios.cabinetproject.Item.ingots.RustyIronIngot::new);
    public static final RegistryObject<Item> CopperIngot = ITEMS.register("copper_ingot" , com.LJJStudios.cabinetproject.Item.ingots.CopperIngot::new);
    public static final RegistryObject<Item> PigIronIngot = ITEMS.register("pig_iron_ingot" , com.LJJStudios.cabinetproject.Item.ingots.PigIronIngot::new);
    public static final RegistryObject<Item> StainlessSteelIngot = ITEMS.register("stainless_steel_ingot" , com.LJJStudios.cabinetproject.Item.ingots.StainlessSteelIngot::new);
    public static final RegistryObject<Item> LeanCoal = ITEMS.register("lean_coal", () -> new LeanCoal(new Item.Properties().group(ModGroup.ITEM_GROUP), 3200));
    public static final RegistryObject<Item> FUEL = ITEMS.register("fuel", () -> new FuelItem(new Item.Properties().group(ModGroup.ITEM_GROUP), 3200));

    public static final RegistryObject<Item> CopperRod = ITEMS.register("copper_rod" , com.LJJStudios.cabinetproject.Item.Item.CopperRod::new);
    public static final RegistryObject<Item> CopperScrew = ITEMS.register("copper_screw" , com.LJJStudios.cabinetproject.Item.Item.CopperScrew::new);
    public static final RegistryObject<Item> ExpansionScrew = ITEMS.register("expansion_screw" , com.LJJStudios.cabinetproject.Item.Item.ExpansionScrew::new);
    public static final RegistryObject<Item> IronScrew = ITEMS.register("iron_screw" , com.LJJStudios.cabinetproject.Item.Item.IronScrew::new);
    public static final RegistryObject<Item> ScrewNut = ITEMS.register("screw_nut" , ScrewNut::new);
    public static final RegistryObject<Item> Stick = ITEMS.register("stick", com.LJJStudios.cabinetproject.Item.Item.Stick::new);
    public static final RegistryObject<Item> IronRod = ITEMS.register("iron_rod", com.LJJStudios.cabinetproject.Item.Item.IronRod::new);
    public static final RegistryObject<Item> Magnet = ITEMS.register("magnet" , com.LJJStudios.cabinetproject.Item.Item.Magnet::new);

    public static final RegistryObject<Item> CabinetBlock = ITEMS.register("cabinet_block", () -> new BlockItem(BlockRegistry.CabinetBlock.get(), new Item.Properties().tab(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> ForgedIronBlock = ITEMS.register("forged_iron_block", () -> new BlockItem(BlockRegistry.ForgedIronBlock.get(), new Item.Properties().tab(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> RustyIronBlock = ITEMS.register("rusty_iron_block", () -> new BlockItem(BlockRegistry.RustyIronBlock.get(), new Item.Properties().tab(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> Wood = ITEMS.register("wood", () -> new BlockItem(BlockRegistry.Wood.get(), new Item.Properties().group(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> Leaves = ITEMS.register("leaves", () -> new BlockItem(BlockRegistry.Leaves.get(), new Item.Properties().group(ModGroup.ITEM_GROUP)));

    public static final RegistryObject<Item> Bark = ITEMS.register("bark", com.LJJStudios.cabinetproject.Item.foods.Bark::new);
    public static final RegistryObject<Item> Sawdust = ITEMS.register("sawdust", com.LJJStudios.cabinetproject.Item.foods.Sawdust::new);
    public static final RegistryObject<Item> Moss = ITEMS.register("moss", com.LJJStudios.cabinetproject.Item.foods.Moss::new);
    public static final RegistryObject<Item> PoisonApple = ITEMS.register("poison_apple", com.LJJStudios.cabinetproject.Item.foods.PoisonApple::new);
    public static final RegistryObject<Item> Potato = ITEMS.register("potato" , com.LJJStudios.cabinetproject.Item.foods.Potato::new);
    public static final RegistryObject<Item> CoalPowder = ITEMS.register("coal_powder", com.LJJStudios.cabinetproject.Item.foods.CoalPowder::new);
    public static final RegistryObject<Item> PotatoUbi = ITEMS.register("potato_ubi", com.LJJStudios.cabinetproject.Item.foods.PotatoUbi::new);
    public static final RegistryObject<Item> Hamburger = ITEMS.register("hamburger" , com.LJJStudios.cabinetproject.Item.foods.Hamburger::new);
    public static final RegistryObject<Item> PotatoFloss = ITEMS.register("potato_floss" , com.LJJStudios.cabinetproject.Item.foods.PotatoFloss::new);
    public static final RegistryObject<Item> RussianBread = ITEMS.register("russian_bread" , com.LJJStudios.cabinetproject.Item.foods.RussianBread::new);
    public static final RegistryObject<Item> RussianSausage = ITEMS.register("russian_sausage" , com.LJJStudios.cabinetproject.Item.foods.RussianSausage::new);
    public static final RegistryObject<Item> PickledCucumber = ITEMS.register("pickled_cucumber" , com.LJJStudios.cabinetproject.Item.foods.PickledCucumber::new);
    public static final RegistryObject<Item> Laoganma = ITEMS.register("laoganma" , com.LJJStudios.cabinetproject.Item.foods.Laoganma::new);
    public static final RegistryObject<Item> ChiveFlower = ITEMS.register("chive_flower" , com.LJJStudios.cabinetproject.Item.foods.ChiveFlower::new);
    public static final RegistryObject<Item> FermentedBeanCurd = ITEMS.register("fermented_bean_curd" , com.LJJStudios.cabinetproject.Item.foods.FermentedBeanCurd::new);
    public static final RegistryObject<Item> BurgerEmbryo = ITEMS.register("burger_embryo" , com.LJJStudios.cabinetproject.Item.foods.BurgerEmbryo::new);
    public static final RegistryObject<Item> Bread = ITEMS.register("bread" , com.LJJStudios.cabinetproject.Item.foods.Bread::new);
    public static final RegistryObject<Item> Toufu = ITEMS.register("toufu" , com.LJJStudios.cabinetproject.Item.foods.Toufu::new);
    public static final RegistryObject<Item> WrongWatermelon = ITEMS.register("wrong_watermelon" , com.LJJStudios.cabinetproject.Item.foods.WrongWatermelon::new);

    public static final RegistryObject<Item> Bean = ITEMS.register("bean" , com.LJJStudios.cabinetproject.Item.foods.plant.Bean::new);
    public static final RegistryObject<Item> Tomato = ITEMS.register("tomato" , com.LJJStudios.cabinetproject.Item.foods.plant.Tomato::new);
    public static final RegistryObject<Item> ChineseChives = ITEMS.register("chinese_chives" , com.LJJStudios.cabinetproject.Item.foods.plant.ChineseChives::new);
    public static final RegistryObject<Item> SweetPotato = ITEMS.register("sweet_potato" , com.LJJStudios.cabinetproject.Item.foods.plant.SweetPotato::new);
    public static final RegistryObject<Item> Cucumber = ITEMS.register("cucumber" , com.LJJStudios.cabinetproject.Item.foods.plant.Cucumber::new);
    public static final RegistryObject<Item> Lemon = ITEMS.register("lemon" , com.LJJStudios.cabinetproject.Item.foods.plant.Lemon::new);
    public static final RegistryObject<Item> Ginger = ITEMS.register("ginger" , com.LJJStudios.cabinetproject.Item.foods.plant.Ginger::new);

    public static final RegistryObject<Item> WheatBeer = ITEMS.register("wheat_beer" , com.LJJStudios.cabinetproject.Item.foods.drinks.alcohol.WheatBeer::new);
    public static final RegistryObject<Item> ChineseLiquor = ITEMS.register("chinese_liquor" , com.LJJStudios.cabinetproject.Item.foods.drinks.alcohol.ChineseLiquor::new);
    public static final RegistryObject<Item> Whisky = ITEMS.register("whisky" , com.LJJStudios.cabinetproject.Item.foods.drinks.alcohol.Whisky::new);
    public static final RegistryObject<Item> BirdieVodka = ITEMS.register("birdie_vodka" , com.LJJStudios.cabinetproject.Item.foods.drinks.alcohol.vodka.BirdieVodka::new);
    public static final RegistryObject<Item> CatLampVodka = ITEMS.register("cat_lamp_vodka" , com.LJJStudios.cabinetproject.Item.foods.drinks.alcohol.vodka.CatLampVodka::new);
    public static final RegistryObject<Item> DeepWellVodka = ITEMS.register("deep_well_vodka" , com.LJJStudios.cabinetproject.Item.foods.drinks.alcohol.vodka.DeepWellVodka::new);
    public static final RegistryObject<Item> Kvass = ITEMS.register("kvass" , com.LJJStudios.cabinetproject.Item.foods.drinks.Kvass::new);
    public static final RegistryObject<Item> Pepsi = ITEMS.register("pepsi" , com.LJJStudios.cabinetproject.Item.foods.drinks.Pepsi::new);
    public static final RegistryObject<Item> Coca = ITEMS.register("coca" , com.LJJStudios.cabinetproject.Item.foods.drinks.Coca::new);

    public static final RegistryObject<Item> Flour = ITEMS.register("flour" , com.LJJStudios.cabinetproject.Item.foods.material.Flour::new);
    public static final RegistryObject<Item> EggLiquid = ITEMS.register("egg_liquid" , com.LJJStudios.cabinetproject.Item.foods.material.EggLiquid::new);
    public static final RegistryObject<Item> MilkPowder = ITEMS.register("milk_powder" , com.LJJStudios.cabinetproject.Item.foods.material.MilkPowder::new);
    public static final RegistryObject<Item> GranulatedSugar = ITEMS.register("granulated_sugar" , com.LJJStudios.cabinetproject.Item.foods.material.GranulatedSugar::new);
    public static final RegistryObject<Item> Salt = ITEMS.register("salt" , com.LJJStudios.cabinetproject.Item.foods.material.Salt::new);
    public static final RegistryObject<Item> Butter = ITEMS.register("butter" , com.LJJStudios.cabinetproject.Item.foods.material.Butter::new);

    public static final RegistryObject<Item> Spoon = ITEMS.register("spoon" , com.LJJStudios.cabinetproject.Item.foods.item.Spoon::new);
    public static final RegistryObject<Item> Chopsticks = ITEMS.register("chopsticks", com.LJJStudios.cabinetproject.Item.foods.item.Chopsticks::new);
    public static final RegistryObject<Item> Fork = ITEMS.register("fork", com.LJJStudios.cabinetproject.Item.foods.item.Fork::new);
    public static final RegistryObject<Item> TableKnife = ITEMS.register("table_knife", com.LJJStudios.cabinetproject.Item.foods.item.TableKnife::new);

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