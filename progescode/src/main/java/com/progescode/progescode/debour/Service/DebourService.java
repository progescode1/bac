package com.progescode.progescode.debour.Service;

import java.util.List;
import java.util.Optional;

import com.progescode.progescode.debour.Entity.Debour;
import com.progescode.progescode.debour.Repository.DebourRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DebourService {

    @Autowired
    private DebourRepository debourRepository;

    public Debour save(Debour d) {
        return debourRepository.save(d);
    }

    public List<Debour> getAllDebours() {
        return debourRepository.findAll();
    }

    public void deleteById(int id) {
        debourRepository.deleteById(id);
    }

    public Debour getDebourById(int id) {
        return debourRepository.findById(id).orElse(null);
    }

    public Debour updateDebour(Debour d, int id) {
        Optional<Debour> od = debourRepository.findById(id);
        if (od.isPresent()) {
            Debour existingDebour = od.get();
            existingDebour.setBE(d.getBE());
            existingDebour.setDate(d.getDate());
            existingDebour.setEnt(d.getEnt());
            existingDebour.setLibelle(d.getLibelle());
            existingDebour.setSorti(d.getSorti());

            return debourRepository.save(existingDebour);
        }
        return null;
    }
}