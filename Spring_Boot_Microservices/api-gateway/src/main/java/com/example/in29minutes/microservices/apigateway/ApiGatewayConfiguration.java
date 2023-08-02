package com.example.in29minutes.microservices.apigateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiGatewayConfiguration {
	
	@Bean
	public RouteLocator gatewayRouter(RouteLocatorBuilder builder) {
		return builder.routes()
				.route(p -> p
						.path("/get")
						.filters(f -> f
								.addRequestHeader("MyHeader", "MyURI")
								.addRequestParameter("Param", "MyValue"))
						.uri("http://httpbin.org:80"))
				.route(p -> p.path("/currancy-exchange/**")
						.uri("lb://currancy-exchange"))
				.route(p -> p.path("/currancy-conversion/**")
						.uri("lb://currancy-conversion"))
				.route(p -> p.path("/currancy-conversion-feign/**")
						.uri("lb://currancy-conversion"))
				.route(p -> p.path("/currancy-conversion-new/**")
						.filters(f -> f.rewritePath(
								"/currancy-conversion-new/(?<segment>.*)", 
								"/currancy-conversion/${segment}"))
						.uri("lb://currancy-conversion"))
				.build();
	}

}
