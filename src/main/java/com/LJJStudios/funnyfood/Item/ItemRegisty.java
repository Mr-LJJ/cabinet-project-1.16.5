package com.LJJStudios.funnyfood.Item;

import com.LJJStudios.funnyfood.Block.BlockRegistry;
import com.LJJStudios.funnyfood.Group.ModGroup;
import com.LJJStudios.funnyfood.Item.Item.ScrewNut;
import com.LJJStudios.funnyfood.Item.ingots.FuelItem;
import com.LJJStudios.funnyfood.Item.ingots.LeanCoal;
import com.LJJStudios.funnyfood.Utils;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegisty {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
    public static final RegistryObject<Item> WoodIngot = ITEMS.register("wood_ingot", com.LJJStudios.funnyfood.Item.ingots.WoodIngot::new);
    public static final RegistryObject<Item> ForgedIronIngot = ITEMS.register("forged_iron_ingot", com.LJJStudios.funnyfood.Item.ingots.ForgedIronIngot::new);
    public static final RegistryObject<Item> RustyIronIngot = ITEMS.register("rusty_iron_ingot", com.LJJStudios.funnyfood.Item.ingots.RustyIronIngot::new);
    public static final RegistryObject<Item> CopperIngot = ITEMS.register("copper_ingot" , com.LJJStudios.funnyfood.Item.ingots.CopperIngot::new);
    public static final RegistryObject<Item> PigIronIngot = ITEMS.register("pig_iron_ingot" , com.LJJStudios.funnyfood.Item.ingots.PigIronIngot::new);
    public static final RegistryObject<Item> StainlessSteelIngot = ITEMS.register("stainless_steel_ingot" , com.LJJStudios.funnyfood.Item.ingots.StainlessSteelIngot::new);
    public static final RegistryObject<Item> LeanCoal = ITEMS.register("lean_coal", () -> new LeanCoal(new Item.Properties().group(ModGroup.ITEM_GROUP), 3200));
    public static final RegistryObject<Item> FUEL = ITEMS.register("fuel", () -> new FuelItem(new Item.Properties().group(ModGroup.ITEM_GROUP), 3200));

    public static final RegistryObject<Item> CopperRod = ITEMS.register("copper_rod" , com.LJJStudios.funnyfood.Item.Item.CopperRod::new);
    public static final RegistryObject<Item> CopperScrew = ITEMS.register("copper_screw" , com.LJJStudios.funnyfood.Item.Item.CopperScrew::new);
    public static final RegistryObject<Item> ExpansionScrew = ITEMS.register("expansion_screw" , com.LJJStudios.funnyfood.Item.Item.ExpansionScrew::new);
    public static final RegistryObject<Item> IronScrew = ITEMS.register("iron_screw" , com.LJJStudios.funnyfood.Item.Item.IronScrew::new);
    public static final RegistryObject<Item> ScrewNut = ITEMS.register("screw_nut" , ScrewNut::new);
    public static final RegistryObject<Item> Stick = ITEMS.register("stick", com.LJJStudios.funnyfood.Item.Item.Stick::new);
    public static final RegistryObject<Item> IronRod = ITEMS.register("iron_rod", com.LJJStudios.funnyfood.Item.Item.IronRod::new);
    public static final RegistryObject<Item> Magnet = ITEMS.register("magnet" , com.LJJStudios.funnyfood.Item.Item.Magnet::new);

    public static final RegistryObject<Item> FunnyBlock = ITEMS.register("funny_block", () -> new BlockItem(BlockRegistry.FunnyBlock.get(), new Item.Properties().group(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> ForgedIronBlock = ITEMS.register("forged_iron_block", () -> new BlockItem(BlockRegistry.ForgedIronBlock.get(), new Item.Properties().group(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> RustyIronBlock = ITEMS.register("rusty_iron_block", () -> new BlockItem(BlockRegistry.RustyIronBlock.get(), new Item.Properties().group(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> Wood = ITEMS.register("wood", () -> new BlockItem(BlockRegistry.Wood.get(), new Item.Properties().group(ModGroup.ITEM_GROUP)));
    public static final RegistryObject<Item> Leaves = ITEMS.register("leaves", () -> new BlockItem(BlockRegistry.Leaves.get(), new Item.Properties().group(ModGroup.ITEM_GROUP)));

    public static final RegistryObject<Item> Bark = ITEMS.register("bark", com.LJJStudios.funnyfood.Item.foods.Bark::new);
    public static final RegistryObject<Item> Sawdust = ITEMS.register("sawdust", com.LJJStudios.funnyfood.Item.foods.Sawdust::new);
    public static final RegistryObject<Item> Moss = ITEMS.register("moss", com.LJJStudios.funnyfood.Item.foods.Moss::new);
    public static final RegistryObject<Item> PoisonApple = ITEMS.register("poison_apple", com.LJJStudios.funnyfood.Item.foods.PoisonApple::new);
    public static final RegistryObject<Item> Potato = ITEMS.register("potato" , com.LJJStudios.funnyfood.Item.foods.Potato::new);
    public static final RegistryObject<Item> CoalPowder = ITEMS.register("coal_powder", com.LJJStudios.funnyfood.Item.foods.CoalPowder::new);
    public static final RegistryObject<Item> PotatoUbi = ITEMS.register("potato_ubi", com.LJJStudios.funnyfood.Item.foods.PotatoUbi::new);
    public static final RegistryObject<Item> Hamburger = ITEMS.register("hamburger" , com.LJJStudios.funnyfood.Item.foods.Hamburger::new);
    public static final RegistryObject<Item> PotatoFloss = ITEMS.register("potato_floss" , com.LJJStudios.funnyfood.Item.foods.PotatoFloss::new);
    public static final RegistryObject<Item> RussianBread = ITEMS.register("russian_bread" , com.LJJStudios.funnyfood.Item.foods.RussianBread::new);
    public static final RegistryObject<Item> RussianSausage = ITEMS.register("russian_sausage" , com.LJJStudios.funnyfood.Item.foods.RussianSausage::new);
    public static final RegistryObject<Item> PickledCucumber = ITEMS.register("pickled_cucumber" , com.LJJStudios.funnyfood.Item.foods.PickledCucumber::new);
    public static final RegistryObject<Item> Laoganma = ITEMS.register("laoganma" , com.LJJStudios.funnyfood.Item.foods.Laoganma::new);
    public static final RegistryObject<Item> ChiveFlower = ITEMS.register("chive_flower" , com.LJJStudios.funnyfood.Item.foods.ChiveFlower::new);
    public static final RegistryObject<Item> FermentedBeanCurd = ITEMS.register("fermented_bean_curd" , com.LJJStudios.funnyfood.Item.foods.FermentedBeanCurd::new);
    public static final RegistryObject<Item> BurgerEmbryo = ITEMS.register("burger_embryo" , com.LJJStudios.funnyfood.Item.foods.BurgerEmbryo::new);
    public static final RegistryObject<Item> Bread = ITEMS.register("bread" , com.LJJStudios.funnyfood.Item.foods.Bread::new);
    public static final RegistryObject<Item> Toufu = ITEMS.register("toufu" , com.LJJStudios.funnyfood.Item.foods.Toufu::new);
    public static final RegistryObject<Item> WrongWatermelon = ITEMS.register("wrong_watermelon" , com.LJJStudios.funnyfood.Item.foods.WrongWatermelon::new);

    public static final RegistryObject<Item> Bean = ITEMS.register("bean" , com.LJJStudios.funnyfood.Item.foods.plant.Bean::new);
    public static final RegistryObject<Item> Tomato = ITEMS.register("tomato" , com.LJJStudios.funnyfood.Item.foods.plant.Tomato::new);
    public static final RegistryObject<Item> ChineseChives = ITEMS.register("chinese_chives" , com.LJJStudios.funnyfood.Item.foods.plant.ChineseChives::new);
    public static final RegistryObject<Item> SweetPotato = ITEMS.register("sweet_potato" , com.LJJStudios.funnyfood.Item.foods.plant.SweetPotato::new);
    public static final RegistryObject<Item> Cucumber = ITEMS.register("cucumber" , com.LJJStudios.funnyfood.Item.foods.plant.Cucumber::new);
    public static final RegistryObject<Item> Lemon = ITEMS.register("lemon" , com.LJJStudios.funnyfood.Item.foods.plant.Lemon::new);
    public static final RegistryObject<Item> Ginger = ITEMS.register("ginger" , com.LJJStudios.funnyfood.Item.foods.plant.Ginger::new);
    public static final RegistryObject<Item> Garlic = ITEMS.register("garlic" , com.LJJStudios.funnyfood.Item.foods.plant.Garlic::new);

    public static final RegistryObject<Item> WheatBeer = ITEMS.register("wheat_beer" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.WheatBeer::new);
    public static final RegistryObject<Item> ChineseLiquor = ITEMS.register("chinese_liquor" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.ChineseLiquor::new);
    public static final RegistryObject<Item> Whisky = ITEMS.register("whisky" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.Whisky::new);
    public static final RegistryObject<Item> BirdieVodka = ITEMS.register("birdie_vodka" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.vodka.BirdieVodka::new);
    public static final RegistryObject<Item> CatLampVodka = ITEMS.register("cat_lamp_vodka" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.vodka.CatLampVodka::new);
    public static final RegistryObject<Item> DeepWellVodka = ITEMS.register("deep_well_vodka" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.vodka.DeepWellVodka::new);
    public static final RegistryObject<Item> Kvass = ITEMS.register("kvass" , com.LJJStudios.funnyfood.Item.foods.drinks.Kvass::new);
    public static final RegistryObject<Item> Pepsi = ITEMS.register("pepsi" , com.LJJStudios.funnyfood.Item.foods.drinks.Pepsi::new);
    public static final RegistryObject<Item> Coca = ITEMS.register("coca" , com.LJJStudios.funnyfood.Item.foods.drinks.Coca::new);

    public static final RegistryObject<Item> Flour = ITEMS.register("flour" , com.LJJStudios.funnyfood.Item.foods.material.Flour::new);
    public static final RegistryObject<Item> EggLiquid = ITEMS.register("egg_liquid" , com.LJJStudios.funnyfood.Item.foods.material.EggLiquid::new);
    public static final RegistryObject<Item> MilkPowder = ITEMS.register("milk_powder" , com.LJJStudios.funnyfood.Item.foods.material.MilkPowder::new);
    public static final RegistryObject<Item> GranulatedSugar = ITEMS.register("granulated_sugar" , com.LJJStudios.funnyfood.Item.foods.material.GranulatedSugar::new);
    public static final RegistryObject<Item> Salt = ITEMS.register("salt" , com.LJJStudios.funnyfood.Item.foods.material.Salt::new);
    public static final RegistryObject<Item> Butter = ITEMS.register("butter" , com.LJJStudios.funnyfood.Item.foods.material.Butter::new);

    public static final RegistryObject<Item> Spoon = ITEMS.register("spoon" , com.LJJStudios.funnyfood.Item.foods.item.Spoon::new);
    public static final RegistryObject<Item> Chopsticks = ITEMS.register("chopsticks", com.LJJStudios.funnyfood.Item.foods.item.Chopsticks::new);
    public static final RegistryObject<Item> Fork = ITEMS.register("fork", com.LJJStudios.funnyfood.Item.foods.item.Fork::new);
    public static final RegistryObject<Item> TableKnife = ITEMS.register("table_knife", com.LJJStudios.funnyfood.Item.foods.item.TableKnife::new);
    public static final RegistryObject<Item> TinCan = ITEMS.register("tin_can" , com.LJJStudios.funnyfood.Item.foods.item.TinCan::new);
    public static final RegistryObject<Item> GlassBottle = ITEMS.register("glass_bottle" , com.LJJStudios.funnyfood.Item.foods.item.GlassBottle::new);
    public static final RegistryObject<Item> Bowl = ITEMS.register("bowl" , com.LJJStudios.funnyfood.Item.foods.item.Bowl::new);
    public static final RegistryObject<Item> Dish = ITEMS.register("dish" , com.LJJStudios.funnyfood.Item.foods.item.Dish::new);

    public static final RegistryObject<Item> SmallHammer = ITEMS.register("small_hammer", com.LJJStudios.funnyfood.Item.tools.SmallHammer::new);
    public static final RegistryObject<Item> IronSaw = ITEMS.register("iron_saw", com.LJJStudios.funnyfood.Item.tools.IronSaw::new);
    public static final RegistryObject<Item> ScrewDriver = ITEMS.register("screw_driver", com.LJJStudios.funnyfood.Item.tools.ScrewDriver::new);
    public static final RegistryObject<Item> Wrench = ITEMS.register("wrench", com.LJJStudios.funnyfood.Item.tools.Wrench::new);
    public static final RegistryObject<Item> Crowbar = ITEMS.register("crowbar", com.LJJStudios.funnyfood.Item.tools.Crowbar::new);
    public static final RegistryObject<Item> Pliers = ITEMS.register("pliers", com.LJJStudios.funnyfood.Item.tools.Pliers::new);
    public static final RegistryObject<Item> Scissors = ITEMS.register("scissors", com.LJJStudios.funnyfood.Item.tools.Scissors::new);
    public static final RegistryObject<Item> KitchenKnife = ITEMS.register("kitchen_knife", com.LJJStudios.funnyfood.Item.tools.KitchenKnife::new);
    public static final RegistryObject<Item> Knife = ITEMS.register("knife", com.LJJStudios.funnyfood.Item.tools.Knife::new);

}