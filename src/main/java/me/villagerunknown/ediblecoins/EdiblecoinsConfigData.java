package me.villagerunknown.ediblecoins;

import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;

@Config(name = "villagerunknown-ediblecoins")
public class EdiblecoinsConfigData implements me.shedaniel.autoconfig.ConfigData {
	
	/**
	 * General
	 */
	
	@ConfigEntry.Category("General")
	public boolean enableTheUnknown = false;
	
}
