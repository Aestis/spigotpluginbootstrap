package de.aestis.bootstrap;

import org.bukkit.plugin.java.JavaPlugin;

import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;


public class Main extends JavaPlugin {
	
	public static Main instance;

	
	public void onEnable() {
		
		//init instance
		instance=this;
        
		//init configs, import cmdmgr, evtlistener, etc
		try {
			setupConfigs();
			getServer().getPluginManager().registerEvents((Listener) new EventListener(), this);
			//input cmd name
			getCommand("CMD_NAME").setExecutor((CommandExecutor) new CommandManager());
		} catch (Exception ex) {
			System.out.println("Error whilst enabling: " + ex);
			return;
		}
		
		System.out.println("xy sucessfully enabled.");
	}
	public void onDisable() {
		System.out.println("xy disabled.");
	}
	
	
	private void setupConfigs() {
		
		//create config.yml if not exist
        FileConfiguration config = getConfig();
        
        //set up config
    }
	
}