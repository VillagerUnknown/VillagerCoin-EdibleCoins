package me.villagerunknown.ediblecoins.item;

import me.villagerunknown.villagercoin.feature.CoinFeature;
import me.villagerunknown.villagercoin.feature.EdibleCoinFeature;
import me.villagerunknown.villagercoin.feature.MobsDropCoinsFeature;
import me.villagerunknown.villagercoin.feature.StructuresIncludeCoinsFeature;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;

public class EdibleCoinItems {
	
	public static final Item EDIBLE_COPPER_COIN;
	public static final Item EDIBLE_IRON_COIN;
	public static final Item EDIBLE_GOLD_COIN;
	public static final Item EDIBLE_EMERALD_COIN;
	public static final Item EDIBLE_NETHERITE_COIN;
	
	public static final Item HALF_EATEN_EDIBLE_COPPER_COIN;
	public static final Item POISONOUS_EDIBLE_COPPER_COIN;
	
	public EdibleCoinItems() {}
	
	static {
		EDIBLE_COPPER_COIN = EdibleCoinFeature.registerEdibleCoinItem( "edible_copper_" + CoinFeature.COIN_STRING, EdibleCoinFeature.COPPER_FOOD, CoinFeature.COPPER_RARITY, 0, EdibleCoinFeature.COPPER_DROP_MAXIMUM, EdibleCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.COPPER_LOOT_TABLES, MobsDropCoinsFeature.COPPER_MOB_DROPS );
		EDIBLE_IRON_COIN = EdibleCoinFeature.registerEdibleCoinItem( "edible_iron_" + CoinFeature.COIN_STRING, EdibleCoinFeature.IRON_FOOD, CoinFeature.IRON_RARITY, 0, EdibleCoinFeature.IRON_DROP_MAXIMUM, EdibleCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.IRON_LOOT_TABLES, MobsDropCoinsFeature.IRON_MOB_DROPS );
		EDIBLE_GOLD_COIN = EdibleCoinFeature.registerEdibleCoinItem( "edible_gold_" + CoinFeature.COIN_STRING, EdibleCoinFeature.GOLD_FOOD, CoinFeature.GOLD_RARITY, 0, EdibleCoinFeature.GOLD_DROP_MAXIMUM, EdibleCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.GOLD_LOOT_TABLES, MobsDropCoinsFeature.GOLD_MOB_DROPS );
		EDIBLE_EMERALD_COIN = EdibleCoinFeature.registerEdibleCoinItem( "edible_emerald_" + CoinFeature.COIN_STRING, EdibleCoinFeature.EMERALD_FOOD, CoinFeature.EMERALD_RARITY, 0, EdibleCoinFeature.EMERALD_DROP_MAXIMUM, EdibleCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.EMERALD_LOOT_TABLES, MobsDropCoinsFeature.EMERALD_MOB_DROPS );
		EDIBLE_NETHERITE_COIN = EdibleCoinFeature.registerEdibleCoinItem( "edible_netherite_" + CoinFeature.COIN_STRING, EdibleCoinFeature.NETHERITE_FOOD, CoinFeature.NETHERITE_RARITY, 0, EdibleCoinFeature.NETHERITE_DROP_MAXIMUM, EdibleCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.NETHERITE_LOOT_TABLES, MobsDropCoinsFeature.NETHERITE_MOB_DROPS );
		
		HALF_EATEN_EDIBLE_COPPER_COIN = EdibleCoinFeature.registerEdibleCoinItem( "half_eaten_edible_copper_" + CoinFeature.COIN_STRING, FoodComponents.POTATO, CoinFeature.COPPER_RARITY, 0, 1, EdibleCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.COPPER_LOOT_TABLES, MobsDropCoinsFeature.COPPER_MOB_DROPS );
		POISONOUS_EDIBLE_COPPER_COIN = EdibleCoinFeature.registerEdibleCoinItem( "poisonous_edible_copper_" + CoinFeature.COIN_STRING, FoodComponents.POISONOUS_POTATO, CoinFeature.COPPER_RARITY, 0, 1, EdibleCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.COPPER_LOOT_TABLES, MobsDropCoinsFeature.COPPER_MOB_DROPS );
	}
	
}
