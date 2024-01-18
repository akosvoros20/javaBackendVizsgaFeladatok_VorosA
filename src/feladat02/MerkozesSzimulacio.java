package feladat02;

import java.util.Random;

public class MerkozesSzimulacio {
	public static void main(String[] args) {
		Merkozes merk = new Merkozes("Hazai SC","Vendég SE");
		System.out.println("A mérkőzés " + merk.getHazai() + " és " + merk.getVendeg() + " között megkezdődött.");
		for(int i = 1; i <= merk.getIdotartam(); i++) {
			Random rand = new Random();
			int esemeny = rand.nextInt(25)+1;
			if(esemeny == 10) {
				merk.gooool(merk.getHazai());
				System.out.println("Góóól! szerezte " + merk.getHazai() +" " + i + ". percben");
			}
			if (esemeny == 20) {
				merk.gooool(merk.getVendeg());
				System.out.println("Góóól! szerezte " + merk.getVendeg() + " " + i + ". percben");
			}
		}
		System.out.println(merk.toString());
		
	}
	
}
