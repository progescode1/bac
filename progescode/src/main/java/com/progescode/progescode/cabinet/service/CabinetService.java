package com.progescode.progescode.cabinet.service;

import java.util.List;
import java.util.Optional;

import com.progescode.progescode.cabinet.Entity.Cabinet;
import com.progescode.progescode.cabinet.Repository.CabinetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CabinetService {

    @Autowired
    private CabinetRepository cabinetRepository;

    public Cabinet save(Cabinet c) {
        return cabinetRepository.save(c);
    }

    public List<Cabinet> getAllCabinets() {
        return cabinetRepository.findAll();
    }

    public void deleteById(long id) {
        cabinetRepository.deleteById(id);
    }

    public Cabinet getCabinetById(long id) {
        return cabinetRepository.findById(id).orElse(null);
    }

    public Cabinet updateCabinet(Cabinet c, long id) {
        Optional<Cabinet> oc = cabinetRepository.findById(id);
        if (oc.isPresent()) {
            Cabinet existingCabinet = oc.get();
            existingCabinet.setNom(c.getNom());
            existingCabinet.setPrenom(c.getPrenom());
            existingCabinet.setMail(c.getMail());
            existingCabinet.setAdr(c.getAdr());
            existingCabinet.setType(c.isType());
            existingCabinet.setTel(c.getTel());
            existingCabinet.setSite(c.getSite());
            existingCabinet.setMcnnssc(c.getMcnnssc());
            existingCabinet.setMcnss(c.getMcnss());

            return cabinetRepository.save(existingCabinet);
        }
        return null;
    }
}