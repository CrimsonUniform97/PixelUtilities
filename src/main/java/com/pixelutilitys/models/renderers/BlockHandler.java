package com.pixelutilitys.models.renderers;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraftforge.common.config.Configuration;

public class BlockHandler {
    public static Block NewGrassBlock;
    public static Block PokeDirtBlock;

    public static void configureBlocks(Configuration config) {
    }

    public static void registerBlocks(GameRegistry registry) {//TODO -  is this used?
        GameRegistry.registerBlock(NewGrassBlock, "PokeGrass");
        GameRegistry.registerBlock(PokeDirtBlock, "PokeDirt");
    }

}
