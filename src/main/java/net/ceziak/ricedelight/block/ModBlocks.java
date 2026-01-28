package net.ceziak.ricedelight.block;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, RiceDelight.MOD_ID);

    public static final RegistryObject<Block> BASIL_CRATE = registerBlock("basil_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COMPOSTER).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BELL_PEPPER_CRATE = registerBlock("bell_pepper_crate",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COMPOSTER).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> BELL_PEPPER_CROP = BLOCKS.register("bell_pepper_crop",
            () -> new BellPepperCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));
    public static final RegistryObject<Block> BASIL_CROP = BLOCKS.register("basil_pepper_crop",
            () -> new BasilCropBlock(BlockBehaviour.Properties.copy(Blocks.WHEAT).noOcclusion().noCollission()));





    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}