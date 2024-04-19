package com.progescode.progescode.declaration.controller;

import java.util.List;

import com.progescode.progescode.declaration.entity.Declaration;
import com.progescode.progescode.declaration.service.DeclarationService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeclarationController {

    private  DeclarationService declarationService;



    @PostMapping("/declaration")
    public Declaration createDeclaration(@RequestBody Declaration d) {
        return declarationService.save(d);
    }

    @GetMapping("/declarations")
    public List<Declaration> getAllDeclarations() {
        return declarationService.getAllDeclarations();
    }

    @DeleteMapping("/declaration/{id}")
    public void deleteDeclaration(@PathVariable int id) {
        declarationService.deleteById(id);
    }

    @GetMapping("/declaration/{id}")
    public ResponseEntity<Declaration> getDeclarationById(@PathVariable int id) {
        Declaration d = declarationService.getDeclarationById(id);
        if (d == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(d);
    }

    @PutMapping("/declaration/{id}")
    public ResponseEntity<Declaration> updateDeclaration(@RequestBody Declaration d, @PathVariable int id) {
        Declaration ud = declarationService.updateDeclaration(d, id);
        if (ud == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.ok(ud);
    }
}
