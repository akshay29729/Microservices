package com.example.in29minutes.microservices.currancyexchange.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CurrancyExchange {

	@Id
	private Long id;
	
	@Column(name="currancy_from")
	private String from;
	
	@Column(name="currancy_to")
	private String to;
	private BigDecimal conversionMultiple;
	private String environment;
	
	public CurrancyExchange() {
		super();
	}
	
	public CurrancyExchange(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getFrom() {
		return from;
	}
	
	public void setFrom(String from) {
		this.from = from;
	}
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
}
