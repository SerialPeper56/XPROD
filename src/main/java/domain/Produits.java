package domain;

public class Produits {
	private Long id;
	private String refProduit;
	private String descriptionProduit;
	private String designationProduit;
	private double prixVenteUHTProduit;
	
	public Produits(Long id, String refProduit, String descriptionProduit, String designationProduit,
			double prixVenteUHTProduit) {
		super();
		this.id = id;
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
