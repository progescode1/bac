package com.progescode.progescode.cabinet.controller;

import java.util.List;

import com.progescode.progescode.cabinet.Entity.Cabinet;
import com.progescode.progescode.cabinet.service.CabinetService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CabinetController {

    private  CabinetService cabinetService;


    @PostMapping("/cabinet")
    public Cabinet createCabinet(@RequestBody Cabinet c) {
        return cabinetService.save(c);
    }

    @GetMapping("/cabinets")
    public List<Cabinet> getAllCabinets() {
        return cabinetService.getAllCabinets();
    }

    @DeleteMapping("/cabinet/{id}")
    public void deleteCabinet(@PathVariable long id) {
        cabinetService.deleteById(id);
    }

    @GetMapping("/cabinet/{id}")
    public ResponseEntity<Cabinet> getCabinetById(@PathVariable long id) {
        Cabinet c = cabinetService.getCabinetById(id);
        if (c == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(c);
    }

    @PutMapping("/cabinet/{id}")
    public ResponseEntity<Cabinet> updateCabinet(@RequestBody Cabinet c, @PathVariable long id) {
        Cabinet uc = cabinetService.updateCabinet(c, id);
        if (uc == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.ok(uc);
    }
}