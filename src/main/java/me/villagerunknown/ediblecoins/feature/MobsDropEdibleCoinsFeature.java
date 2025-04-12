package me.villagerunknown.ediblecoins.feature;

import me.villagerunknown.ediblecoins.Ediblecoins;
import me.villagerunknown.ediblecoins.item.EdibleCoinItems;
import me.villagerunknown.villagercoin.feature.MobsDropCoinsFeature;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;

import java.util.HashMap;

public class MobsDropEdibleCoinsFeature {
	
	public static void execute(){
		addCoinsToMobDrops();
	}
	
	private static void addCoinsToMobDrops() {
		ServerLivingEntityEvents.AFTER_DEATH.register((entity, damageSource) -> {
			if( Ediblecoins.CONFIG.addEdibleCoinsToMobDrops ) {
				if( null != damageSource && null != damageSource.getAttacker() ) {
					if( damageSource.getAttacker().isPlayer() ) {
						HashMap<Item, Integer> coins = new HashMap<>();
						
						if( entity.getType().equals( EntityType.PIGLIN ) || entity.getType().equals( EntityType.PIGLIN_BRUTE ) ) {
							coins.put( EdibleCoinItems.EDIBLE_GOLD_COIN, 1 );
						} else if( MobsDropCoinsFeature.COMMON_MOB_DROPS.contains( entity.getType() ) ) {
							coins.put( EdibleCoinItems.EDIBLE_COPPER_COIN, 1 );
							coins.put( EdibleCoinItems.EDIBLE_IRON_COIN, 1 );
							coins.put( EdibleCoinItems.EDIBLE_GOLD_COIN, 1 );
						} else if( MobsDropCoinsFeature.RARE_MOB_DROPS.contains( entity.getType() ) ) {
							coins.put( EdibleCoinItems.EDIBLE_GOLD_COIN, 1 );
							coins.put( EdibleCoinItems.EDIBLE_EMERALD_COIN, 1 );
						} else if( MobsDropCoinsFeature.EPIC_MOB_DROPS.contains( entity.getType() ) ) {
							coins.put( EdibleCoinItems.EDIBLE_EMERALD_COIN, 1 );
							coins.put( EdibleCoinItems.EDIBLE_NETHERITE_COIN, 1 );
						} // if, else if ...
						
						MobsDropCoinsFeature.dropCoins( entity, damageSource, coins );
					} // if
				} // if
			} // if
		});
	}
	
}
