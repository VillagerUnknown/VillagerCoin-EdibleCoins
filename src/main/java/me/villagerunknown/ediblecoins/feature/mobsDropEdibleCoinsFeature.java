package me.villagerunknown.ediblecoins.feature;

import me.villagerunknown.ediblecoins.Ediblecoins;
import me.villagerunknown.platform.util.MathUtil;
import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.data.type.CoinComponent;
import me.villagerunknown.villagercoin.feature.edibleCoinFeature;
import me.villagerunknown.villagercoin.feature.mobsDropCoinsFeature;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.DynamicRegistryManager;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.World;

import java.util.HashMap;
import java.util.Set;

import static me.villagerunknown.villagercoin.Villagercoin.COIN_COMPONENT;
import static me.villagerunknown.villagercoin.feature.coinFeature.*;

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
							coins.put( me.villagerunknown.villagercoin.feature.edibleCoinFeature.EDIBLE_GOLD_COIN, 1 );
						} else if( mobsDropCoinsFeature.COMMON_MOB_DROPS.contains( entity.getType() ) ) {
							coins.put( me.villagerunknown.villagercoin.feature.edibleCoinFeature.EDIBLE_GOLD_COIN, 1 );
						} else if( mobsDropCoinsFeature.RARE_MOB_DROPS.contains( entity.getType() ) ) {
							coins.put( me.villagerunknown.villagercoin.feature.edibleCoinFeature.EDIBLE_EMERALD_COIN, 1 );
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
