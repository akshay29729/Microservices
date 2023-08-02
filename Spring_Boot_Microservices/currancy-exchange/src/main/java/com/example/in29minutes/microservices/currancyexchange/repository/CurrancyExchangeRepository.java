package com.example.in29minutes.microservices.currancyexchange.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.in29minutes.microservices.currancyexchange.bean.CurrancyExchange;

public interface CurrancyExchangeRepository extends JpaRepository<CurrancyExchange, Long> {

	CurrancyExchange findByFromAndTo(String from,String to);
}
