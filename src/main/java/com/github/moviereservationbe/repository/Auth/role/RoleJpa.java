package com.github.moviereservationbe.repository.Auth.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleJpa extends JpaRepository<Role, Integer> {
    Role findByName(String roleUser);
}