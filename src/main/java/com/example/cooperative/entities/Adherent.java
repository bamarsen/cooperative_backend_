package com.example.cooperative.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "adherent")
public class Adherent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "id",  nullable = false)

    private String nom;
    @Column (name = "nom")

    private String prenom;
    @Column (name = "prenom")

    private String adresse;
    @Column (name = "adresse")

    private String telephone;
    @Column (name = "telephone")

    private String cni;
    @Column (name = "cni")

    private String service;
    @Column (name = "service")

    private String matricule;
    @Column (name = "matricule")

    private String datenaissance;
    @Column (name = "datenaissance")

    private String lieunaissance;
    @Column (name = "lieunaissance")

    @ManyToMany(fetch = FetchType.EAGER)
    List<Adherent> adherents;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCni() {
        return cni;
    }

    public void setCni(String cni) {
        this.cni = cni;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getDatenaissance() {
        return datenaissance;
    }

    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

    public String getLieunaissance() {
        return lieunaissance;
    }

    public void setLieunaissance(String lieunaissance) {
        this.lieunaissance = lieunaissance;
    }
}
