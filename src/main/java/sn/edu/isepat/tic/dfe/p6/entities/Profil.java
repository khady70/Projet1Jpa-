package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Profil {
    private long id;
    private String bio;
    private String telephone;
    private String photo;
}
