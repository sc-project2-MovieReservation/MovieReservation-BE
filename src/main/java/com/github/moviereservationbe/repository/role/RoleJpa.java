package com.github.moviereservationbe.repository.role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleJpa extends JpaRepository<Role, Integer> {
}
햣