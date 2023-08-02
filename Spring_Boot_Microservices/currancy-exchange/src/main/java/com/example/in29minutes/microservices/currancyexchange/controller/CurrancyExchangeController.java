package com.example.in29minutes.microservices.currancyexchange.controller;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.core.env.Environment;

import com.example.in29minutes.microservices.currancyexchange.bean.CurrancyExchange;
import com.example.in29minutes.microservices.currancyexchange.repository.CurrancyExchangeRepository;

@RestController
public class CurrancyExchangeController {

	@Autowired
	private Environment environment;
	
	@Autowired
	private CurrancyExchangeRepository repository;
	
	@GetMapping("/currancy-exchange/from/{from}/to/{to}")
	public CurrancyExchange getCurrancyExchange(@PathVariable String from,@PathVariable String to) {
		CurrancyExchange ce = repository.findByFromAndTo(from, to);
		if(ce==null) {
			throw new RuntimeException("Unable to find data for "+ from + "to "+to);
		}
		
		String port = environment.getProperty("local-server-port");
		ce.setEnvironment(port);
		return ce;
	}
}
