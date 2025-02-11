package com.example.cooperative.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "cotisation", schema = "cooperativedb")
public class Cotisation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "dateversement")
    private LocalDate dateversement;

    @Column(name = "modeversement")
    private String modeversement;

    @Column(name = "montantversement")
    private Integer montantversement;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "numeroreference")
    private String numeroreference;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateversement() {
        return dateversement;
    }

    public void setDateversement(LocalDate dateversement) {
        this.dateversement = dateversement;
    }

    public String getModeversement() {
        return modeversement;
    }

    public void setModeversement(String modeversement) {
        this.modeversement = modeversement;
    }

    public Integer getMontantversement() {
        return montantversement;
    }

    public void setMontantversement(Integer montantversement) {
        this.montantversement = montantversement;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumeroreference() {
        return numeroreference;
    }

    public void setNumeroreference(String numeroreference) {
        this.numeroreference = numeroreference;
    }

}