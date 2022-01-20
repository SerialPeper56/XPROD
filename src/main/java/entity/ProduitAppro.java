package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ProduitAppro")
public class ProduitAppro extends Produits {
	@Column(name="prixAchatUHT")
	private double prixAchatUHT;
	

	public ProduitAppro(double prixAchatUHT) {
		super();
		this.prixAchatUHT = prixAchatUHT;
	}



	public ProduitAppro(String refProduit, String descriptionProduit, String designationProduit,
			double prixVenteUHTProduit, double prixAchatUHT) {
		super(refProduit, descriptionProduit, designationProduit, prixVenteUHTProduit);
		this.prixAchatUHT = prixAchatUHT;
	}



	public ProduitAppro() {
		super();
	}

	public double getPrixAchatUHT() {
		return prixAchatUHT;
	}

	public void setPrixAchatUHT(double prixAchatUHT) {
		this.prixAchatUHT = prixAchatUHT;
	}
}
