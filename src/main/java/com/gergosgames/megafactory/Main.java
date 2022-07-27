package com.gergosgames.megafactory;

import com.gergosgames.megafactory.client.ModelRegistrationHandler;
import com.gergosgames.megafactory.content.item.research_tablet;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import net.minecraftforge.fml.common.Mod;

@Mod(modid = Main.MODID, name = Main.NAME, version = Main.VERSION, acceptedMinecraftVersions = Main.MC_VERSION)
public class Main
{
    public static final String MODID = "megafactory";
    public static final String NAME = "Megafactory";
    public static final String VERSION = "0.0.1";
    public static final String MC_VERSION = "[1.12.2]";


    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        research_tablet.init();
        ModelRegistrationHandler.registerModels(null);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
