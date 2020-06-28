package com.example.tourserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TourserverApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourserverApplication.class, args);
	}

}
