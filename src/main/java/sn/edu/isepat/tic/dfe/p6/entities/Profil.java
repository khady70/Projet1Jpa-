package sn.edu.isepat.tic.dfe.p6.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Profil {
    private long id;
    private String bio;
    private String telephone;
    private String photo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
