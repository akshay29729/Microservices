package com.example.in29minutes.microservices.currancyconversion.invoking;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.in29minutes.microservices.currancyconversion.bean.CurrancyConversion;

//@FeignClient(name="currency-exchange", url="localhost:8000")
@FeignClient(name="currency-exchange")
public interface CurrancyExchangeProxy {
	
	@GetMapping("/currancy-exchange/from/{from}/to/{to}")
	public CurrancyConversion retrieveExchangeValue(
			@PathVariable("from") String from,
			@PathVariable("to") String to);

}
