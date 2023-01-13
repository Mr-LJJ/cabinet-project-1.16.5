package com.LJJStudios.funnyfood.Item;

import com.LJJStudios.funnyfood.Utils;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemRegisty {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Utils.MOD_ID);
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
    public static final RegistryObject<Item> FrenchFries = ITEMS.register("french_fries" , com.LJJStudios.funnyfood.Item.foods.FrenchFries::new);

    public static final RegistryObject<Item> Bean = ITEMS.register("bean" , com.LJJStudios.funnyfood.Item.foods.plant.Bean::new);
    public static final RegistryObject<Item> Tomato = ITEMS.register("tomato" , com.LJJStudios.funnyfood.Item.foods.plant.Tomato::new);
    public static final RegistryObject<Item> ChineseChives = ITEMS.register("chinese_chives" , com.LJJStudios.funnyfood.Item.foods.plant.ChineseChives::new);
    public static final RegistryObject<Item> SweetPotato = ITEMS.register("sweet_potato" , com.LJJStudios.funnyfood.Item.foods.plant.SweetPotato::new);
    public static final RegistryObject<Item> Cucumber = ITEMS.register("cucumber" , com.LJJStudios.funnyfood.Item.foods.plant.Cucumber::new);
    public static final RegistryObject<Item> Lemon = ITEMS.register("lemon" , com.LJJStudios.funnyfood.Item.foods.plant.Lemon::new);
    public static final RegistryObject<Item> Ginger = ITEMS.register("ginger" , com.LJJStudios.funnyfood.Item.foods.plant.Ginger::new);
    public static final RegistryObject<Item> Garlic = ITEMS.register("garlic" , com.LJJStudios.funnyfood.Item.foods.plant.Garlic::new);
    public static final RegistryObject<Item> Chili = ITEMS.register("chili" , com.LJJStudios.funnyfood.Item.foods.plant.Chili::new);

    public static final RegistryObject<Item> WheatBeer = ITEMS.register("wheat_beer" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.WheatBeer::new);
    public static final RegistryObject<Item> ChineseLiquor = ITEMS.register("chinese_liquor" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.ChineseLiquor::new);
    public static final RegistryObject<Item> Whisky = ITEMS.register("whisky" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.Whisky::new);
    public static final RegistryObject<Item> BirdieVodka = ITEMS.register("birdie_vodka" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.vodka.BirdieVodka::new);
    public static final RegistryObject<Item> CatLampVodka = ITEMS.register("cat_lamp_vodka" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.vodka.CatLampVodka::new);
    public static final RegistryObject<Item> DeepWellVodka = ITEMS.register("deep_well_vodka" , com.LJJStudios.funnyfood.Item.foods.drinks.alcohol.vodka.DeepWellVodka::new);
    public static final RegistryObject<Item> Kvass = ITEMS.register("kvass" , com.LJJStudios.funnyfood.Item.foods.drinks.Kvass::new);
    public static final RegistryObject<Item> Pepsi = ITEMS.register("pepsi" , com.LJJStudios.funnyfood.Item.foods.drinks.Pepsi::new);
    public static final RegistryObject<Item> Coca = ITEMS.register("coca" , com.LJJStudios.funnyfood.Item.foods.drinks.Coca::new);
    public static final RegistryObject<Item> SodaWater = ITEMS.register("soda_water" , com.LJJStudios.funnyfood.Item.foods.drinks.SodaWater::new);

    public static final RegistryObject<Item> Flour = ITEMS.register("flour" , com.LJJStudios.funnyfood.Item.foods.material.Flour::new);
    public static final RegistryObject<Item> EggLiquid = ITEMS.register("egg_liquid" , com.LJJStudios.funnyfood.Item.foods.material.EggLiquid::new);
    public static final RegistryObject<Item> MilkPowder = ITEMS.register("milk_powder" , com.LJJStudios.funnyfood.Item.foods.material.MilkPowder::new);
    public static final RegistryObject<Item> GranulatedSugar = ITEMS.register("granulated_sugar" , com.LJJStudios.funnyfood.Item.foods.material.GranulatedSugar::new);
    public static final RegistryObject<Item> Salt = ITEMS.register("salt" , com.LJJStudios.funnyfood.Item.foods.material.Salt::new);
    public static final RegistryObject<Item> Butter = ITEMS.register("butter" , com.LJJStudios.funnyfood.Item.foods.material.Butter::new);
    public static final RegistryObject<Item> Soda = ITEMS.register("soda" , com.LJJStudios.funnyfood.Item.foods.material.Soda::new);

}