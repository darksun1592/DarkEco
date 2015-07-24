package me.DarkSun159.Economy;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class DarkEcoMain extends JavaPlugin{
	
	@Override
	public void onEnable(){
		DarkEco.load();
		getLogger().info("DarkEco is online!");
		new DarkEcoEvents(this);
	}
	
	@Override
	public void onDisable(){
		DarkEco.save();
		getLogger().info("Stopping DarkEco!");
	}
	
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
		return false;
	}
	
}