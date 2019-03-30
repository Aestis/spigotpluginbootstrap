package de.aestis.bootstrap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.file.FileConfiguration;


public class CommandManager implements CommandExecutor {
	
	FileConfiguration Config = Main.instance.getConfig();
	
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] argArr) {

		if (cmd.getName().equalsIgnoreCase("CMD_NAME")) {
			if (arg.equalsIgnoreCase("CMD_NAME") && argArr.length == 0) {
				
				//main cmd
				return true;
			}
			if (argArr[0].equalsIgnoreCase("test")) {
				
				//show team info
				return true;
			}
		}
		return false;
	}
}
