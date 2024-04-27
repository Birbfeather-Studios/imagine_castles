package net.birb_feather.imagine_castles;

import net.distantdig.ezLib.EzLib;
import net.distantdig.ezLib.block.EzBlockSets;
import net.distantdig.ezLib.block.EzBlocksBuilder;
import net.distantdig.ezLib.item.EzItemGroups;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;
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
		EzItemGroups.registerItemGroup(EzBlocksBuilder.inventoryMap.get("black_slate"));
	}

	@Override
	public void registerModBlocks() {
		registerCastleStone("limestone");
		registerCastleStone("white_slate");
		registerCastleStone("black_slate");
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
		registerCastleStone("claystone");
		registerCastleStone("antrecite");
		registerCastleStone("shale");
		registerCastleStone("chalk");
		registerCastleStone("talk");
	}

	public void registerCastleStone(String name) {
		new EzBlocksBuilder(name, Blocks.STONE, null, EzBlocksBuilder.EzMaterial.stone)
				.pickaxe()
				.stair()
				.slab()
				.verticalSlab()
				.button(BlockSetType.STONE, 10, false)
				.pressurePlate(BlockSetType.STONE, PressurePlateBlock.Sensitivity.EVERYTHING)
				.pillar("gothic_", "_pillar", null)
				.pillar("ornate_", "_pillar", null)
				.extraBlock("chiseled_", null, null)
				.extraBlock("cut_", null, null)
				.wall();
		new EzBlockSets().simpleStoneSet(name + "_bricks");
		new EzBlockSets().simpleStoneSet("polished_" + name);
	}
}