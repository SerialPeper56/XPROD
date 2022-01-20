package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Fournisseur")
public class Fournisseur {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="rsFour")
	private String rsFour;
	
	@Column(name="nomFour")
	private String nomFour;
	
	@Column(name="rue")
	private String rue;
	
	@Column(name="cp")
	private String cp;
	
	@Column(name="ville")
	private String ville;
	
	@Column(name="tel")
	private String tel;
	
	@Column(name="fax")
	private String fax;
	
	@Column(name="mail")
	private String mail;
	
	public Fournisseur(String rsFour, String nomFour, String rue, String cp, String ville, String tel,
			String fax, String mail) {
		super();
		this.rsFour = rsFour;
		this.nomFour = nomFour;
		this.rue = rue;
		this.cp = cp;
		this.ville = ville;
		this.tel = tel;
		this.fax = fax;
		this.mail = mail;
	}
	
	public Fournisseur(String rsFour, String nomFour) {
		super();
		this.rsFour = rsFour;
		this.nomFour = nomFour;
	}

	public Fournisseur() {
		super();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
