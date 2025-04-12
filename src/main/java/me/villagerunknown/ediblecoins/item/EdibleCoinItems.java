package me.villagerunknown.ediblecoins.item;

import me.villagerunknown.villagercoin.feature.CoinFeature;
import me.villagerunknown.villagercoin.feature.EdibleCoinFeature;
import net.minecraft.item.Item;

public class EdibleCoinItems {
	
	public static final Item EDIBLE_COPPER_COIN;
	public static final Item EDIBLE_IRON_COIN;
	public static final Item EDIBLE_GOLD_COIN;
	public static final Item EDIBLE_EMERALD_COIN;
	public static final Item EDIBLE_NETHERITE_COIN;
	
	public EdibleCoinItems() {}
	
	static {
		EDIBLE_COPPER_COIN = EdibleCoinFeature.registerEdibleCoinItem( "edible_copper_" + CoinFeature.COIN_STRING, EdibleCoinFeature.COPPER_FOOD, CoinFeature.COPPER_RARITY, CoinFeature.COPPER_DROP_MINIMUM, EdibleCoinFeature.COPPER_DROP_MAXIMUM, EdibleCoinFeature.COPPER_DROP_CHANCE );
		EDIBLE_IRON_COIN = EdibleCoinFeature.registerEdibleCoinItem( "edible_iron_" + CoinFeature.COIN_STRING, EdibleCoinFeature.IRON_FOOD, CoinFeature.IRON_RARITY, CoinFeature.IRON_DROP_MINIMUM, EdibleCoinFeature.IRON_DROP_MAXIMUM, EdibleCoinFeature.IRON_DROP_CHANCE );
		EDIBLE_GOLD_COIN = EdibleCoinFeature.registerEdibleCoinItem( "edible_gold_" + CoinFeature.COIN_STRING, EdibleCoinFeature.GOLD_FOOD, CoinFeature.GOLD_RARITY, CoinFeature.GOLD_DROP_MINIMUM, EdibleCoinFeature.GOLD_DROP_MAXIMUM, EdibleCoinFeature.GOLD_DROP_CHANCE );
		EDIBLE_EMERALD_COIN = EdibleCoinFeature.registerEdibleCoinItem( "edible_emerald_" + CoinFeature.COIN_STRING, EdibleCoinFeature.EMERALD_FOOD, CoinFeature.EMERALD_RARITY, CoinFeature.EMERALD_DROP_MINIMUM, EdibleCoinFeature.EMERALD_DROP_MAXIMUM, EdibleCoinFeature.EMERALD_DROP_CHANCE );
		EDIBLE_NETHERITE_COIN = EdibleCoinFeature.registerEdibleCoinItem( "edible_netherite_" + CoinFeature.COIN_STRING, EdibleCoinFeature.NETHERITE_FOOD, CoinFeature.NETHERITE_RARITY, CoinFeature.NETHERITE_DROP_MINIMUM, EdibleCoinFeature.NETHERITE_DROP_MAXIMUM, EdibleCoinFeature.NETHERITE_DROP_CHANCE );
	}
	
}
