package net.ceziak.ricedelight.item;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RiceDelight.MOD_ID);

    // bell pepper
    public static final RegistryObject<Item> BELL_PEPPER = ITEMS.register("bell_pepper",
            () -> new Item(new Item.Properties().food(ModFoods.BELL_PEPPER)));
    public static final RegistryObject<Item> BELL_PEPPER_CHUNK = ITEMS.register("bell_pepper_chunk",
            () -> new Item(new Item.Properties().food(ModFoods.BELL_PEPPER_CHUNK)));
    public static final RegistryObject<Item> BELL_PEPPER_SEEDS = ITEMS.register("bell_pepper_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BELL_PEPPER_CROP.get(), new Item.Properties()));

    public static final RegistryObject<Item> CINNAMON = ITEMS.register("cinnamon",
            () -> new Item(new Item.Properties().food(ModFoods.CINNAMON)));
    public static final RegistryObject<Item> APPLE_CINNAMON_RICE = ITEMS.register("apple_cinnamon_rice",
            () -> new Item(new Item.Properties().food(ModFoods.APPLE_CINNAMON_RICE)));
    public static final RegistryObject<Item> RISOTTO = ITEMS.register("risotto",
            () -> new Item(new Item.Properties().food(ModFoods.RISOTTO)));
    public static final RegistryObject<Item> JOLLOF_RICE = ITEMS.register("jollof_rice",
            () -> new Item(new Item.Properties().food(ModFoods.JOLLOF_RICE)));
    public static final RegistryObject<Item> STUFFED_BELL_PEPPER = ITEMS.register("stuffed_bell_pepper",
            () -> new Item(new Item.Properties().food(ModFoods.STUFFED_BELL_PEPPER)));

    public static final RegistryObject<Item> OMELETTE = ITEMS.register("omelette",
            () -> new Item(new Item.Properties().food(ModFoods.RISOTTO)));
    public static final RegistryObject<Item> OMURICE = ITEMS.register("omurice",
            () -> new Item(new Item.Properties().food(ModFoods.JOLLOF_RICE)));
    public static final RegistryObject<Item> OMELETTE_ROLL = ITEMS.register("omelette_roll",
            () -> new Item(new Item.Properties().food(ModFoods.STUFFED_BELL_PEPPER)));

    public static final RegistryObject<Item> EGG_BACON_BURRITO = ITEMS.register("egg_bacon_b",
            () -> new Item(new Item.Properties().food(ModFoods.EGG_BACON_BURRITO)));
    public static final RegistryObject<Item> HALF_EGG_BACON_BURRITO = ITEMS.register("half_egg_bacon_b",
            () -> new Item(new Item.Properties().food(ModFoods.HALF_EGG_BACON_BURRITO)));
    public static final RegistryObject<Item> FRIED_RICE_VEGGIE_BURRITO = ITEMS.register("fried_rice_veggie_b",
            () -> new Item(new Item.Properties().food(ModFoods.FRIED_RICE_VEGGIE_BURRITO)));
    public static final RegistryObject<Item> HALF_FRIED_RICE_VEGGIE_BURRITO = ITEMS.register("half_fried_rice_veggie_b",
            () -> new Item(new Item.Properties().food(ModFoods.HALF_FRIED_RICE_VEGGIE_BURRITO)));
    public static final RegistryObject<Item> VEGGIE_BURRITO = ITEMS.register("veggie_b",
            () -> new Item(new Item.Properties().food(ModFoods.VEGGIE_BURRITO)));
    public static final RegistryObject<Item> HALF_VEGGIE_BURRITO = ITEMS.register("half_veggie_b",
            () -> new Item(new Item.Properties().food(ModFoods.HALF_VEGGIE_BURRITO)));
    public static final RegistryObject<Item> CHICKEN_VEGGIE_BURRITO = ITEMS.register("chicken_veggie_b",
            () -> new Item(new Item.Properties().food(ModFoods.CHICKEN_VEGGIE_BURRITO)));
    public static final RegistryObject<Item> HALF_CHICKEN_VEGGIE_BURRITO = ITEMS.register("half_chicken_veggie_b",
            () -> new Item(new Item.Properties().food(ModFoods.HALF_CHICKEN_VEGGIE_BURRITO)));
    public static final RegistryObject<Item> BEEF_CABBAGE_BURRITO = ITEMS.register("beef_cabbage_b",
            () -> new Item(new Item.Properties().food(ModFoods.BEEF_CABBAGE_BURRITO)));
    public static final RegistryObject<Item> HALF_BEEF_CABBAGE_BURRITO = ITEMS.register("half_beef_cabbage_b",
            () -> new Item(new Item.Properties().food(ModFoods.HALF_BEEF_CABBAGE_BURRITO)));
    public static final RegistryObject<Item> BEEF_TOMATO_BURRITO = ITEMS.register("beef_tomato_b",
            () -> new Item(new Item.Properties().food(ModFoods.BEEF_TOMATO_BURRITO)));
    public static final RegistryObject<Item> HALF_BEEF_TOMATO_BURRITO = ITEMS.register("half_beef_tomato_b",
            () -> new Item(new Item.Properties().food(ModFoods.HALF_BEEF_TOMATO_BURRITO)));
    public static final RegistryObject<Item> BURNT_BURRITO = ITEMS.register("burnt_b",
            () -> new Item(new Item.Properties().food(ModFoods.BURNT_BURRITO)));
    public static final RegistryObject<Item> HALF_BURNT_BURRITO = ITEMS.register("half_burnt_b",
            () -> new Item(new Item.Properties().food(ModFoods.HALF_BEEF_TOMATO_BURRITO)));

    public static final RegistryObject<Item> ROLLING_PIN = ITEMS.register("pin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> WOODEN_HAMMER = ITEMS.register("hammer",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_WRAP = ITEMS.register("raw_wrap",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_WRAP)));
    public static final RegistryObject<Item> COOKED_WRAP = ITEMS.register("cooked_wrap",
            () -> new Item(new Item.Properties().food(ModFoods.COOKED_WRAP)));
    public static final RegistryObject<Item> BURNT_WRAP = ITEMS.register("burnt_wrap",
            () -> new Item(new Item.Properties().food(ModFoods.BURNT_WRAP)));

    public static final RegistryObject<Item> BASIL_LEAF = ITEMS.register("basil_leaf",
            () -> new Item(new Item.Properties().food(ModFoods.BASIL_LEAF)));
    public static final RegistryObject<Item> BASIL_SEEDS = ITEMS.register("basil_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BASIL_CROP.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}