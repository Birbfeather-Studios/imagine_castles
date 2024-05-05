package net.birb_feather.imagine_castles;

import net.distantdig.ezLib.EzLib;
import net.distantdig.ezLib.block.EzBlockSets;
import net.distantdig.ezLib.block.EzBlocksBuilder;
import net.distantdig.ezLib.item.EzItemGroups;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImagineCastles extends EzLib {

	public static String MOD_ID = "imagine_castles";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public ImagineCastles() {
		super(MOD_ID);
	}

	@Override
	public void registerModGroup() {
		EzItemGroups.registerItemGroup(EzBlocksBuilder.itemMap.get("black_slate"));
	}

	@Override
	public void registerModBlocks() {
		registerCastleStone("claystone")
				.makeOre(EzBlocksBuilder.stoneReplacables, 64, 1,
						HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
		registerCastleStone("limestone")
				.makeOre(EzBlocksBuilder.deepslateReplacables, 64, 1,
						HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(80)));
		registerCastleStone("black_slate")
				.makeOre(EzBlocksBuilder.deepslateReplacables, 64, 1,
						HeightRangePlacement.uniform(VerticalAnchor.absolute(-80), VerticalAnchor.absolute(80)));
		registerCastleStone("white_slate");
		registerCastleStone("orange_slate");
		registerCastleStone("yellow_slate");
		registerCastleStone("red_slate");
		registerCastleStone("blue_slate");
		registerCastleStone("light_blue_slate");
		registerCastleStone("cyan_slate");
		registerCastleStone("lime_slate");
		registerCastleStone("grey_slate");
		registerCastleStone("light_grey_slate");
		registerCastleStone("purple_slate");
		registerCastleStone("magenta_slate");
		registerCastleStone("brown_slate");
		registerCastleStone("green_slate");
		registerCastleStone("pink_slate");
		registerCastleStone("antrecite");
		registerCastleStone("shale");
		registerCastleStone("chalk");
		registerCastleStone("talk");
	}

	public EzBlocksBuilder registerCastleStone(String name) {
		EzBlocksBuilder blocksBuilder = new EzBlocksBuilder(name, Blocks.STONE, "", EzBlocksBuilder.EzMaterial.stone)
				.pickaxe()
				.stair()
				.slab()
				.verticalSlab()
				.button(BlockSetType.STONE, 10, false)
				.pressurePlate(BlockSetType.STONE, PressurePlateBlock.Sensitivity.EVERYTHING)
				.pillar("gothic_", "_pillar", null)
				.pillar("ornate_", "_pillar", null)
				.extraBlock("chiseled_", "", null)
				.extraBlock("cut_", "", null)
				.wall();
		new EzBlockSets().simpleStoneSet(name + "_bricks");
		new EzBlockSets().simpleStoneSet("polished_" + name);
		return blocksBuilder;
	}

	public static Block getBlock(String name) {
		return EzBlocksBuilder.itemMap.get(name).getBlock();
	}
}