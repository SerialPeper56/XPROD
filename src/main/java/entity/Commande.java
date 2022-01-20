package entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Commande")
public class Commande implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="dateCmd")
	private String dateCmd;
	
	@Column(name="fraisPortCmd")
	private double fraisPortCmd;
	
	@OneToMany(mappedBy="commande", fetch=FetchType.LAZY)
	private List<LigneCmd> ligneCmds = new ArrayList<LigneCmd>();	
	
	public Commande(String dateCmd, double fraisPortCmd, List<LigneCmd> ligneCmds) {
		super();
		this.dateCmd = dateCmd;
		this.fraisPortCmd = fraisPortCmd;
		this.ligneCmds = ligneCmds;
	}

	public Commande(String dateCmd, double fraisPortCmd) {
		super();
		this.dateCmd = dateCmd;
		this.fraisPortCmd = fraisPortCmd;
	}
	
	public Commande() {
		super();
	}

	public List<LigneCmd> getLigneCmds() {
		return ligneCmds;
	}

	public void setLigneCmds(List<LigneCmd> ligneCmds) {
		this.ligneCmds = ligneCmds;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDateCmd() {
		return dateCmd;
	}
	public void setDateCmd(String dateCmd) {
		this.dateCmd = dateCmd;
	}
	public double getFraisPortCmd() {
		return fraisPortCmd;
	}
	public void setFraisPortCmd(double fraisPortCmd) {
		this.fraisPortCmd = fraisPortCmd;
	}
}
