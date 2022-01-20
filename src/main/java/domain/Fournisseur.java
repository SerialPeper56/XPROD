package domain;

public class Fournisseur {
	private int id;
	private String rsFour;
	private String nomFour;
	private String rue;
	private String cp;
	private String ville;
	private String tel;
	private String fax;
	private String mail;
	
	public Fournisseur(int id, String rsFour, String nomFour, String rue, String cp, String ville, String tel,
			String fax, String mail) {
		super();
		this.id = id;
		this.rsFour = rsFour;
		this.nomFour = nomFour;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
		this.tel = tel;
		this.fax = fax;
		this.mail = mail;
	}
	
	public Fournisseur() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRsFour() {
		return rsFour;
	}
	public void setRsFour(String rsFour) {
		this.rsFour = rsFour;
	}
	public String getNomFour() {
		return nomFour;
	}
	public void setNomFour(String nomFour) {
		this.nomFour = nomFour;
	}
	public String getRue() {
		return rue;
	}
	public void setRue(String rue) {
		this.rue = rue;
	}
	public String getCp() {
		return cp;
	}
	public void setCp(String cp) {
		this.cp = cp;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}	
}
