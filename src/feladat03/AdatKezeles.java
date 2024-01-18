package feladat03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AdatKezeles {
	
	private static int sorszam=0;
	
		
	public Map<String, Vizsgazo> adatBekeres(){
		
		Map<String, Vizsgazo> vizsgazok = new HashMap<String, Vizsgazo>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 4; i++) {
			System.out.println("Adja meg a(z) " + (i + 1) + ". vizsgázó adatait!");
			System.out.print("Név: ");
			String nev = scanner.nextLine();
			System.out.print("Email: ");
			String email = scanner.nextLine();
			System.out.print("Képző intézmény: "); 
			String kepzoIntezmeny = scanner.nextLine();
			vizsgazok.put(azonositoGeneralas(), new Vizsgazo(nev,email,kepzoIntezmeny));
		}
		
		return vizsgazok;
		
	}
	
	
	
	public String azonositoGeneralas() {
		sorszam++;
		return "Vizsgazo"+sorszam;
		
	}
	
	
	

}


