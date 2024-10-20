package com.ratinder.SpringSecExample.repo;

import com.ratinder.SpringSecExample.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {

    Users findByUsername(String username);
}
