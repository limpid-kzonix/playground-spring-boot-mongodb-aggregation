package com.omniesoft.commerce.statistic.omniestatistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class OmnieStatisticApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmnieStatisticApplication.class, args);
	}

}