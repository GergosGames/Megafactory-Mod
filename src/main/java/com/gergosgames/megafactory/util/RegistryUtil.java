package com.gergosgames.megafactory.util;

import com.gergosgames.megafactory.Main;
import net.minecraft.block.Block;
import net.minecraft.item.Item;

public class RegistryUtil {
    //Set item and block ids
    public static Item setItemName(final Item item, final String name) {
        item.setRegistryName(Main.MODID, name).setUnlocalizedName(Main.MODID + "." + name);
        return item;
    }

    public static Block setBlockName(final Block block, final String name) {
        block.setRegistryName(Main.MODID, name).setUnlocalizedName(Main.MODID + "." + name);
        return block;
    }

}