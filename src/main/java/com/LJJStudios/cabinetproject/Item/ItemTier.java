package com.LJJStudios.cabinetproject.Item;

import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;

public enum ItemTier implements IItemTier {
    CABINET(3,2000,10.0f,4.0f,30);
    private final int LevelIn;
    private final int UserIn;
    private final float SpeedIn;
    private final float AttackDamageBonusIn;
    private final int EnchantmentValueIn;


    ItemTier(int LevelIn, int UsersIn,float SpeedIn, float AttackDamageBonusIn, int EnchantmentValueIn) {
        this.LevelIn = LevelIn;
        this.UserIn = UsersIn;
        this.SpeedIn = SpeedIn;
        this.AttackDamageBonusIn = AttackDamageBonusIn;
        this.EnchantmentValueIn = EnchantmentValueIn;
    }

    @Override
    public int getUses() {
        return UserIn;
    }

    @Override
    public float getSpeed() {
        return SpeedIn;
    }

    @Override
    public float getAttackDamageBonus() {
        return AttackDamageBonusIn;
    }

    @Override
    public int getLevel() {
        return LevelIn;
    }

    @Override
    public int getEnchantmentValue() {
        return EnchantmentValueIn;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return null;
    }
}