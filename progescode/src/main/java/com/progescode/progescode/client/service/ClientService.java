package com.progescode.progescode.client.service;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.progescode.progescode.client.Entity.Client;
import com.progescode.progescode.client.Repository.ClientRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ClientService {

    

    @Autowired
	private ClientRepository clientRepository; 
	
	public Client save(Client c) { 
		return clientRepository.save(c); 

	}
    public List<Client> getAllClients(){ 
		return clientRepository.findAll(); 
	}
	
	public void deleteById(long id) { 
		clientRepository.deleteById(id); 
	}
    public Client getClientById(long id) { 
		return clientRepository.findById(id).orElse(null); 
	}

    public Client updateClient(Client c, long id) {
        Optional<Client> oc = clientRepository.findById(id);
        if (oc.isPresent()) {
            Client existingClient = oc.get();
           existingClient.setCode(c.getCode());
            existingClient.setMcnss(c.getMcnss());
            existingClient.setRib(c.getRib());
            existingClient.setNom(c.getNom());
            existingClient.setPrenom(c.getPrenom());
            existingClient.setTel(c.getTel());
            existingClient.setAdr(c.getAdr());
            existingClient.setMail(c.getMail());
            existingClient.setAve(c.isAve());
            existingClient.setImpo(c.isImpo());
            existingClient.setCloture(c.getCloture());
            existingClient.setAssocies(c.getAssocies());
            existingClient.setAvantage(c.getAvantage());
            existingClient.setRegime(c.getRegime());
            
            return clientRepository.save(existingClient);
        }
        return null;
    }
    
}
