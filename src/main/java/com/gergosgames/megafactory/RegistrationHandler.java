package com.gergosgames.megafactory;

import com.gergosgames.megafactory.content.item.*;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.lang.reflect.Array;
import java.util.ArrayList;

@Mod.EventBusSubscriber(modid = Main.MODID)
public class RegistrationHandler {

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        final Item[] items = { //Array of all items. Setting registry name and unlocalized name
                research_tablet.itemBase.getItem().setRegistryName(Main.MODID, "research_tablet").setUnlocalizedName(Main.MODID + "." + "research_tablet"),
                fire_sticks.itemBase.getItem().setRegistryName(Main.MODID, "fire_sticks").setUnlocalizedName(Main.MODID + "." + "fire_sticks")
        };



        //Register all items in items array
        event.getRegistry().registerAll(items);
    }
    //Hello
}