package com.progescode.progescode.client.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "regime")
public class Regime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;

    public Regime(Long id, String libelle, Client client) {
        this.id = id;
        this.libelle = libelle;
        this.client = client;
    }
    public Regime() {
    }
    @ManyToOne
private Client client;
    
}
