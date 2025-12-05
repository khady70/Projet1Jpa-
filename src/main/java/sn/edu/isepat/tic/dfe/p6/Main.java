package sn.edu.isepat.tic.dfe.p6;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sn.edu.isepat.tic.dfe.p6.entities.Categorie;
import sn.edu.isepat.tic.dfe.p6.entities.Produit;
import sn.edu.isepat.tic.dfe.p6.entities.Profil;
import sn.edu.isepat.tic.dfe.p6.entities.Utilisateur;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public   static void main(String[] args) {
      EntityManagerFactory emf= Persistence.createEntityManagerFactory("gestionProduitsPU");
      EntityManager em=emf.createEntityManager();









      em.getTransaction().begin();

      em.getTransaction().commit();
      em.close();
      emf.close();
    }
}
