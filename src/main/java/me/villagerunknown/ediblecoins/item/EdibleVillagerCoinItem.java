package me.villagerunknown.ediblecoins.item;

import me.villagerunknown.villagercoin.Villagercoin;
import me.villagerunknown.villagercoin.data.type.CoinComponent;
import net.minecraft.component.type.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Rarity;
import net.minecraft.util.UseAction;

import static me.villagerunknown.villagercoin.Villagercoin.COIN_COMPONENT;

public class EdibleVillagerCoinItem extends Item {
	
	public static SoundEvent SOUND = SoundEvents.ENTITY_GENERIC_EAT;
	
	public EdibleVillagerCoinItem(Settings settings) {
		super(
				settings
						.food(FoodComponents.COOKIE)
						.maxCount( Villagercoin.MAX_COUNT )
						.component( COIN_COMPONENT, new CoinComponent( Rarity.COMMON, 0, 5, 0.1F, 0.5F ) )
		);
	}
	
	public EdibleVillagerCoinItem(Settings settings, Rarity rarity, int dropMinimum, int dropMaximum, float dropChance) {
		super(
				settings
						.food(FoodComponents.COOKIE)
						.maxCount( Villagercoin.MAX_COUNT )
						.component( COIN_COMPONENT, new CoinComponent( rarity, dropMinimum, dropMaximum, dropChance, 0 ) )
		);
	}
	
	@Override
	public UseAction getUseAction(ItemStack stack) {
		return UseAction.EAT;
	}
	
	@Override
	public SoundEvent getEatSound() {
		return SOUND;
	}
	
}
