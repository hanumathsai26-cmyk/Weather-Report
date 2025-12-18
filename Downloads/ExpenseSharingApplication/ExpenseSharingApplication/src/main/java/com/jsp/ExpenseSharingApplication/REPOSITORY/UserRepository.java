package com.jsp.ExpenseSharingApplication.REPOSITORY;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ExpenseSharingApplication.DTO.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
