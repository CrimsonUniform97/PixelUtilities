package com.pixelutilitys.items.economy;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PokeCoin1Item extends Item {

    public PokeCoin1Item() {
        super();

        // Constructor Configuration
        maxStackSize = 64;
        setCreativeTab(CreativeTabs.tabMisc);
        setTextureName("PixelUtilitys:coin1");
        setUnlocalizedName("pokecoin1");
    }
}