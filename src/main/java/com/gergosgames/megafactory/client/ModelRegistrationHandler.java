package com.gergosgames.megafactory.client;

import com.gergosgames.megafactory.Main;
import com.gergosgames.megafactory.content.item.*;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;

@EventBusSubscriber(value = Side.CLIENT, modid = Main.MODID)
public class ModelRegistrationHandler {

    //Arraylist of all items
    public static ArrayList<Item> items = new ArrayList<>();


    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {

        //Add all items to items arraylist
        items.add(research_tablet.itemBase.getItem());
        items.add(fire_sticks.itemBase.getItem());

        for (Item i : items)
        {   //For every item in items, register its model
            registerModel(i, 0);
        }
    }

    //Register models
    private static void registerModel(Item item, int meta) {
        ModelLoader.setCustomModelResourceLocation(item, meta,
                new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}