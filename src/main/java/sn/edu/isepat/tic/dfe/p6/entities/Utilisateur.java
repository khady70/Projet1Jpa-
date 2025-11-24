package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
    @Id

    @GeneratedValue( strategy = GenerationType.IDENTITY)//permet d'auto_incrementer
    private Long id;

    @Column(nullable = false)
    private String nom;

    @Column(unique = true , nullable = false)
    private String email;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "profil_id")
    Profil  Profil;

    public Profil getProfil() {
        return Profil;
    }

    public void setProfil(Profil profil) {
        Profil = profil;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
