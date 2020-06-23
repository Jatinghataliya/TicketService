package com.ticketservice.ticketservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.ticketservice.*"})
@EntityScan(value = "com.ticketservice.modal")
@EnableJpaRepositories(value = "com.ticketservice.dto")
public class TicketserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TicketserviceApplication.class, args);
	}

}
