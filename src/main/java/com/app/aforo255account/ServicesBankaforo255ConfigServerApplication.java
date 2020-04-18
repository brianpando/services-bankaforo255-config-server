package com.app.aforo255account;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ServicesBankaforo255ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicesBankaforo255ConfigServerApplication.class, args);
	}

}
