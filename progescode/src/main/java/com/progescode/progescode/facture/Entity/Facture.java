package com.progescode.progescode.facture.Entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "factures")
public class Facture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String banque;

    private String service;

    private Date date;

 private String mode;
    private String stationclt;

    private String moyen;

    private int rib;

    private float PrixUnitaire;

    private float Total;

    public Facture() {
    }

    public Facture(int id, String banque, String service, Date date, String mode, String stationclt, String moyen,
            int rib, float prixUnitaire, float total) {
        this.id = id;
        this.banque = banque;
        this.service = service;
        this.date = date;
        this.mode = mode;
        this.stationclt = stationclt;
        this.moyen = moyen;
        this.rib = rib;
        PrixUnitaire = prixUnitaire;
        Total = total;
    }



    // Getters and setters
}