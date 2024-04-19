package com.progescode.progescode.facture.service;

import java.util.List;
import java.util.Optional;

import com.progescode.progescode.facture.Entity.Facture;
import com.progescode.progescode.facture.Repository.FactureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactureService {

    @Autowired
    private FactureRepository factureRepository;

    public Facture save(Facture f) {
        return factureRepository.save(f);
    }

    public List<Facture> getAllFactures() {
        return factureRepository.findAll();
    }

    public void deleteById(int id) {
        factureRepository.deleteById(id);
    }

    public Facture getFactureById(int id) {
        return factureRepository.findById(id).orElse(null);
    }

    public Facture updateFacture(Facture f, int id) {
        Optional<Facture> of = factureRepository.findById(id);
        if (of.isPresent()) {
            Facture existingFacture = of.get();
            existingFacture.setBanque(f.getBanque());
            existingFacture.setService(f.getService());
            existingFacture.setDate(f.getDate());
           
            existingFacture.setPrixUnitaire(f.getPrixUnitaire());
            existingFacture.setTotal(f.getTotal());

            return factureRepository.save(existingFacture);
        }
        return null;
    }
}