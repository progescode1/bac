package com.progescode.progescode.client.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.progescode.progescode.client.Entity.Client;
@Repository

public interface ClientRepository extends JpaRepository<Client,Long> {

}
