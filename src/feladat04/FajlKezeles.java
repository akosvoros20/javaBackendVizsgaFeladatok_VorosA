package feladat04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FajlKezeles {
	
	
	public List<Csatorna> fajlBeolvas(String fajlnev, String elvalaszto) throws FileNotFoundException {
		
		List<Csatorna> csatornak = new ArrayList<Csatorna>();
		
		File file = new File(fajlnev);
		Scanner sc = new Scanner(file);
		String lines;
		
		while(sc.hasNext()) {
			Csatorna csatorna = new Csatorna();	
			lines = sc.nextLine();
			String[] adat = lines.split(elvalaszto);
			csatorna.setMegnevezes(adat[0]);
			csatorna.setKategoria(adat[1]);
			csatorna.setNyelv(adat[2]);
			csatorna.setCsatornahely(Integer.parseInt(adat[3]));
			csatorna.setAlapitasEve(Integer.parseInt(adat[4]));
			csatornak.add(csatorna);
		}
		
		sc.close();
		return csatornak;
	}
	
	
	public void fajlkiir(String fajlnev, String elvalaszto) throws IOException{
		List<Csatorna> templist = fajlBeolvas("kiosztas.csv", ",");
		File file = new File("csatorna2010utan.csv");
		FileWriter fw = new FileWriter(file);
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(int i = 0; i<templist.size(); i++) {
			if(templist.get(i).getAlapitasEve()>2010) {
				
			}
		}
		
	}
	

}
