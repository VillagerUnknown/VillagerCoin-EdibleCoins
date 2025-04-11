package me.villagerunknown.ediblecoins.feature;

import me.villagerunknown.ediblecoins.Ediblecoins;
import me.villagerunknown.villagercoin.feature.mobsDropCoinsFeature;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;

import java.util.HashMap;

public class mobsDropEdibleCoinsFeature {
	
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
							coins.put( edibleCoinFeature.EDIBLE_GOLD_COIN, 1 );
						} else if( mobsDropCoinsFeature.COMMON_MOB_DROPS.contains( entity.getType() ) ) {
							coins.put( edibleCoinFeature.EDIBLE_GOLD_COIN, 1 );
						} else if( mobsDropCoinsFeature.RARE_MOB_DROPS.contains( entity.getType() ) ) {
							coins.put( edibleCoinFeature.EDIBLE_EMERALD_COIN, 1 );
						} else if( mobsDropCoinsFeature.EPIC_MOB_DROPS.contains( entity.getType() ) ) {
							coins.put( edibleCoinFeature.EDIBLE_NETHERITE_COIN, 1 );
						} // if, else if ...
						
						mobsDropCoinsFeature.dropCoins( entity, damageSource, coins );
					} // if
				} // if
			} // if
		});
	}
	
}
