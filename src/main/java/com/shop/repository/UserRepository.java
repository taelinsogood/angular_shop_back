package com.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shop.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	public User findByEmail(String email);
}
