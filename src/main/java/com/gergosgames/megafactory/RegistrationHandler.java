package com.gergosgames.megafactory;

import com.gergosgames.megafactory.content.item.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Main.MODID)
public final class RegistrationHandler {
    public static final Item RESEARCH_TABLET = research_tablet.itemBase.getItem();
    public static final Item FIRE_STICKS = fire_sticks.itemBase.getItem();

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(RESEARCH_TABLET);
        event.getRegistry().register(FIRE_STICKS);
    }

    private static Item makeItem(final String name, final Supplier<Item> constructor, final Consumer<Item> config) {
        final Item item = constructor.get();
        config.accept(item);
        item.setUnlocalizedName(Main.MODID + "." + name);
        item.setRegistryName(Main.MODID, name);
        item.setMaxStackSize(1);
        return item;
    }
}