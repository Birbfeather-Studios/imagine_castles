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

import java.util.ArrayList;
import java.util.List;

public class ImagineCastles extends EzLib {

    public static String MOD_ID = "imagine_castles";
    public static List<String> colors = List.of("white", "yellow", "orange", "red", "pink", "purple", "gray", "light_gray", "blue", "light_blue", "green", "lime", "brown", "cyan", "magenta");

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
        //generated in world
        registerCastleStone("claystone") //deep brownish stone very like iberian stone looking
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("dried_claystone");
        registerCastleStone("flintstone")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerCastleStone("limestone") //very nice and faded out pinkish yellowis brown stone, very french looking
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));
        registerSlate("black_slate")
                .makeOre(EzBlocksBuilder.stoneReplacables, 64, 1, HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(80)));

        //Not to be generated in the world
        //for loops are seperated because I am lazy and want to organize everything separately.
        for (String color : colors) {
            registerSlate(color + "_slate");
        }

        for(String color: colors) {
            registerStucco(color);
        }
        registerStucco("black");
    }

    public EzBlocksBuilder registerCastleStone(String name) {
        EzBlocksBuilder blocksBuilder = new EzBlocksBuilder(name, Blocks.STONE, "", EzBlocksBuilder.EzMaterial.stone)
                .pickaxe()
                .stair()
                .slab()
                .verticalSlab()
                .button(BlockSetType.STONE, 10, false)
                .pressurePlate(BlockSetType.STONE, PressurePlateBlock.Sensitivity.EVERYTHING)
                .pillar("", "_pillar", null)
                .extraBlock("chiseled_", "", null)
                .wall();
        new EzBlockSets().simpleStoneSet(name + "_brick");
        new EzBlockSets().simpleStoneSet(name + "_bricks");
        return blocksBuilder;
    }

    public EzBlocksBuilder registerSlate(String name) {
        EzBlocksBuilder blocksBuilder = new EzBlocksBuilder(name, Blocks.STONE, "", EzBlocksBuilder.EzMaterial.stone)
                .pickaxe()
                .stair()
                .slab();
        new EzBlockSets().simpleStoneSet(name + "_bricks");
        return blocksBuilder;
    }

    public EzBlocksBuilder registerStucco(String name) {
        EzBlocksBuilder blocksBuilder = new EzBlocksBuilder(name + "_stucco", Blocks.STONE, "", EzBlocksBuilder.EzMaterial.stone).pickaxe();
        return blocksBuilder;
    }

    public static Block getBlock(String name) {
        return EzBlocksBuilder.itemMap.get(name).getBlock();
    }
}