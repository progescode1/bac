package com.progescode.progescode.debour.controller;

import java.util.List;

import com.progescode.progescode.debour.Entity.Debour;
import com.progescode.progescode.debour.Service.DebourService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api")
public class DebourController {

    private  DebourService debourService;


    @PostMapping("/debour")
    public Debour createDebour(@RequestBody Debour d) {
        return debourService.save(d);
    }

    @GetMapping("/debours")
    public List<Debour> getAllDebours() {
        return debourService.getAllDebours();
    }

    @DeleteMapping("/debour/{id}")
    public void deleteDebour(@PathVariable int id) {
        debourService.deleteById(id);
    }

    @GetMapping("/debour/{id}")
    public ResponseEntity<Debour> getDebourById(@PathVariable int id) {
        Debour d = debourService.getDebourById(id);
        if (d == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(d);
    }

    @PutMapping("/debour/{id}")
    public ResponseEntity<Debour> updateDebour(@RequestBody Debour d, @PathVariable int id) {
        Debour ud = debourService.updateDebour(d, id);
        if (ud == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        return ResponseEntity.ok(ud);
    }
}
