package com.ttrc.userservice.repository;

import com.ttrc.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {


        User getUserById(Integer userId);

       // Optional<User> findByEmail(String userEmail);
     //   Optional<User> findById(String userId);
}
