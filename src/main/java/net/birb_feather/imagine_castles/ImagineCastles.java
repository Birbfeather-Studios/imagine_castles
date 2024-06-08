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
        //stonetypes
        registerCastleStone("claystone") //deep brownish stone very like iberian stone looking
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("limestone") //very nice and faded out pinkish yellowis brown stone, very french looking
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("antrecite") //a gray darkish stone, looks a bit like blackstone but then different. good for evil builds
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("chalk") //very very white looking stone, perfect for really whashed out buildings like minas stirith
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("talk") //this is essentially like a darker version of the limestone, good for contrasting.
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));

        //Slate types
        registerCastleStone("black_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("white_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("orange_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("yellow_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("red_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("blue_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("light_blue_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("cyan_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("lime_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("gray_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("light_gray_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("purple_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("magenta_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("brown_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("green_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("pink_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
    }

    public EzBlocksBuilder registerCastleStone(String name) {
        EzBlocksBuilder blocksBuilder = new EzBlocksBuilder(name, Blocks.STONE, "", EzBlocksBuilder.EzMaterial.stone)
                .pickaxe()
                .stair()
                .slab()
                .verticalSlab()
                .button(BlockSetType.STONE, 10, false)
                .pressurePlate(BlockSetType.STONE, PressurePlateBlock.Sensitivity.EVERYTHING)
                .pillar( "", "_pillar", null)
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