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

    public static final RegistryObject<Item> BELL_PEPPER = ITEMS.register("bell_pepper",
            () -> new Item(new Item.Properties().food(ModFoods.BELL_PEPPER)));
    public static final RegistryObject<Item> BELL_PEPPER_CHUNK = ITEMS.register("bell_pepper_chunk",
            () -> new Item(new Item.Properties().food(ModFoods.BELL_PEPPER_CHUNK)));
    public static final RegistryObject<Item> APPLE_CINNAMON_RICE = ITEMS.register("apple_cinnamon_rice",
            () -> new Item(new Item.Properties().food(ModFoods.APPLE_CINNAMON_RICE)));
    public static final RegistryObject<Item> BASIL_LEAF = ITEMS.register("basil_leaf",
            () -> new Item(new Item.Properties().food(ModFoods.BASIL_LEAF)));
    public static final RegistryObject<Item> ROLLING_PIN = ITEMS.register("pin",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> RAW_WRAP = ITEMS.register("raw_wrap",
            () -> new Item(new Item.Properties().food(ModFoods.RAW_WRAP)));

    public static final RegistryObject<Item> BELL_PEPPER_SEEDS = ITEMS.register("bell_pepper_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BELL_PEPPER_CROP.get(), new Item.Properties()));
    public static final RegistryObject<Item> BASIL_SEEDS = ITEMS.register("basil_seeds",
            () -> new ItemNameBlockItem(ModBlocks.BASIL_CROP.get(), new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}