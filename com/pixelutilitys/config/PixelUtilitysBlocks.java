package com.pixelutilitys.config;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fluids.Fluid;

import com.pixelutilitys.blocks.*;
import com.pixelutilitys.creativetabs.PixelUtilitysCreativeTabs;
import com.pixelutilitys.ores.*;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

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


	public static void load(Configuration cfg){
		NewGrassBlock = new PokeGrassBlock(Material.grass).setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("PokeGrass").setBlockTextureName("PixelUtilitys" +":"+ "PokeGrass").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks);;
		PokeDirtBlock = new PokeDirtBlock(Material.grass).setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("PokeDirt").setBlockTextureName("PixelUtilitys" +":"+ "PokeDirt").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks);;
		PokeSandBlock = new PokeSandBlock(Material.sand).setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSand").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "pokesand");;
		PokeSandC1Block = new PokeSandC1Block(Material.sand).setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandCorner1").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "PokeSandC1");;
		PokeSandC2Block = new PokeSandC2Block(Material.sand).setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandCorner2").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "PokeSandC2");;
		PokeSandC3Block = new PokeSandC3Block(Material.sand).setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandCorner3").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "PokeSandC3");;
		PokeSandC4Block = new PokeSandC4Block(Material.sand).setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandCorner4").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "PokeSandC4");;
		InsideMoldingBlock = new InsideMoldingBlock(Material.wood).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Inside Wall Molding").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "InsideMolding");;
		PixelmonGrassBlock = new PixelmonGrassBlock(Material.grass).setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("Pixelmon Grass").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "PixelmonGrass");;
		ShinglesBlock = new ShinglesBlock(Material.rock).setHardness(0.5f).setStepSound(Block.soundTypeStone).setBlockName("Shingles").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "Shingles");;
		ShinglesCorner1Block = new ShinglesCorner1Block(Material.rock).setHardness(0.5f).setStepSound(Block.soundTypeStone).setBlockName("Shingles Corner 1").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "RoofCorner1");;
		ShinglesCorner2Block = new ShinglesCorner2Block(Material.rock).setHardness(0.5f).setStepSound(Block.soundTypeStone).setBlockName("Shingles Corner 2").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "RoofCorner2");;
		TreeTopBlock = new TreeTopBlock(Material.wood).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Tree Top").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "TreeTop");;
		TreeBottomBlock = new TreeBottomBlock(Material.wood).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Tree Bottom").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" +":"+ "TreeBottom");;
		PokeSandSide1Block = new PokeSandSide1Block(Material.sand).setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandSide1").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandSide1");;
		PokeSandSide2Block = new PokeSandSide2Block(Material.sand).setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandSide2").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandSide2");;
		PokeSandSide3Block = new PokeSandSide3Block(Material.sand).setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandSide3").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandSide3");;
		PokeSandSide4Block = new PokeSandSide4Block(Material.sand).setHardness(0.5f).setStepSound(Block.soundTypeSand).setBlockName("PokeSandSide4").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokeSandSide4");;
		Window1Block = new Window1Block(Material.glass).setHardness(0.5f).setStepSound(Block.soundTypeGlass).setBlockName("Window1").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "Window");;
		Window2Block = new Window2Block(Material.glass).setHardness(0.5f).setStepSound(Block.soundTypeGlass).setBlockName("Window2").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "Window2");;
		WoodenFlooringBlock = new WoodenFlooringBlock(Material.wood).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("WoodenFlooring").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "WoodenFlooring");;
		PokeCenterSignBlock = new PokeCenterSignBlock(Material.wood).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("PokeCenterSign").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "Pokecenter");;
		PokeMartSignBlock = new PokeMartSignBlock(Material.wood).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("PokeMartSign").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "PokemartSign");;
		SandyGrassBlock = new SandyGrassBlock(Material.grass).setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("SandyGrass").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "SandyGrass");;
		RockBlock = new RockBlock(Material.rock).setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("Rock").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "Rock");;
		CaveRockBlock = new CaveRockBlock(Material.rock).setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("CabeRock").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "CaveRock");;
		BridgeBlockBlock = new BridgeBlockBlock(Material.wood).setHardness(0.5f).setStepSound(Block.soundTypeGrass).setBlockName("BridgeBlock").setCreativeTab(PixelUtilitysCreativeTabs.tabPixelmonBlocks).setBlockTextureName("PixelUtilitys" + ":" + "BridgeBlock");;
		TreeBlock = new TreeBlock(Material.wood).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Tree").setBlockTextureName("pixelutilitys:Tree");;
		BolderBlock = new BolderBlock(Material.rock).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Bolder").setBlockTextureName("pixelutilitys:Bolder");;
		BoxBlock = new BoxBlock(Material.cloth).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("Box");;
		RubyOre = new RubyOre(Material.rock).setHardness(1.5f).setStepSound(Block.soundTypeStone).setBlockName("RubyOre").setBlockTextureName("pixelutilitys:RubyOre");;
		SaphireOre = new SaphireOre(Material.rock).setHardness(1.5f).setStepSound(Block.soundTypeStone).setBlockName("SaphireOre").setBlockTextureName("pixelutilitys:SaphireOre");;
		AmethystOre = new AmethystOre(Material.rock).setHardness(1.5f).setStepSound(Block.soundTypeStone).setBlockName("AmethystOre").setBlockTextureName("pixelutilitys:AmethystOre");;
		CrystalOre = new CrystalOre(Material.rock).setHardness(1.5f).setStepSound(Block.soundTypeStone).setBlockName("CrystalOre").setBlockTextureName("pixelutilitys:CrystalOre");
		RubyBlock = new RubyBlock(Material.rock).setHardness(8.5f).setStepSound(Block.soundTypeMetal).setBlockName("RubyBlock").setBlockTextureName("pixelutilitys:RubyBlock").setCreativeTab(CreativeTabs.tabBlock);;
		SaphireBlock = new SaphireBlock(Material.rock).setHardness(8.5f).setStepSound(Block.soundTypeMetal).setBlockName("SaphireBlock").setBlockTextureName("pixelutilitys:SaphireBlock").setCreativeTab(CreativeTabs.tabBlock);;
		AmethystBlock = new AmethystBlock(Material.rock).setHardness(8.5f).setStepSound(Block.soundTypeMetal).setBlockName("AmethystBlock").setBlockTextureName("pixelutilitys:AmethystBlock").setCreativeTab(CreativeTabs.tabBlock);;
		CrystalBlock = new CrystalBlock(Material.rock).setHardness(8.5f).setStepSound(Block.soundTypeMetal).setBlockName("CrystalBlock").setBlockTextureName("pixelutilitys:CrystalBlock").setCreativeTab(CreativeTabs.tabBlock);
		SiliconOre = new SiliconOre(Material.rock).setHardness(1.2f).setStepSound(Block.soundTypeMetal).setBlockName("SiliconOre").setBlockTextureName("pixelutilitys:SiliconOre").setCreativeTab(CreativeTabs.tabBlock);;
		ClothedTableBlock = new ClothedTableBlock(Material.wood).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("ClothedTable").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);;
		PokeballBlock = new PokeballBlock(Material.iron).setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("Pokeball").setCreativeTab(PixelUtilitysCreativeTabs.tabPokefurniture);;
		RedCusionChairBlock = new RedCusionChairBlock(Material.cloth).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("RedCusionChair");;
		TrashcanBlock = new TrashcanBlock(Material.iron).setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("Trashcan");;
		YellowCusionChairBlock = new YellowCusionChairBlock(Material.cloth).setHardness(0.5f).setStepSound(Block.soundTypeWood).setBlockName("YellowCusionChair");
		TotodilePokedollBlock = new TotodilePokedollBlock(Material.cloth).setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("TotodileDoll");;
		AronPokedollBlock = new AronPokedollBlock(Material.cloth).setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("AronDoll");;
		BisharpPokedollBlock = new BisharpPokedollBlock(Material.cloth).setHardness(0.5f).setStepSound(Block.soundTypeMetal).setBlockName("BisharpDoll");;
		RadioBlock = new RadioBlock(Material.wood);
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
		GameRegistry.registerBlock(BisharpPokedollBlock, "BisharpDoll");
		GameRegistry.registerBlock(RadioBlock, "Radio");

	}

}