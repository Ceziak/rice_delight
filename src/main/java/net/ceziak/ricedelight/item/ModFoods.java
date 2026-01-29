package net.ceziak.ricedelight.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

import java.util.function.Supplier;

public class ModFoods {
    public static final FoodProperties BELL_PEPPER = new FoodProperties.Builder().nutrition(2)
            .saturationMod(0.5f).build();
    public static final FoodProperties BELL_PEPPER_CHUNK = new FoodProperties.Builder().nutrition(1).fast()
            .saturationMod(1f).build();

    public static final FoodProperties BASIL_LEAF = new FoodProperties.Builder().nutrition(1).fast()
            .saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60), 0.75f).build();

    public static final FoodProperties RAW_WRAP = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.67f).build();
    public static final FoodProperties COOKED_WRAP = new FoodProperties.Builder().nutrition(4)
            .saturationMod(0.5f).build();
    public static final FoodProperties BURNT_WRAP = new FoodProperties.Builder().nutrition(1)
            .saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.POISON, 100), 0.5f).build();
    public static final FoodProperties BURNT_BURRITO = new FoodProperties.Builder().nutrition(1)
            .saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.POISON, 100), 0.5f).build();
    public static final FoodProperties HALF_BURNT_BURRITO = new FoodProperties.Builder().nutrition(1)
            .saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.POISON, 100), 0.5f).build();

    public static final FoodProperties APPLE_CINNAMON_RICE = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.8f).build();
    public static final FoodProperties CINNAMON = new FoodProperties.Builder().nutrition(2)
            .saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.POISON, 100), 0.5f).build();

    public static final FoodProperties OMELETTE = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.5f).build();
    public static final FoodProperties OMURICE = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.8f).build();
    public static final FoodProperties OMELETTE_ROLL = new FoodProperties.Builder().nutrition(8)
            .saturationMod(0.8f).build();

    public static final FoodProperties EGG_BACON_BURRITO = new FoodProperties.Builder().nutrition(20)
            .saturationMod(1.5f).build();
    public static final FoodProperties HALF_EGG_BACON_BURRITO = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.8f).build();
    public static final FoodProperties FRIED_RICE_VEGGIE_BURRITO = new FoodProperties.Builder().nutrition(14)
            .saturationMod(1.5f).build();
    public static final FoodProperties HALF_FRIED_RICE_VEGGIE_BURRITO = new FoodProperties.Builder().nutrition(7)
            .saturationMod(0.8f).build();
    public static final FoodProperties VEGGIE_BURRITO = new FoodProperties.Builder().nutrition(13)
            .saturationMod(1.5f).build();
    public static final FoodProperties HALF_VEGGIE_BURRITO = new FoodProperties.Builder().nutrition(6)
            .saturationMod(0.8f).build();
    public static final FoodProperties BEEF_CABBAGE_BURRITO = new FoodProperties.Builder().nutrition(16)
            .saturationMod(1.5f).build();
    public static final FoodProperties HALF_BEEF_CABBAGE_BURRITO = new FoodProperties.Builder().nutrition(8)
            .saturationMod(0.8f).build();
    public static final FoodProperties CHICKEN_VEGGIE_BURRITO = new FoodProperties.Builder().nutrition(11)
            .saturationMod(1.5f).build();
    public static final FoodProperties HALF_CHICKEN_VEGGIE_BURRITO = new FoodProperties.Builder().nutrition(5)
            .saturationMod(0.8f).build();
    public static final FoodProperties BEEF_TOMATO_BURRITO = new FoodProperties.Builder().nutrition(16)
            .saturationMod(1.5f).build();
    public static final FoodProperties HALF_BEEF_TOMATO_BURRITO = new FoodProperties.Builder().nutrition(8)
            .saturationMod(0.8f).build();

    public static final FoodProperties RISOTTO = new FoodProperties.Builder().nutrition(12)
            .saturationMod(1.25f).build();
    public static final FoodProperties JOLLOF_RICE = new FoodProperties.Builder().nutrition(12)
            .saturationMod(1.25f).build();
    public static final FoodProperties STUFFED_BELL_PEPPER = new FoodProperties.Builder().nutrition(12)
            .saturationMod(1.25f).build();
}
