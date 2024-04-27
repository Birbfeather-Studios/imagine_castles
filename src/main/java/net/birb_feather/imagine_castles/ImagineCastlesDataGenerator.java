package net.birb_feather.imagine_castles;

import net.distantdig.ezLib.EzLibDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;

public class ImagineCastlesDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		EzLibDataGenerator.runDataGen(fabricDataGenerator);
	}

	@Override
	public void buildRegistry(RegistrySetBuilder registryBuilder) {
		EzLibDataGenerator.runBuildRegistry(registryBuilder);
	}
}
