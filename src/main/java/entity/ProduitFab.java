package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ProduitFab")
public class ProduitFab extends Produits {
	@Column(name="nbHeureMoy")
	private double nbHeureMoy;
	
	public ProduitFab() {
		super();
	}

	public ProduitFab(double nbHeureMoy) {
		super();
		this.nbHeureMoy = nbHeureMoy;
	}

	public ProduitFab(String refProduit, String descriptionProduit, String designationProduit,
			double prixVenteUHTProduit, double nbHeureMoy) {
		super(refProduit, descriptionProduit, designationProduit, prixVenteUHTProduit);
		this.nbHeureMoy = nbHeureMoy;
	}

	public double getNbHeureMoy() {
		return nbHeureMoy;
	}

	public void setNbHeureMoy(double nbHeureMoy) {
		this.nbHeureMoy = nbHeureMoy;
	}

}
