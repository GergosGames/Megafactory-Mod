package com.gergosgames.megafactory.content.item;

import com.gergosgames.megafactory.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemBase extends Item{

    Item item;
    public ItemBase (CreativeTabs tab, int maxStackSize)
    {
        item = new Item();
        item.setCreativeTab(tab);
        item.setMaxStackSize(maxStackSize);
    }

    public Item getItem()
    {
        return item;
    }
}
