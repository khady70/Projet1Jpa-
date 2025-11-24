package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.Entity;

@Entity
public class Produit {
    private Long id;
    private String nom;
    private double prix;
    private int stock;
}
