package domain;

public class LigneCmd {
	private Long id;
	private int qte;
	private String dateLiv;
	private double prixUHT;
	
	public LigneCmd(Long id, int qte, String dateLiv, double prixUHT) {
		super();
		this.id = id;
		this.qte = qte;
		this.dateLiv = dateLiv;
		this.prixUHT = prixUHT;
	}
	
	public LigneCmd() {
		super();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	public String getDateLiv() {
		return dateLiv;
	}
	public void setDateLiv(String dateLiv) {
		this.dateLiv = dateLiv;
	}
	public double getPrixUHT() {
		return prixUHT;
	}
	public void setPrixUHT(double prixUHT) {
		this.prixUHT = prixUHT;
	}
}
