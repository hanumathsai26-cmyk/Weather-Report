package com.jsp.ExpenseSharingApplication.REPOSITORY1;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.ExpenseSharingApplication.DTO1.Expense;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
