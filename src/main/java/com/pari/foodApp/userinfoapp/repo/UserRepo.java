package com.pari.foodApp.userinfoapp.repo;

import com.pari.foodApp.userinfoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User,Integer> {
}

