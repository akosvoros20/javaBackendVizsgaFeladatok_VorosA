package feladat03;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class VizsgaztatoApp {

	public static void main(String[] args) {
		
		AdatKezeles adatObj = new AdatKezeles();
		
		Map<String, Vizsgazo> vizsgazok = adatObj.adatBekeres();
		
		Iterator<Map.Entry<String, Vizsgazo>> iterator = vizsgazok.entrySet().iterator();
		while (iterator.hasNext()) {
		    Entry<String, Vizsgazo> entry = iterator.next();
		    String key = entry.getKey();
		    Vizsgazo value = entry.getValue();
		    System.out.println("Azonosító: " + key + ", Vizsgázó: " + value);
		}
}
	
	public boolean profisuli(String s){
		
		
		return false;
	}
}	
