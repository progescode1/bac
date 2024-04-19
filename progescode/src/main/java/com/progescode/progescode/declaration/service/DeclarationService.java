package com.progescode.progescode.declaration.service;

import java.util.List;
import java.util.Optional;

import com.progescode.progescode.declaration.Repository.DeclarationRepository;
import com.progescode.progescode.declaration.entity.Declaration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeclarationService {

    @Autowired
    private DeclarationRepository declarationRepository;

    public Declaration save(Declaration d) {
        return declarationRepository.save(d);
    }

    public List<Declaration> getAllDeclarations() {
        return declarationRepository.findAll();
    }

    public void deleteById(int id) {
        declarationRepository.deleteById(id);
    }

    public Declaration getDeclarationById(int id) {
        return declarationRepository.findById(id).orElse(null);
    }

    public Declaration updateDeclaration(Declaration d, int id) {
        Optional<Declaration> od = declarationRepository.findById(id);
        if (od.isPresent()) {
            Declaration existingDeclaration = od.get();
            existingDeclaration.setName(d.getName());

            return declarationRepository.save(existingDeclaration);
        }
        return null;
    }
}