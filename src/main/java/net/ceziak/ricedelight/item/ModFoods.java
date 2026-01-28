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
    public static final FoodProperties BASIL_LEAF = new FoodProperties.Builder().nutrition(1).fast()
            .saturationMod(1f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 60), 0.75f).build();
    public static final FoodProperties RAW_WRAP = new FoodProperties.Builder().nutrition(3)
            .saturationMod(0.67f).build();
    public static final FoodProperties BELL_PEPPER_CHUNK = new FoodProperties.Builder().nutrition(1).fast()
            .saturationMod(1f).build();
    public static final FoodProperties APPLE_CINNAMON_RICE = new FoodProperties.Builder().nutrition(10)
            .saturationMod(0.8f).build();
}
