package com.jsp.ExpenseSharingApplication.REPOSITORY2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ExpenseSharingApplication.DTO2.Balance;

public interface BalanceRepository extends JpaRepository<Balance, Integer> {
	
}
