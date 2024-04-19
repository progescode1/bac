package com.progescode.progescode.cabinet.Entity;

import lombok.Data;
import jakarta.persistence.*;


@Data
@Entity
@Table(name = "cabinets")
public class Cabinet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nom;

    private String prenom;

    private String mail;

    private String adr;

    private boolean type;

    private int tel;

    private String site;

    private int Mcnnssc;

    private int Mcnss;

    public Cabinet() {
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAdr() {
        return adr;
    }

    public void setAdr(String adr) {
        this.adr = adr;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public int getMcnnssc() {
        return Mcnnssc;
    }

    public void setMcnnssc(int mcnnssc) {
        Mcnnssc = mcnnssc;
    }

    public int getMcnss() {
        return Mcnss;
    }

    public void setMcnss(int mcnss) {
        Mcnss = mcnss;
    }

    public Cabinet(long id, String nom, String prenom, String mail, String adr, boolean type, int tel, String site, int Mcnnssc, int Mcnss) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.adr = adr;
        this.type = type;
        this.tel = tel;
        this.site = site;
        this.Mcnnssc = Mcnnssc;
        this.Mcnss = Mcnss;
    }

}