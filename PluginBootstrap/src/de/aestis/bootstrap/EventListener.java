package de.aestis.bootstrap;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerFishEvent;


public class EventListener implements Listener {
	
	FileConfiguration Config = Main.instance.getConfig();

	@EventHandler
	public void onFishing(PlayerFishEvent event) {
		//do event stuff
	}

}
