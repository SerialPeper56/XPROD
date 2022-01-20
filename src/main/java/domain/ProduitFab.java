package domain;

public class ProduitFab extends Produits {
	private double nbHeureMoy;

	public ProduitFab() {
		super();
	}

	public ProduitFab(double nbHeureMoy) {
		super();
		this.nbHeureMoy = nbHeureMoy;
	}

	public double getNbHeureMoy() {
		return nbHeureMoy;
	}

	public void setNbHeureMoy(double nbHeureMoy) {
		this.nbHeureMoy = nbHeureMoy;
	}
}
