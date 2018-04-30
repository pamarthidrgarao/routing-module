package com.camel.routing.config;

import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class RouteConfig extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("jetty:http://localhost:8090/app").log("${body} as").removeHeaders("CamelHttp*")
				.setHeader(Exchange.HTTP_METHOD, constant("GET")).to("jetty:http://localhost:8080");

	}

}
