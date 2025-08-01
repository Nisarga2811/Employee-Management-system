package com.employeesystem.emsbackend.repository;

import com.employeesystem.emsbackend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
