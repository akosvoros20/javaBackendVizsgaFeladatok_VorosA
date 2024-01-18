package feladat03;

public class Vizsgazo {
	
	private String name;
	private String email;
	private String intezmeny;
	
	
	public Vizsgazo(String name, String email, String intezmeny) {
		super();
		this.name = name;
		this.email = email;
		this.intezmeny = intezmeny;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getIntezmeny() {
		return intezmeny;
	}


	public void setIntezmeny(String intezmeny) {
		this.intezmeny = intezmeny;
	}


	@Override
	public String toString() {
		return "[Név=" + name + ", E-mail=" + email + ", Intézmény=" + intezmeny + "]";
	}
	
	
	

}
