package com.durain.playercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PlayerCenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlayerCenterApplication.class, args);
	}
}
