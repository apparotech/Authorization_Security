package com.example.maggitest.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.maggitest.entities.User;

@Repository
public interface  UserRepository extends  CrudRepository<User, Integer> {

     //Optional<User> findByEmail(String email);
     Optional<User> findByEmail(String email);
    
}
