package com.example.basic_auth.repository;

import com.example.basic_auth.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailsRepository extends JpaRepository<Users,Long> {


    Optional<Users> findByName(String name);

}
