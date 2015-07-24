package me.DarkSun159.Economy;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class DarkEcoMessage {
	
	private String pluginName = "DarkEco";
	public String pluginHeader = ChatColor.GREEN + "[" + ChatColor.BLUE + pluginName + ChatColor.GREEN + "] " + ChatColor.RESET;
	
	public void success(Player player, String message){
		player.sendMessage(pluginHeader + ChatColor.GREEN + message);
	}

	public void warning(Player player, String message){
		player.sendMessage(pluginHeader + ChatColor.YELLOW + message);
	}

	public void error(Player player, String message){
		player.sendMessage(pluginHeader + ChatColor.RED + message);
	}
	
	public void info(Player player, String message){
		player.sendMessage(pluginHeader + message);
	}
	
}