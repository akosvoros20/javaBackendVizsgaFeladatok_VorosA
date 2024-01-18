package feladat04;

public class Csatorna {
	
	private String megnevezes;
	private String kategoria;
	private String nyelv;
	private int csatornahely;
	private int alapitasEve;
	public String getMegnevezes() {
		return megnevezes;
	}
	public void setMegnevezes(String megnevezes) {
		this.megnevezes = megnevezes;
	}
	public String getKategoria() {
		return kategoria;
	}
	public void setKategoria(String kategoria) {
		this.kategoria = kategoria;
	}
	public String getNyelv() {
		return nyelv;
	}
	public void setNyelv(String nyelv) {
		this.nyelv = nyelv;
	}
	public int getCsatornahely() {
		return csatornahely;
	}
	public void setCsatornahely(int csatornahely) {
		this.csatornahely = csatornahely;
	}
	public int getAlapitasEve() {
		return alapitasEve;
	}
	public void setAlapitasEve(int alapitasEve) {
		this.alapitasEve = alapitasEve;
	}
	@Override
	public String toString() {
		return "Csatorna [megnevezes=" + megnevezes + ", kategoria=" + kategoria + ", nyelv=" + nyelv
				+ ", csatornahely=" + csatornahely + ", alapitasEve=" + alapitasEve + "]";
	}
	
	
	
	
	
	

}
