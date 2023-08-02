package com.example.in29minutes.microservices.limitsservices.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.in29minutes.microservices.limitsservices.bean.Limits;
import com.example.in29minutes.microservices.limitsservices.config.Configuration;

@RestController
public class LimitsController {

	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limits getLimits() {
//		return new Limits(1,999);
		return new Limits(configuration.getMinimum(),configuration.getMaximum());
	}
}
