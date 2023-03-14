package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.KafkaListener;

import com.example.controller.AppConstants;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.controller")
public class DenemeBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DenemeBootApplication.class, args);
	}

	@KafkaListener(topics = AppConstants.TOPIC, groupId=AppConstants.GROUP_ID)
	public void listen(String message) {

		System.out.println("Received Messasge : " + message);
	}
}
