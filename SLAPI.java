package me.DarkSun159.Economy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

public class SLAPI {
	
	public static void save(HashMap<String, Double> bank){
		try{
			
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("DarkEcoBank.dat")));
			oos.writeObject(bank);
			oos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static HashMap<String, Double> load(){
		try{
			
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("DarkEcoBank.dat")));
			HashMap<String, Double> bank = (HashMap<String, Double>)ois.readObject();
			ois.close();
			
			return bank;
		}catch(Exception e){
			return new HashMap<String, Double>();
		}
	}
	
}