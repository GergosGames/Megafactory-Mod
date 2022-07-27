package com.gergosgames.megafactory.content.item;

import com.gergosgames.megafactory.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class FireSticks extends Item
{
    public FireSticks(String name) {
        setUnlocalizedName(Main.MODID + "." + name);
        setRegistryName(Main.MODID, name);
        setCreativeTab(CreativeTabs.MISC);
        setMaxStackSize(64);
    }

}
