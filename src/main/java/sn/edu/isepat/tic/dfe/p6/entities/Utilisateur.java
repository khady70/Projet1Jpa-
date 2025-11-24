package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Utilisateur {
    private long id;
    private String nom;
    private String email;
}
