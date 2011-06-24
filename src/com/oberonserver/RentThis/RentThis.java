package com.oberonserver.RentThis;

import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.griefcraft.lwc.LWC;
import com.griefcraft.lwc.LWCPlugin;

public class RentThis extends JavaPlugin {
	LWC lwc = null;
	public void onEnable(){ 
		Plugin lwcPlugin = getServer().getPluginManager().getPlugin("LWC");
		if(lwcPlugin != null) {
		    lwc = ((LWCPlugin) lwcPlugin).getLWC();
		}
	}
	 
	public void onDisable(){ 
	 
	}
}
