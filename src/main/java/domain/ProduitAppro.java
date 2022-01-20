package domain;

public class ProduitAppro extends Produits {
	private double prixAchatUHT;

	
	public ProduitAppro(double prixAchatUHT) {
		super();
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
