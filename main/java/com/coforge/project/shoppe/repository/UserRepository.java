package com.coforge.project.shoppe.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.coforge.project.shoppe.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Optional custom query examples if needed
    User findByEmail(String email);
    boolean existsByEmail(String email);
}
