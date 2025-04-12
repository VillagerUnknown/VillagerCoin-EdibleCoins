package me.villagerunknown.ediblecoins;

import me.villagerunknown.ediblecoins.feature.loader.EdibleCoinFeatureLoader;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Ediblecoins implements ModInitializer {
	
	public static PlatformMod<EdiblecoinsConfigData> MOD = Platform.register( "ediblecoins", Ediblecoins.class, EdiblecoinsConfigData.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	public static EdiblecoinsConfigData CONFIG = MOD.getConfig();
	
	@Override
	public void onInitialize() {
		// # Initialize Mod
		init();
	}
	
	private static void init() {
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "edibleCoinFeatureLoader", EdibleCoinFeatureLoader::execute );
	}
	
}
