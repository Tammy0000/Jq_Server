package com.jq.jq_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
@EnableConfigurationProperties
public class JqServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(JqServerApplication.class, args);
	}
}
