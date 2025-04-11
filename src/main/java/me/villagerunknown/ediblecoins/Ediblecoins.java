package me.villagerunknown.ediblecoins;

import me.villagerunknown.ediblecoins.feature.mobsDropEdibleCoinsFeature;
import me.villagerunknown.ediblecoins.feature.structuresIncludeEdibleCoinsFeature;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import me.villagerunknown.villagercoin.feature.edibleCoinFeature;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

import java.util.Comparator;

public class Ediblecoins implements ModInitializer {
	
	public static PlatformMod<EdiblecoinsConfigData> MOD = Platform.register( "ediblecoins", Ediblecoins.class, EdiblecoinsConfigData.class );
	public static String MOD_ID = null;
	public static Logger LOGGER = null;
	public static EdiblecoinsConfigData CONFIG = null;
	
	@Override
	public void onInitialize() {
		// # Register Mod w/ Platform
		MOD_ID = MOD.getModId();
		LOGGER = MOD.getLogger();
		CONFIG = MOD.getConfig();
		
		// # Initialize Mod
		init();
	}
	
	private static void init() {
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "edibleCoin", edibleCoinFeature::execute );
		
		featureManager.addFeature( "structuresIncludeEdibleCoins", structuresIncludeEdibleCoinsFeature::execute );
		featureManager.addFeature( "mobsDropEdibleCoins", mobsDropEdibleCoinsFeature::execute );
	}
	
}
