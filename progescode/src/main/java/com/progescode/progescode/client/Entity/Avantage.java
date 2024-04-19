package com.progescode.progescode.client.Entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "avantage")
public class Avantage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    public Avantage() {
    }
    @ManyToOne
private Client client;
	public Avantage(Long id, String libelle, Client client) {
		this.id = id;
		this.libelle = libelle;
		this.client = client;
	}
	

}
