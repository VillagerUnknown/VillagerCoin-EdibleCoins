package me.villagerunknown.ediblecoins.item;

import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.effect.StewEffects;
import me.villagerunknown.villagercoin.feature.CoinFeature;
import me.villagerunknown.villagercoin.feature.EdibleCoinFeature;
import me.villagerunknown.villagercoin.feature.MobsDropCoinsFeature;
import me.villagerunknown.villagercoin.feature.StructuresIncludeCoinsFeature;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;

import java.util.List;

public class EdibleCoinItems {
	
	public static final Item EDIBLE_COPPER_COIN;
	public static final Item EDIBLE_IRON_COIN;
	public static final Item EDIBLE_GOLD_COIN;
	public static final Item EDIBLE_EMERALD_COIN;
	public static final Item EDIBLE_NETHERITE_COIN;
	
	public static final Item HALF_EATEN_EDIBLE_COPPER_COIN;
	public static final Item POISONOUS_EDIBLE_COPPER_COIN;
	public static final Item MOLDY_EDIBLE_GOLD_COIN;
	
	public EdibleCoinItems() {
		MobsDropCoinsFeature.addCoinToDropList( EDIBLE_COPPER_COIN, MobsDropCoinsFeature.COPPER_COIN_DROPS );
		MobsDropCoinsFeature.addCoinToDropList( HALF_EATEN_EDIBLE_COPPER_COIN, MobsDropCoinsFeature.COPPER_COIN_DROPS );
		MobsDropCoinsFeature.addCoinToDropList( POISONOUS_EDIBLE_COPPER_COIN, MobsDropCoinsFeature.COPPER_COIN_DROPS );
		
		MobsDropCoinsFeature.addCoinToDropList( EDIBLE_IRON_COIN, MobsDropCoinsFeature.IRON_COIN_DROPS );
		
		MobsDropCoinsFeature.addCoinToDropList( EDIBLE_GOLD_COIN, MobsDropCoinsFeature.GOLD_COIN_DROPS );
		MobsDropCoinsFeature.addCoinToDropList( MOLDY_EDIBLE_GOLD_COIN, MobsDropCoinsFeature.GOLD_COIN_DROPS );
		
		MobsDropCoinsFeature.addCoinToDropList( EDIBLE_EMERALD_COIN, MobsDropCoinsFeature.EMERALD_COIN_DROPS );
		
		MobsDropCoinsFeature.addCoinToDropList( EDIBLE_NETHERITE_COIN, MobsDropCoinsFeature.NETHERITE_COIN_DROPS );
	}
	
	static {
		EDIBLE_COPPER_COIN = EdibleCoinFeature.registerEdibleCoinItem( Villagercoin.MOD_ID, "edible_copper_" + CoinFeature.COIN_STRING, EdibleCoinFeature.COPPER_FOOD, CoinFeature.COPPER_RARITY, 0, EdibleCoinFeature.COPPER_DROP_MAXIMUM, EdibleCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.COPPER_LOOT_TABLES );
		EDIBLE_IRON_COIN = EdibleCoinFeature.registerEdibleCoinItem( Villagercoin.MOD_ID, "edible_iron_" + CoinFeature.COIN_STRING, EdibleCoinFeature.IRON_FOOD, CoinFeature.IRON_RARITY, 0, EdibleCoinFeature.IRON_DROP_MAXIMUM, EdibleCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.IRON_LOOT_TABLES );
		EDIBLE_GOLD_COIN = EdibleCoinFeature.registerEdibleCoinItem( Villagercoin.MOD_ID, "edible_gold_" + CoinFeature.COIN_STRING, EdibleCoinFeature.GOLD_FOOD, CoinFeature.GOLD_RARITY, 0, EdibleCoinFeature.GOLD_DROP_MAXIMUM, EdibleCoinFeature.EMERALD_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.GOLD_LOOT_TABLES );
		EDIBLE_EMERALD_COIN = EdibleCoinFeature.registerEdibleCoinItem( Villagercoin.MOD_ID, "edible_emerald_" + CoinFeature.COIN_STRING, EdibleCoinFeature.EMERALD_FOOD, CoinFeature.EMERALD_RARITY, 0, EdibleCoinFeature.EMERALD_DROP_MAXIMUM, EdibleCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.EMERALD_LOOT_TABLES );
		EDIBLE_NETHERITE_COIN = EdibleCoinFeature.registerEdibleCoinItem( Villagercoin.MOD_ID, "edible_netherite_" + CoinFeature.COIN_STRING, EdibleCoinFeature.NETHERITE_FOOD, CoinFeature.NETHERITE_RARITY, 0, EdibleCoinFeature.NETHERITE_DROP_MAXIMUM, EdibleCoinFeature.NETHERITE_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.NETHERITE_LOOT_TABLES );
		
		HALF_EATEN_EDIBLE_COPPER_COIN = EdibleCoinFeature.registerEdibleCoinItem( Villagercoin.MOD_ID, "half_eaten_edible_copper_" + CoinFeature.COIN_STRING, FoodComponents.POTATO, CoinFeature.COPPER_RARITY, 0, 1, EdibleCoinFeature.IRON_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.COPPER_LOOT_TABLES );
		POISONOUS_EDIBLE_COPPER_COIN = EdibleCoinFeature.registerEdibleCoinItem( Villagercoin.MOD_ID, "poisonous_edible_copper_" + CoinFeature.COIN_STRING, FoodComponents.POISONOUS_POTATO, CoinFeature.COPPER_RARITY, 0, 1, EdibleCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.COPPER_LOOT_TABLES );
		MOLDY_EDIBLE_GOLD_COIN = EdibleCoinFeature.registerEdibleCoinItem( Villagercoin.MOD_ID, "moldy_edible_gold_" + CoinFeature.COIN_STRING, EdibleCoinFeature.GOLD_FOOD, CoinFeature.GOLD_RARITY, 0, 1, EdibleCoinFeature.GOLD_DROP_CHANCE, 1, 1, 1, StructuresIncludeCoinsFeature.GOLD_LOOT_TABLES, List.of(StewEffects.FIRE_RESISTANCE,StewEffects.BLINDNESS,StewEffects.SATURATION,StewEffects.NAUSEA,StewEffects.JUMP_BOOST,StewEffects.POISON,StewEffects.REGENERATION,StewEffects.NIGHT_VISION,StewEffects.WEAKNESS,StewEffects.WITHER) );
	}
	
}
