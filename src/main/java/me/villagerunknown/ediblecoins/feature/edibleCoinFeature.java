package me.villagerunknown.ediblecoins.feature;

import me.villagerunknown.ediblecoins.item.EdibleVillagerCoinItem;
import me.villagerunknown.platform.util.RegistryUtil;
import me.villagerunknown.villagercoin.feature.coinFeature;
import net.minecraft.item.Item;
import net.minecraft.util.Rarity;

import static me.villagerunknown.ediblecoins.Ediblecoins.MOD_ID;

public class edibleCoinFeature {
	
	public static Item EDIBLE_COPPER_COIN;
	public static Item EDIBLE_IRON_COIN;
	public static Item EDIBLE_GOLD_COIN;
	public static Item EDIBLE_EMERALD_COIN;
	public static Item EDIBLE_NETHERITE_COIN;
	
	public static void execute() {}
	
	private static Item registerVillagerCoinItem( String id, Rarity rarity, int dropMinimum, int dropMaximum, float dropChance ) {
		return registerVillagerCoinItem( id, rarity, dropMinimum, dropMaximum, dropChance, new Item.Settings() );
	}
	
	private static Item registerVillagerCoinItem( String id, Rarity rarity, int dropMinimum, int dropMaximum, float dropChance, Item.Settings settings ) {
		Item item = RegistryUtil.registerItem( id, new EdibleVillagerCoinItem( settings, rarity, dropMinimum, dropMaximum, dropChance ), MOD_ID );
		RegistryUtil.addItemToGroup( coinFeature.CUSTOM_ITEM_GROUP_KEY, item );
		return item;
	}
	
	static {
		EDIBLE_COPPER_COIN = registerVillagerCoinItem( "edible_copper_" + coinFeature.COIN_STRING, Rarity.COMMON, 0, 4, 0.25F );
		EDIBLE_IRON_COIN = registerVillagerCoinItem( "edible_iron_" + coinFeature.COIN_STRING, Rarity.UNCOMMON, 0, 3, 0.2F );
		EDIBLE_GOLD_COIN = registerVillagerCoinItem( "edible_gold_" + coinFeature.COIN_STRING, Rarity.RARE, 0, 2, 0.1F );
		EDIBLE_EMERALD_COIN = registerVillagerCoinItem( "edible_emerald_" + coinFeature.COIN_STRING, Rarity.EPIC, 0, 1, 0.05F );
		EDIBLE_NETHERITE_COIN = registerVillagerCoinItem( "edible_netherite_" + coinFeature.COIN_STRING, Rarity.EPIC, 0, 1, 0.005F );
	}
	
}
