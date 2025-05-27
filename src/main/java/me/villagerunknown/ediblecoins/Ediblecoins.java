package me.villagerunknown.ediblecoins;

import me.villagerunknown.ediblecoins.feature.EdibleCoinItemsFeature;
import me.villagerunknown.platform.Platform;
import me.villagerunknown.platform.PlatformMod;
import me.villagerunknown.platform.manager.featureManager;
import me.villagerunknown.villagercoin.Villagercoin;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;

public class Ediblecoins implements ModInitializer {
	
	public static PlatformMod<?> MOD = Platform.register( "ediblecoins", Ediblecoins.class );
	public static String MOD_ID = MOD.getModId();
	public static Logger LOGGER = MOD.getLogger();
	
	@Override
	public void onInitialize() {
		// # Load Villager Coin
		Villagercoin.load();
		
		// # Initialize addon mod with Platform
		Platform.init_mod( MOD );
		
		// # Activate Features
		featureManager.addFeature( "edible-coin-items", EdibleCoinItemsFeature::execute );
		
		// # Load Features
		featureManager.loadFeatures();
	}
	
}
