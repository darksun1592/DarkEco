package me.DarkSun159.Economy;

import java.util.HashMap;

import org.bukkit.entity.Player;

public class DarkEco{
	
	static DarkEcoMessage message = new DarkEcoMessage();
	
	public static HashMap<String, Double> bank = new HashMap<String, Double>();
	
	public static boolean containsPlayer(Player player){
		if(bank.size() == 0) return false; 
		for(String p : bank.keySet())
			if(p.equalsIgnoreCase(player.getName()))
				return true;
		return false;
	}
	
	public static void addPlayer(Player player){
		if(containsPlayer(player)) return;
		
		double starting = 0;
		bank.put(player.getName(), starting);
		message.success(player, "Congratulations! Your account is starting at " + DarkEco.getBalance(player) + " dollars! Welcome to the server!");
	}
	
	public static double getBalance(Player player){
		if(!containsPlayer(player)) return -1;
		
		return bank.get(player.getName());
	}
	
	public static void add(Player player, double amount){
		if(!containsPlayer(player)) return;
		
		bank.put(player.getName(), bank.get(player.getName()) + amount);
	}
	
	public static void remove(Player player, double amount){
		if(!containsPlayer(player)) return;
		
		bank.put(player.getName(), bank.get(player.getName()) - amount);
	}
	
	public static void set(Player player, double amount){
		if(!containsPlayer(player)) return;
		
		bank.put(player.getName(), amount);
	}
	
	public static HashMap<String, Double> getBank(){
		return bank;
	}
	
	public static void save(){
		SLAPI.save(bank);
	}
	
	public static void load(){
		bank = SLAPI.load();
	}
	
}

























