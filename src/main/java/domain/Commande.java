package domain;

import java.util.ArrayList;
import java.util.List;

public class Commande {
	private Long id;
	private String dateCmd;
	private double fraisPortCmd;
	
	private List<LigneCmd> ligneCmds = new ArrayList<LigneCmd>();	
	
	public Commande(Long id, String dateCmd, double fraisPortCmd, List<LigneCmd> ligneCmds) {
		super();
		this.id = id;
		this.dateCmd = dateCmd;
		this.fraisPortCmd = fraisPortCmd;
		this.ligneCmds = ligneCmds;
	}

	public Commande(Long id, String dateCmd, double fraisPortCmd) {
		super();
		this.id = id;
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
