package client;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity.Approvision;
import entity.Commande;
import entity.Fournisseur;
import entity.LigneCmd;
import entity.ProduitAppro;
import entity.ProduitFab;
import entity.Produits;


public class XprodClient {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("XPRODManager"); //unité de persistance
		EntityManager em = emf.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		try {
			txn.begin();
			
			Produits prod1 = new Produits("PC", "Ordinateur Bureau", "HP", 500.00);
			Produits prod2 = new Produits("PC", "Ordinateur Bureau", "DELL", 400.00);
			Produits prod3 = new Produits("MAC", "Ordinateur Bureau", "MAC", 900.00);
			Produits prod4 = new Produits("MAC PRO", "Ordinateur Bureau", "MAC", 1500.00);
			Produits prod5 = new Produits("Tablette", "Tab1", "Samsung", 500.00);
			Produits prod6 = new Produits("Tablette", "Tab1", "Samsung", 900.00);
			Produits prod7 = new Produits("Tablette", "Tab1", "Samsung", 500.00);
			Produits prod8 = new Produits("Tablette", "Ipad", "Apple", 500.00);
			
			
			Fournisseur four1 = new Fournisseur("HP SA", "HP France");
			Fournisseur four2 = new Fournisseur("DELL SA", "DELL France");
			Fournisseur four3 = new Fournisseur("DARTY SA", "DARTY France");
			Fournisseur four4 = new Fournisseur("CARREFOUR SA", "CARREFOUR France");
			
			em.persist(four1);
			em.persist(four2);
			em.persist(four3);
			em.persist(four4);
			
			
			ProduitAppro prodA1 = new ProduitAppro("PC", "Ordinateur Bureau", "HP", 500.00, 750.00);
			ProduitAppro prodA2 = new ProduitAppro("PC", "Ordinateur Bureau", "DELL", 400.00, 750.00);
			ProduitAppro prodA3 = new ProduitAppro("MAC", "Ordinateur Bureau", "MAC", 900.00, 750.00);
			ProduitAppro prodA4 = new ProduitAppro("MAC PRO", "Ordinateur Bureau", "MAC", 1500.00, 750.00);
			
			em.persist(prodA1);
			em.persist(prodA2);
			em.persist(prodA3);
			em.persist(prodA4);
			
			
			ProduitFab prodF1 = new ProduitFab("Tablette", "Tab1", "Samsung", 500.00, 120);
			ProduitFab prodF2 = new ProduitFab("Tablette", "Tab1", "Samsung", 900.00, 120);
			ProduitFab prodF3 = new ProduitFab("Tablette", "Tab1", "Samsung", 500.00, 120);
			ProduitFab prodF4 = new ProduitFab("Tablette", "Ipad", "Apple", 500.00, 120);
			
			em.persist(prodF1);
			em.persist(prodF2);
			em.persist(prodF3);
			em.persist(prodF4);
			
			
			
			Approvision apro1 = new Approvision(500.00, "HP001");
			Approvision apro2 = new Approvision(400.00, "DELL001");
			Approvision apro3 = new Approvision(900.00, "DARTY001");
			Approvision apro4 = new Approvision(1500.00, "CARREF001");
			
			em.persist(apro1);
			em.persist(apro2);
			em.persist(apro3);
			em.persist(apro4);
			
			
			LigneCmd lCmd1 = new LigneCmd(20, "18/01/2022", 750.00);
			LigneCmd lCmd2 = new LigneCmd(30, "18/01/2022", 500.00);
			LigneCmd lCmd3 = new LigneCmd(20, "18/01/2022", 1200.00);
			LigneCmd lCmd4 = new LigneCmd(10, "18/01/2022", 1750.00);
			LigneCmd lCmd5 = new LigneCmd(20, "18/01/2022", 200.00);
			LigneCmd lCmd6 = new LigneCmd(30, "18/01/2022", 900.00);
			LigneCmd lCmd7 = new LigneCmd(20, "18/01/2022", 750.00);
			LigneCmd lCmd8 = new LigneCmd(20, "18/01/2022", 350.00);
			
			em.persist(lCmd1);
			em.persist(lCmd2);
			em.persist(lCmd3);
			em.persist(lCmd4);
			em.persist(lCmd5);
			em.persist(lCmd6);
			em.persist(lCmd7);
			em.persist(lCmd8);
			
			
			List<LigneCmd> liste1 = new ArrayList<LigneCmd>();
			liste1.add(lCmd1);
			liste1.add(lCmd2);
			Commande cmd1 = new Commande("18/01/2022", 50.00, liste1);
			List<LigneCmd> liste2 = new ArrayList<LigneCmd>();
			liste2.add(lCmd3);
			liste2.add(lCmd4);
			liste2.add(lCmd5);
			Commande cmd2 = new Commande("18/01/2022", 40.00, liste2);
			List<LigneCmd> liste3 = new ArrayList<LigneCmd>();
			liste3.add(lCmd6);
			liste3.add(lCmd7);
			liste3.add(lCmd8);
			Commande cmd3 = new Commande("18/01/2022", 70.00, liste3);
			
			em.persist(cmd1);
			em.persist(cmd2);
			em.persist(cmd3);
			

			txn.commit();
		} catch (Exception e) {
			if(txn != null) {txn.rollback();}
			e.printStackTrace();
		} finally {
			if(em != null) {
				em.close();
			}
		}
	}

}
