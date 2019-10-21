package com.example.AtmTransaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.example.AtmTransaction.repository")
@SpringBootApplication
public class AtmTransactionApplication {

	public static void main(String[] args) {
		SpringApplication.run(AtmTransactionApplication.class, args);
	}
}
