package me.villagerunknown.ediblecoins.feature;

import me.villagerunknown.ediblecoins.Ediblecoins;
import me.villagerunknown.ediblecoins.item.EdibleCoinItems;
import me.villagerunknown.villagercoin.feature.StructuresIncludeCoinsFeature;
import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class StructuresIncludeEdibleCoinsFeature {
	
	public static void execute(){
		addCoinsToLootTables();
	}
	
	private static void addCoinsToLootTables() {
		LootTableEvents.MODIFY.register((registryKey, lootBuilder, lootTableSource, registryWrapper) -> {
			if( lootTableSource.isBuiltin() && Ediblecoins.CONFIG.addEdibleCoinsToStructureLootTables ) {
				LootPool.Builder poolBuilder = LootPool.builder();
				
				if( StructuresIncludeCoinsFeature.COMMON_LOOT_TABLES.contains( registryKey ) || StructuresIncludeCoinsFeature.UNCOMMON_LOOT_TABLES.contains( registryKey ) ) {
					poolBuilder
							.with(ItemEntry.builder(EdibleCoinItems.EDIBLE_COPPER_COIN).weight(10))
							.with(ItemEntry.builder(EdibleCoinItems.EDIBLE_IRON_COIN).weight(7))
							.with(ItemEntry.builder(EdibleCoinItems.EDIBLE_GOLD_COIN).weight(5))
							.rolls(UniformLootNumberProvider.create(0, 5));
				} // if

				if( StructuresIncludeCoinsFeature.RARE_LOOT_TABLES.contains( registryKey ) ) {
					poolBuilder
							.with(ItemEntry.builder(EdibleCoinItems.EDIBLE_EMERALD_COIN).weight(3))
							.rolls(UniformLootNumberProvider.create(0, 7));
				}  // if
				
				if( StructuresIncludeCoinsFeature.EPIC_LOOT_TABLES.contains( registryKey ) ) {
					poolBuilder
							.with(ItemEntry.builder(EdibleCoinItems.EDIBLE_NETHERITE_COIN).weight(1))
							.rolls(UniformLootNumberProvider.create(0, 10));
				} // if
				
				lootBuilder.pool(poolBuilder);
			} // if
		});
	}
	
}
