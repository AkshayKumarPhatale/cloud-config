package com.accenture.empportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class CloudConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudConfigApplication.class, args);
	}

}
