package com.progescode.progescode.cabinet.Repository;

import com.progescode.progescode.cabinet.Entity.Cabinet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CabinetRepository extends JpaRepository<Cabinet, Long> {
}