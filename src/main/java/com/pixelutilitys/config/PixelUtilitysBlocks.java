package com.pixelutilitys.config;

import com.pixelutilitys.Basemod;
import com.pixelutilitys.blocks.*;
import com.pixelutilitys.creativetabs.PixelUtilitysCreativeTabs;
import com.pixelutilitys.blocks.ores.*;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PixelUtilitysBlocks {

    //Blocks
    public static Block NewGrassBlock;
    public static Block PokeDirtBlock;
    public static Block PokeSandBlock;
    public static Block PokeSandC1Block;
    public static Block PokeSandC2Block;
    public static Block PokeSandC3Block;
    public static Block PokeSandC4Block;
    public static Block InsideMoldingBlock;
    public static Block PixelmonGrassBlock;
    public static Block ShinglesBlock;
    public static Block ShinglesCorner1Block;
    public static Block ShinglesCorner2Block;
    public static Block TreeTopBlock;
    public static Block TreeBottomBlock;
    public static Block PokeSandSide1Block;
    public static Block PokeSandSide2Block;
    public static Block PokeSandSide3Block;
    public static Block PokeSandSide4Block;
    public static Block Window1Block;
    public static Block Window2Block;
    public static Block WoodenFlooringBlock;
    public static Block PokeCenterSignBlock;
    public static Block PokeMartSignBlock;
    public static Block SandyGrassBlock;
    public static Block RockBlock;
    public static Block CaveRockBlock;
    public static Block BridgeBlockBlock;
    public static Block TreeBlock;
    public static Block BolderBlock;
    public static Block BoxBlock;
    public static Block RubyOre;
    public static Block SaphireOre;
    public static Block AmethystOre;
    public static Block CrystalOre;
    public static Block RubyBlock;
    public static Block SaphireBlock;
    public static Block AmethystBlock;
    public static Block CrystalBlock;
    public static Block SiliconOre;
    public static Block ClothedTableBlock;
    public static Block PokeballBlock;
    public static Block RedCusionChairBlock;
    public static Block TrashcanBlock;
    public static Block YellowCusionChairBlock;
    //public static Block BasicDeskBlock;
    public static Block TotodilePokedollBlock;
    public static Block AronPokedollBlock;
    public static Block BisharpPokedollBlock;
    public static Block RadioBlock;
    public static Block GymSignBlock;
    public static Block TVBlock;
    public static Block BlockConveyor;
    public static Block BlueRugBlock;
    public static Block RedRugBlock;
    public static Block GreenRugBlock;
    public static Block PokeballStatue;


    //lights
    public static Block blueLightBlock;
    public static Block redLightBlock;
    public static Block purpleLightBlock;
    public static Block yellowLightBlock;
    public static Block orangeLightBlock;
    public static Block whiteLightBlock;
    public static Block greenLightBlock;

    public static List<Block> LightBlockList = new ArrayList<>();


    public static void load(Configuration cfg) {
        NewGrassBlock = new PUBlock(Material.grass, "PokeGrass", 4.0F, PixelUtilitysCreativeTabs.tabPixelmonBlocks, Block.soundTypeGrass);
        PokeDirtBlock = new PokeDirtBlock().setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("PokeDirt").setBlockTextureName("PixelUtilitys" + ":" + "PokeDirt").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks);
        PokeSandBlock = new PokeSandBlock().setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSand").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "pokesand");
        PokeSandC1Block = new PokeSandC1Block().setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandCorner1").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandC1");
        PokeSandC2Block = new PokeSandC2Block().setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandCorner2").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandC2");
        PokeSandC3Block = new PokeSandC3Block().setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandCorner3").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandC3");
        PokeSandC4Block = new PokeSandC4Block().setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandCorner4").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandC4");
        InsideMoldingBlock = new InsideMoldingBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Inside Wall Molding").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "InsideMolding");
        if (Basemod.pixelmonPresent)
            PixelmonGrassBlock = new PixelmonGrassBlock().setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("Pixelmon Grass").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PixelmonGrass");
        ShinglesBlock = new ShinglesBlock().setHardness(0.5f).setStepSound(Block.soundTypeStone).setBlockName("Shingles").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "Shingles");
        ShinglesCorner1Block = new ShinglesCorner1Block().setHardness(0.5f).setStepSound(Block.soundTypeStone).setBlockName("Shingles Corner 1").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "RoofCorner1");
        ShinglesCorner2Block = new ShinglesCorner2Block().setHardness(0.5f).setStepSound(Block.soundTypeStone).setBlockName("Shingles Corner 2").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "RoofCorner2");
        TreeTopBlock = new TreeTopBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Tree Top").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "TreeTop");
        TreeBottomBlock = new TreeBottomBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Tree Bottom").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "TreeBottom");
        PokeSandSide1Block = new PokeSandSide1Block().setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandSide1").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandSide1");
        PokeSandSide2Block = new PokeSandSide2Block().setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandSide2").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandSide2");
        PokeSandSide3Block = new PokeSandSide3Block().setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandSide3").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandSide3");
        PokeSandSide4Block = new PokeSandSide4Block().setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandSide4").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandSide4");
        Window1Block = new Window1Block().setHardness(0.5f).setStepSound(Block.soundTypeGlass).setBlockName("Window1").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "Window");
        Window2Block = new Window2Block().setHardness(0.5f).setStepSound(Block.soundTypeGlass).setBlockName("Window2").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "Window2");
        WoodenFlooringBlock = new WoodenFlooringBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("WoodenFlooring").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "WoodenFlooring");
        PokeCenterSignBlock = new PokeCenterSignBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("PokeCenterSign").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "Pokecenter");
        PokeMartSignBlock = new PokeMartSignBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("PokeMartSign").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokemartSign");
        SandyGrassBlock = new SandyGrassBlock().setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("SandyGrass").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "SandyGrass");
        RockBlock = new RockBlock().setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("Rock").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "Rock");
        CaveRockBlock = new CaveRockBlock().setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("CabeRock").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "CaveRock");
        BridgeBlockBlock = new BridgeBlockBlock().setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("BridgeBlock").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "BridgeBlock");
        TreeBlock = new TreeBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Tree").setBlockTextureName("pixelutilitys:Tree").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks);
        BolderBlock = new BolderBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Bolder").setBlockTextureName("pixelutilitys:Bolder").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks);
        BoxBlock = new BoxBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Box");
        RubyOre = new RubyOre().setHardness(1.5f).setStepSound(Block.soundTypeStone).setBlockName("RubyOre").setBlockTextureName("pixelutilitys:RubyOre");
        SaphireOre = new SaphireOre().setHardness(1.5f).setStepSound(Block.soundTypeStone).setBlockName("SaphireOre").setBlockTextureName("pixelutilitys:SaphireOre");
        AmethystOre = new AmethystOre().setHardness(1.5f).setStepSound(Block.soundTypeStone).setBlockName("AmethystOre").setBlockTextureName("pixelutilitys:AmethystOre");
        CrystalOre = new CrystalOre().setHardness(1.5f).setStepSound(Block.soundTypeStone).setBlockName("CrystalOre").setBlockTextureName("pixelutilitys:CrystalOre");
        RubyBlock = new RubyBlock().setHardness(8.5f).setStepSound(Block.soundTypeMetal).setBlockName("RubyBlock").setBlockTextureName("pixelutilitys:RubyBlock").setCreativeTab(CreativeTabs.tabBlock);
        SaphireBlock = new SaphireBlock().setHardness(8.5f).setStepSound(Block.soundTypeMetal).setBlockName("SaphireBlock").setBlockTextureName("pixelutilitys:SaphireBlock").setCreativeTab(CreativeTabs.tabBlock);
        AmethystBlock = new AmethystBlock().setHardness(8.5f).setStepSound(Block.soundTypeMetal).setBlockName("AmethystBlock").setBlockTextureName("pixelutilitys:AmethystBlock").setCreativeTab(CreativeTabs.tabBlock);
        CrystalBlock = new CrystalBlock().setHardness(8.5f).setStepSound(Block.soundTypeMetal).setBlockName("CrystalBlock").setBlockTextureName("pixelutilitys:CrystalBlock").setCreativeTab(CreativeTabs.tabBlock);
        SiliconOre = new SiliconOre().setHardness(1.2f).setStepSound(Block.soundTypeMetal).setBlockName("SiliconOre").setBlockTextureName("pixelutilitys:SiliconOre").setCreativeTab(CreativeTabs.tabBlock);
        ClothedTableBlock = new ClothedTableBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("ClothedTable").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        if (Basemod.pixelmonPresent)
            PokeballBlock = new PokeballBlock().setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("Pokeball").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        RedCusionChairBlock = new RedCusionChairBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("RedCusionChair").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        TrashcanBlock = new TrashcanBlock().setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("Trashcan").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        YellowCusionChairBlock = new YellowCusionChairBlock().setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("YellowCusionChair").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        TotodilePokedollBlock = new TotodilePokedollBlock().setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("TotodileDoll").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        AronPokedollBlock = new AronPokedollBlock().setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("AronDoll").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        BisharpPokedollBlock = new BisharpPokedollBlock().setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("BisharpDoll");
        RadioBlock = new RadioBlock();
        GymSignBlock = new com.pixelutilitys.blocks.GymSignBlock().setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("GymSign").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        TVBlock = new com.pixelutilitys.blocks.TVBlock().setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("TV").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        BlockConveyor = new BlockConveyor();
        BlueRugBlock = new com.pixelutilitys.blocks.RugBlock("blue").setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("BlueRug").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        RedRugBlock = new com.pixelutilitys.blocks.RugBlock("red").setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("RedRug").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        GreenRugBlock = new com.pixelutilitys.blocks.RugBlock("green").setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("GreenRug").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);
        if (Basemod.pixelmonPresent)
            PokeballStatue = new PokeballStatueBlock().setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture).setBlockName("PokeballStatue");

        //lights
        blueLightBlock = new LightBlock("Blue", Color.BLUE);
        redLightBlock = new LightBlock("Red", Color.RED);
        purpleLightBlock = new LightBlock("Purple", Color.MAGENTA);
        yellowLightBlock = new LightBlock("Yellow", Color.YELLOW);
        orangeLightBlock = new LightBlock("Orange", Color.ORANGE);
        greenLightBlock = new LightBlock("Green", Color.GREEN);
        whiteLightBlock = new LightBlock("White", Color.WHITE);

    }

    public static void addNames() {

        GameRegistry.registerBlock(NewGrassBlock, "PokeGrass");
        GameRegistry.registerBlock(PokeSandBlock, "PokeSand");
        GameRegistry.registerBlock(PokeSandC1Block, "PokeSandCorner1");
        GameRegistry.registerBlock(PokeSandC2Block, "PokeSandCorner2");
        GameRegistry.registerBlock(PokeSandC3Block, "PokeSandCorner3");
        GameRegistry.registerBlock(PokeSandC4Block, "PokeSandCorner4");
        GameRegistry.registerBlock(PokeDirtBlock, "PokeDirt");
        GameRegistry.registerBlock(InsideMoldingBlock, "Inside Wall Molding");
        if (Basemod.pixelmonPresent)
            GameRegistry.registerBlock(PixelmonGrassBlock, "Pixelmon Grass");
        GameRegistry.registerBlock(ShinglesCorner2Block, "Shingles Corner 2");
        GameRegistry.registerBlock(ShinglesBlock, "Shingles");
        GameRegistry.registerBlock(ShinglesCorner1Block, "Shingles Corner 1");
        GameRegistry.registerBlock(TreeTopBlock, "Tree Top");
        GameRegistry.registerBlock(TreeBottomBlock, "Tree Bottom");
        GameRegistry.registerBlock(PokeSandSide1Block, "PokeSand Side 1");
        GameRegistry.registerBlock(PokeSandSide2Block, "PokeSand Side 2");
        GameRegistry.registerBlock(PokeSandSide3Block, "PokeSand Side 3");
        GameRegistry.registerBlock(PokeSandSide4Block, "PokeSand Side 4");
        GameRegistry.registerBlock(Window1Block, "Window 1");
        GameRegistry.registerBlock(Window2Block, "Window 2");
        GameRegistry.registerBlock(WoodenFlooringBlock, "Wooden Flooring");
        GameRegistry.registerBlock(PokeCenterSignBlock, "PokeCenter Sign");
        GameRegistry.registerBlock(PokeMartSignBlock, "PokeMart Sign");
        GameRegistry.registerBlock(SandyGrassBlock, "Sandy Grass");
        GameRegistry.registerBlock(RockBlock, "Rock");
        GameRegistry.registerBlock(CaveRockBlock, "Cave Rock");
        GameRegistry.registerBlock(BridgeBlockBlock, "Bridge");
        GameRegistry.registerBlock(RubyBlock, "RubyBlock");
        GameRegistry.registerBlock(SaphireBlock, "SaphireBlock");
        GameRegistry.registerBlock(AmethystBlock, "AmethystBlock");
        GameRegistry.registerBlock(CrystalBlock, "CrystalBlock");
        GameRegistry.registerBlock(TreeBlock, "Tree");
        GameRegistry.registerBlock(BolderBlock, "Bolder");
        GameRegistry.registerBlock(BoxBlock, "Box");
        GameRegistry.registerBlock(ClothedTableBlock, "ClothedTable");
        if (Basemod.pixelmonPresent)
            GameRegistry.registerBlock(PokeballBlock, "Pokeball");
        GameRegistry.registerBlock(RedCusionChairBlock, "RedCusionChair");
        GameRegistry.registerBlock(TrashcanBlock, "Trashcan");
        GameRegistry.registerBlock(YellowCusionChairBlock, "YellowCusionChair");
        GameRegistry.registerBlock(SiliconOre, "SiliconOre");
        GameRegistry.registerBlock(RubyOre, "RubyOre");
        GameRegistry.registerBlock(SaphireOre, "SaphireOre");
        GameRegistry.registerBlock(AmethystOre, "AmethystOre");
        GameRegistry.registerBlock(CrystalOre, "CrystalOre");
        GameRegistry.registerBlock(TotodilePokedollBlock, "TotodileDoll");
        GameRegistry.registerBlock(AronPokedollBlock, "AronDoll");
        //GameRegistry.registerBlock(BisharpPokedollBlock, "BisharpDoll");
        GameRegistry.registerBlock(RadioBlock, "Radio");
        GameRegistry.registerBlock(GymSignBlock, "GymSign");
        GameRegistry.registerBlock(TVBlock, "TV");
        GameRegistry.registerBlock(BlockConveyor, "Conveyor");
        GameRegistry.registerBlock(BlueRugBlock, "BlueRug");
        GameRegistry.registerBlock(RedRugBlock, "RedRug");
        GameRegistry.registerBlock(GreenRugBlock, "GreenRug");
        if (Basemod.pixelmonPresent)
            GameRegistry.registerBlock(PokeballStatue, "PokeballStatue");


        //lights
        GameRegistry.registerBlock(blueLightBlock, "BlueLight");
        GameRegistry.registerBlock(redLightBlock, "RedLight");
        GameRegistry.registerBlock(purpleLightBlock, "PurpleLight");
        GameRegistry.registerBlock(yellowLightBlock, "YellowLight");
        GameRegistry.registerBlock(orangeLightBlock, "OrangeLight");
        GameRegistry.registerBlock(whiteLightBlock, "WhiteLight");
        GameRegistry.registerBlock(greenLightBlock, "GreenLight");

    }

}