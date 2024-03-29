package com.bank.loan;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
@EnableScheduling
@SpringBootApplication
public class BankApplication {
	private static final Logger logger = LoggerFactory.getLogger(BankApplication.class);

	public static void main(String[] args) {
		 logger.info("this is a info message");
	      logger.warn("this is a warn message");
	      logger.error("this is a error message");
		SpringApplication.run(BankApplication.class, args);
		
	}

}
