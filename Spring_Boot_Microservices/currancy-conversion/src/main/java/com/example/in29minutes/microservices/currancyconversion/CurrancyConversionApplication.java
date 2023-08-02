package com.example.in29minutes.microservices.currancyconversion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CurrancyConversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrancyConversionApplication.class, args);
	}

}
