package sn.edu.isepat.tic.dfe.p6;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import sn.edu.isepat.tic.dfe.p6.entities.Profil;
import sn.edu.isepat.tic.dfe.p6.entities.Utilisateur;

public class TestAutoincremente {
    public static void main(String[] args){
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Projet1PU");
        EntityManager em=emf.createEntityManager();



        em.getTransaction().begin();
        Utilisateur u1=new Utilisateur();
        u1.setNom("khady");
        u1.setEmail("khady@mail.com");
        em.persist(u1);

        Profil p1=new Profil();
        p1.setBio("Directrice");
        p1.setTelephone("77 xxx xx xx");
        p1.setPhoto("image.jpg");
        u1.setProfil(p1);
        //quand on enregistre u1 ona plus besoin d'enregistrer p1 grace a CascadeType.ALL
        em.persist(u1);

        Utilisateur u2=new Utilisateur();
        u2.setNom("Astou");
        u2.setEmail("astou@mail.com");
        em.persist(u2);
        em.remove(u1);//supprime l'entitie dans la base
        em.getTransaction().commit();



        em.close();
        emf.close();
    }
}
