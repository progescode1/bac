package com.progescode.progescode.facture.controller;

import java.util.List;

import com.progescode.progescode.facture.Entity.Facture;
import com.progescode.progescode.facture.service.FactureService;

import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RequiredArgsConstructor
@RestController
@RequestMapping("/api")
public class FactureController {
    @Autowired
    private  FactureService factureService;



    @PostMapping("/facture")
    public Facture createFacture(@RequestBody Facture f) {
        return factureService.save(f);
    }

    @GetMapping("/factures")
    public List<Facture> getAllFactures() {
        return factureService.getAllFactures();
    }

    @DeleteMapping("/facture/{id}")
    public void deleteFacture(@PathVariable int id) {
        factureService.deleteById(id);
    }

    @GetMapping("/facture/{id}")
    public ResponseEntity<Facture> getFactureById(@PathVariable int id) {
        Facture f = factureService.getFactureById(id);
        if (f == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(f);
    }

    @PutMapping("/facture/{id}")
    public ResponseEntity<Facture> updateFacture(@RequestBody Facture f, @PathVariable int id) {
        Facture uf = factureService.updateFacture(f, id);
        if (uf == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.ok(uf);
    }
}
