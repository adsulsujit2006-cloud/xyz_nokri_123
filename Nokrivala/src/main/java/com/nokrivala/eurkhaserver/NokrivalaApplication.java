package com.nokrivala.eurkhaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NokrivalaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NokrivalaApplication.class, args);
	}

}
