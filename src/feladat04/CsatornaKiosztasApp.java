package feladat04;

import java.io.IOException;
import java.util.List;

public class CsatornaKiosztasApp {

	public static void main(String[] args) throws IOException {
		
		FajlKezeles fajlObj = new FajlKezeles();
		List<Csatorna> csatornak = fajlObj.fajlBeolvas("kiosztas.csv", ",");
		
		for(int i = 0; i<csatornak.size(); i++) {
			if(csatornak.get(i).getAlapitasEve()>2010) {
				System.out.println(csatornak.get(i).getMegnevezes());
			}
		}
			

	}

}
