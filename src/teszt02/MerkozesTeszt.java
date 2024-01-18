package teszt02;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import feladat02.Merkozes;

class MerkozesTeszt {

	@Test
	void MerkozesTest() {
		
		Merkozes meccs = new Merkozes("BajnokCsapat", "LegjobbCsapat");
		assertEquals(90, meccs.getIdotartam());
		
	}
	
	@Test
	void HazaiGolTest() {
		
		Merkozes meccs = new Merkozes("Hazai SC","Vendég SE");
		meccs.gooool("Hazai SC");
		assertEquals(1, meccs.getHazaiGolszam());
		
	}
	
	@Test
	void VendegGolTest() {
		
		Merkozes meccs = new Merkozes("Hazai SC","Vendég SE");
		meccs.gooool("Vendég SE");
		assertEquals(1, meccs.getVendegGolszam());
		
	}
	
	
	
}
