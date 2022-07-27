package com.gergosgames.megafactory;

import com.gergosgames.megafactory.content.item.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Main.MODID)
public final class RegistrationHandler {
    public static final Item RESEARCH_TABLET = new ResearchTablet("research_tablet");
    public static final Item FIRE_STICKS = new FireSticks("fire_sticks");

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(RESEARCH_TABLET, FIRE_STICKS);
    }
}