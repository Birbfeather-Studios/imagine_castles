package net.birb_feather.imagine_castles;

import net.distantdig.ezLib.EzLib;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ImagineCastles extends EzLib {

	public static String MOD_ID = "imagine_castles";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public ImagineCastles() {
		super(MOD_ID);
	}

	@Override
	public void registerModBlocks() {
	}

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
	}
}