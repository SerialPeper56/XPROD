package entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="LigneCmd")
public class LigneCmd  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="qte")
	private int qte;
	
	@Column(name="dateLiv")
	private String dateLiv;
	
	@Column(name="prixUHT")
	private double prixUHT;
	
	@ManyToOne(cascade= {CascadeType.PERSIST})
    @JoinColumn(name="commande_id")
	private Commande commande;
	
	public LigneCmd(int qte, String dateLiv, double prixUHT) {
		super();
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

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}
}
