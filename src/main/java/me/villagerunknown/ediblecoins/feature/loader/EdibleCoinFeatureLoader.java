package me.villagerunknown.ediblecoins.feature.loader;

import me.villagerunknown.ediblecoins.item.EdibleCoinItems;
import me.villagerunknown.villagercoin.feature.EdibleCoinFeature;

public class EdibleCoinFeatureLoader {
	
	public static void execute() {
		EdibleCoinFeature.execute();
		new EdibleCoinItems();
	}
	
}
