package com.progescode.progescode.debour.Entity;

import lombok.Data;
import jakarta.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "debours")
public class Debour {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

  

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private Date date;
    private String Libelle;
    private int ent;
 private int sorti;
 private int BE;

    public Debour() {
    }

  
    // Getters and setters
}