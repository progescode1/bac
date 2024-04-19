package com.progescode.progescode.client.Entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "clients")
public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private int code;
    private int mcnss;
    private int rib;
    private String nom;
    private String prenom;
    private int tel;
    private String adr;
    private String mail;
    private boolean ave;
    private boolean impo;
    private String cloture;
    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List <Associes> associes;
   @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
private List <Avantage> avantage;
@OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
private List <Regime> regime;
    public Client() {
    }
    public Client(Long id, int code, int mcnss, int rib, String nom, String prenom, int tel, String adr, String mail,
            boolean ave, boolean impo, String cloture, List<Associes> associes,
            List<Avantage> avantage, List<Regime> regime) {
        this.id = id;
        this.code = code;
        this.mcnss = mcnss;
        this.rib = rib;
        this.nom = nom;
        this.prenom = prenom;
        this.tel = tel;
        this.adr = adr;
        this.mail = mail;
        this.ave = ave;
        this.impo = impo;
        this.cloture = cloture;
        this.associes = associes;
        this.avantage = avantage;
        this.regime = regime;
    }
   
 
    
}
