package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Approvision")
public class Approvision {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="prixFour")
	private double prixFour;
	
	@Column(name="refExtFour")
	private String refExtFour;
	
	public Approvision(double prixFour, String refExtFour) {
		super();
		this.prixFour = prixFour;
		this.refExtFour = refExtFour;
	}
	
	public Approvision() {
		super();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public double getPrixFour() {
		return prixFour;
	}
	public void setPrixFour(double prixFour) {
		this.prixFour = prixFour;
	}
	public String getRefExtFour() {
		return refExtFour;
	}
	public void setRefExtFour(String refExtFour) {
		this.refExtFour = refExtFour;
	}
}
