package com.progescode.progescode.client.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Associes")
public class Associes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private float perc;

public Associes(Long id, String libelle, float perc, Client client) {
        this.id = id;
        this.libelle = libelle;
        this.perc = perc;
        this.client = client;
    }
@ManyToOne
private Client client;
    public Associes() {
    }



}
