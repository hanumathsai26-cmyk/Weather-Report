package com.jsp.ExpenseSharingApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "ExpenseSharingApplication")
public class ExpenseSharingApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExpenseSharingApplication.class, args);
	}

}
