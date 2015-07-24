package me.DarkSun159.Economy;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class DarkEcoEvents implements Listener{

	public DarkEcoEvents(DarkEcoMain plugin){
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void onPlayerJoin(PlayerJoinEvent event){
		if(DarkEco.containsPlayer(event.getPlayer())) return;
		DarkEco.addPlayer(event.getPlayer());
	}
	
}

































