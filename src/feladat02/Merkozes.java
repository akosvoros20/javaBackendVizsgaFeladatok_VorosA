package feladat02;

public class Merkozes implements Gol {
	
	private String hazai;
	private String vendeg;
	private int idotartam;
	private int hazaiGolszam;
	private int vendegGolszam;
	
	public Merkozes(String hazai, String vendeg) {

		this.hazai = hazai;
		this.vendeg = vendeg;
		idotartam = 90;
		hazaiGolszam = 0;
		vendegGolszam = 0;
		
	}

	public int getIdotartam() {
		return idotartam;
	}
	
	
	public String getHazai() {
		return hazai;
	}

	public String getVendeg() {
		return vendeg;
	}

	public int getHazaiGolszam() {
		return hazaiGolszam;
	}

	public int getVendegGolszam() {
		return vendegGolszam;
	}
	
	

	public void setHazai(String hazai) {
		this.hazai = hazai;
	}

	public void setVendeg(String vendeg) {
		this.vendeg = vendeg;
	}

	public void setIdotartam(int idotartam) {
		this.idotartam = idotartam;
	}

	public void setHazaiGolszam(int hazaiGolszam) {
		this.hazaiGolszam = hazaiGolszam;
	}

	public void setVendegGolszam(int vendegGolszam) {
		this.vendegGolszam = vendegGolszam;
	}

	@Override
	public void gooool(String melyikCsapatSzerezte) {
		if(melyikCsapatSzerezte.equals(getHazai())) {
			hazaiGolszam++;
		}
		if(melyikCsapatSzerezte.equals(getVendeg())) {
			vendegGolszam++;
		}
	}

	@Override
	public String toString() {
		return "A meccs végeredménye: " + getHazai() + " - " + getVendeg() + " " + getHazaiGolszam() + " - " + getVendegGolszam();
	}
	
	
	
	
}
