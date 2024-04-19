package com.progescode.progescode.declaration.Repository;

import com.progescode.progescode.declaration.entity.Declaration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeclarationRepository extends JpaRepository<Declaration, Integer> {
}