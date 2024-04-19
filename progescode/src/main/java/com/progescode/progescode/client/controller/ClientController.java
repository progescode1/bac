package com.progescode.progescode.client.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.progescode.progescode.client.Entity.Client;
import com.progescode.progescode.client.service.ClientService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping ("/api")
@RequiredArgsConstructor
public class ClientController {
private final ClientService s;
@PostMapping("/client")
public  Client CreatClient (@RequestBody Client c ){
    return s.save(c);
}
@GetMapping("/clients") 
public List<Client> getAllClients() {
    return s.getAllClients();
}
@DeleteMapping("/client/{id}")
public void DeletClient(@PathVariable long id){
    s.deleteById(id);
}
@GetMapping("/client/{id}")
public ResponseEntity<Client> getClientById(@PathVariable long id) {
    Client c = s.getClientById(id);
    if (c == null) {
        return ResponseEntity.notFound().build();
    }
    return ResponseEntity.ok(c);
}
@PutMapping("/client/{id}")
public ResponseEntity<Client> UpdateClinet(@RequestBody Client c,@PathVariable long id) {
Client uc = s.updateClient(c, id);
if(uc == null) return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
return ResponseEntity.ok(uc);


}
}


