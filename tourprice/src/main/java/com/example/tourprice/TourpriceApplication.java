package com.example.tourprice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TourpriceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TourpriceApplication.class, args);
	}

}
