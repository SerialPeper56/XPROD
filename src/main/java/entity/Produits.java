package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="produits")
@Inheritance(strategy=InheritanceType.JOINED)
public class Produits {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="refproduit")
	private String refProduit;
	
	@Column(name="descriptionProduit")
	private String descriptionProduit;
	
	@Column(name="designationProduit")
	private String designationProduit;
	
	@Column(name="prixVenteUHTProduit")
	private double prixVenteUHTProduit;
	
	public Produits(String refProduit, String descriptionProduit, String designationProduit,
			double prixVenteUHTProduit) {
		super();
		this.refProduit = refProduit;
		this.descriptionProduit = descriptionProduit;
		this.designationProduit = designationProduit;
		this.prixVenteUHTProduit = prixVenteUHTProduit;
	}

	public Produits() {
		super();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getRefProduit() {
		return refProduit;
	}
	public void setRefProduit(String refProduit) {
		this.refProduit = refProduit;
	}
	public String getDescriptionProduit() {
		return descriptionProduit;
	}
	public void setDescriptionProduit(String descriptionProduit) {
		this.descriptionProduit = descriptionProduit;
	}
	public String getDesignationProduit() {
		return designationProduit;
	}
	public void setDesignationProduit(String designationProduit) {
		this.designationProduit = designationProduit;
	}
	public double getPrixVenteUHTProduit() {
		return prixVenteUHTProduit;
	}
	public void setPrixVenteUHTProduit(double prixVenteUHTProduit) {
		this.prixVenteUHTProduit = prixVenteUHTProduit;
	}
}
