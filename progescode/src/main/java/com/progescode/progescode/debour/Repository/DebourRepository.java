package com.progescode.progescode.debour.Repository;

import com.progescode.progescode.debour.Entity.Debour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DebourRepository extends JpaRepository<Debour, Integer> {
}