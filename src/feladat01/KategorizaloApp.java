package feladat01;

import java.util.Scanner;

public class KategorizaloApp {
	int ar;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Kérem adja meg a termék kódját: ");
		int bkod = sc.nextInt();
		System.out.print("Kérem adja meg az alapárat: ");
		int balapar = sc.nextInt();
		System.out.print("A termék ára:  "+arkepzes(bkod,balapar));
	}


	public static String kategorizal(int kod) {
		
		String szoveg = null;
		switch (kod) {
		
		case 1:
			szoveg = "I. osztályú termék";
			break;
		case 2:
			szoveg = "II. osztályú termék";
			break;
		case 3:
			szoveg = "III. osztályú termék";
			break;
		}
		
		return szoveg;
	}
	
	public static int arkepzes(int kod, int alapar){
		double ar = 0;
		if(kod == 1) {
			ar = alapar;
		}
		if(kod == 2) {
			ar = alapar*0.9;
		}
		if(kod == 3)
		{
			ar = alapar*0.8;
		}
		return (int)ar;
	}


}
