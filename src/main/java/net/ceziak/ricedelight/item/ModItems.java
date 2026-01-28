package net.ceziak.ricedelight.item;

import net.ceziak.ricedelight.RiceDelight;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, RiceDelight.MOD_ID);

    public static final RegistryObject<Item> BELL_PEPPER = ITEMS.register("bell_pepper",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BELL_PEPPER_CHUNK = ITEMS.register("bell_pepper_chunk",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> APPLE_CINNAMON_RICE = ITEMS.register("apple_cinnamon_rice",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BASIL_LEAF = ITEMS.register("basil_leaf",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}