package com.example.in29minutes.microservices.currancyexchange.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.github.resilience4j.ratelimiter.annotation.RateLimiter;
import io.github.resilience4j.retry.annotation.Retry;

@RestController
public class CircuitBreakerController {

	// 1
//	@GetMapping("sample-api")
//	public String  sampleApi() {
//		return "Sample Api";
//	}
	
	private Logger logger = 
			LoggerFactory.getLogger(CircuitBreakerController.class);
	// 2
//	@Retry(name="default",fallbackMethod = "hardcodedResponse")
//	@GetMapping("/sample-api")
//	public String sampleApi() {
//		logger.info("Sample api call received");
//		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url", 
//					String.class);
//		return forEntity.getBody();
//	}
	
	// 3
//	@Retry(name="sample-api",fallbackMethod = "hardcodedResponse")
//	@GetMapping("/sample-api")
//	public String sampleApi() {
//		logger.info("Sample api call received");
//		ResponseEntity<String> forEntity = new RestTemplate().getForEntity("http://localhost:8080/some-dummy-url", 
//					String.class);
//		return forEntity.getBody();
//	}
	
	@RateLimiter(name="default")
	@GetMapping("/sample-api")
	public String sampleApi() {
		return "Sample-Api";			
	}
	public String hardcodedResponse(Exception ex) {
		return "fallback-response";
	}
	
}
