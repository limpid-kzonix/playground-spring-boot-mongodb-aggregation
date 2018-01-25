package com.omniesoft.commerce.statistic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@EnableMongoRepositories
@SpringBootApplication
public class OmnieStatisticApplication {

    public static void main(String[] args) {
        SpringApplication.run(OmnieStatisticApplication.class, args);
    }

}
