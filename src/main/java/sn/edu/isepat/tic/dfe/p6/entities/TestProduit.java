package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TestProduit {
    public static void main(String[] args){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Projet1PU");
        EntityManager em=emf.createEntityManager();

        em.getTransaction().begin();

        Categorie electronique = new Categorie();
        electronique.setNom("Électronique");
        electronique.setDescription("Appareils high-tech");

        Produit p1 = new Produit();
        p1.setNom("Laptop HP");
        p1.setPrix(899.99);
        p1.setStock(15);

        Produit p2 = new Produit();
        p2.setNom("Laptop HP");
        p2.setPrix(899.99);
        p2.setStock(15);

        Produit p3 = new Produit();
        p3.setNom("Laptop HP");
        p3.setPrix(899.99);
        p3.setStock(15);

        electronique.ajouterProduit(p1);
        electronique.ajouterProduit(p2);
        electronique.ajouterProduit(p3);

        em.persist(electronique);




        em.getTransaction().commit();



        em.close();
        emf.close();
    }
}
