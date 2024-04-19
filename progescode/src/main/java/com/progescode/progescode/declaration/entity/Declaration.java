package com.progescode.progescode.declaration.entity;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "declarations")
public class Declaration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String adr;
    private String activite;


    public Declaration() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

 
    

    // Getters and setters
}