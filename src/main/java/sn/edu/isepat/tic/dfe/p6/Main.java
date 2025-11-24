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


      Utilisateur user=new Utilisateur();
      user.setId(1);
      user.setNom("khady");
      user.setEmail("khady@mail.com");



      Profil profil = new Profil();
      profil.setId(2);
      profil.setBio("se connecter");
      profil.setTelephone("7x xxx xx xx");
      profil.setPhoto("image");

     Categorie electronique = new Categorie();
     electronique.setNom("Électronique");
     electronique.setDescription("Appareils high-tech");


      Produit p1 = new Produit();
      p1.setNom("Laptop HP");
      p1.setPrix(899.99);
      p1.setStock( 15);
      Produit p2 = new Produit();
      p2.setNom("Souris sans fil");
      p2.setPrix(29.99);
      p2.setStock(50);

      Produit p3 = new Produit();
      p3.setNom("Clavier mecanique");
      p3.setPrix(149.99);
      p3.setStock(20);







      user.setProfil(profil);




      em.getTransaction().begin();
      em.persist(user);

      em.persist(electronique);
      em.persist(p1);
      em.persist(p2);
      em.persist(p3);



      em.persist(electronique);

      em.getTransaction().commit();
      em.close();
      emf.close();
    }
}
