package com.codewhisper.demo.repository;

//repository for user with findById, findByUsername and findByName

import com.codewhisper.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
    User findByUsername(String username);
    User findByName(String name);
}