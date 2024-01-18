package teszt01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import feladat01.KategorizaloApp;

class KategorizaloAppTeszt {

	@Test
	void kategorizalTeszt() {
		
		int kod = 2;
		String elvartSzoveg = "II. osztályú termék";
		
		assertEquals(elvartSzoveg, KategorizaloApp.kategorizal(kod));
		
	}
	
	@Test
	void arkepzes_80szazalekTeszt() {
		int kod = 3;
		int alapar = 1000;
		
		assertEquals(800, KategorizaloApp.arkepzes(kod, alapar));
	
	}
	
	@Test
	void arkepzes_90szazalekTeszt() {
		int kod = 2;
		int alapar = 1500;
		
		assertEquals(1350, KategorizaloApp.arkepzes(kod, alapar));
	
	}
	
	@Test
	void arkepzes_100szazalekTeszt() {
		int kod = 1;
		int alapar = 1000;
		
		assertEquals(1000, KategorizaloApp.arkepzes(kod, alapar));
	
	}

}
