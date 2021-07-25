package com.elon;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class})
public class Swagger3Application {
    private static final Logger LOGGER = LogManager.getLogger(Swagger3Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Swagger3Application.class);
        LOGGER.info("Start swagger3 application success.");
    }
}
