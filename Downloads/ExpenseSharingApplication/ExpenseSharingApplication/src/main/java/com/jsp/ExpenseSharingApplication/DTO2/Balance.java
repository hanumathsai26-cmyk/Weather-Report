package com.jsp.ExpenseSharingApplication.DTO2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "balances")
public class Balance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int balanceId;
	private int userId;
	private int owesToUserId;
	private double amount;

	public int getBalanceId() {
		return balanceId;
	}
	public void setBalanceId(int balanceId) {
		this.balanceId = balanceId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getOwesToUserId() {
		return owesToUserId;
	}
	public void setOwesToUserId(int owesToUserId) {
		this.owesToUserId = owesToUserId;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}

