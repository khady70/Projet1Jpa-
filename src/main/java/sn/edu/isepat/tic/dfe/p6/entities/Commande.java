package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Commande")
public class Commande {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private LocalDate dateCommande;

    private String statut;  // EN_ATTENTE, VALIDEE, EXPEDIEE, LIVREE

    private double montantTotal = 0;



    @ManyToMany
    @JoinTable(
            name="Commande_produit",
            joinColumns = @JoinColumn(name = "commande_id"),
            inverseJoinColumns = @JoinColumn(name = "produit_id")
    )
    private List<Produit> produits = new ArrayList<>();


    public void ajouterProduit(Produit p) {
        if (!produits.contains(p)) {
            produits.add(p);
            montantTotal += p.getPrix(); // calcul automatique
            p.getCommandes().add(this);  // bidirectionnalité
        }
    }

    // 🔥 Retirer un produit
    public void retirerProduit(Produit p) {
        if (produits.contains(p)) {
            produits.remove(p);
            montantTotal -= p.getPrix(); // mise à jour du total
            p.getCommandes().remove(this);
        }


    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(LocalDate dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(double montantTotal) {
        this.montantTotal = montantTotal;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
