package net.ceziak.ricedelight.item;

import net.ceziak.ricedelight.RiceDelight;
import net.ceziak.ricedelight.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RiceDelight.MOD_ID);

    public static final RegistryObject<CreativeModeTab> RICE_DELIGHT = CREATIVE_MODE_TABS.register("rice_delight",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.APPLE_CINNAMON_RICE.get()))
                    .title(Component.translatable("creativetab.rice_delight"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BELL_PEPPER.get());
                        pOutput.accept(ModItems.BELL_PEPPER_CHUNK.get());
                        pOutput.accept(ModItems.APPLE_CINNAMON_RICE.get());
                        pOutput.accept(ModItems.BASIL_LEAF.get());
                        pOutput.accept(ModItems.ROLLING_PIN.get());
                        pOutput.accept(ModItems.RAW_WRAP.get());

                        pOutput.accept(ModItems.BELL_PEPPER_SEEDS.get());

                        pOutput.accept(ModBlocks.BASIL_CRATE.get());
                        pOutput.accept(ModBlocks.BELL_PEPPER_CRATE.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
