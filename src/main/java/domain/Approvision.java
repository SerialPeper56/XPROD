package domain;

public class Approvision {
	private Long id;
	private double prixFour;
	private String refExtFour;
	
	public Approvision(Long id, double prixFour, String refExtFour) {
		super();
		this.id = id;
		this.prixFour = prixFour;
		this.refExtFour = refExtFour;
	}
	
	public Approvision() {
		super();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getPrixFour() {
		return prixFour;
	}
	public void setPrixFour(double prixFour) {
		this.prixFour = prixFour;
	}
	public String getRefExtFour() {
		return refExtFour;
	}
	public void setRefExtFour(String refExtFour) {
		this.refExtFour = refExtFour;
	}
}
