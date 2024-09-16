package com.kda.azure.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KdaSbAzureDemoApplication {


	@GetMapping("/hello")
	public String hellworld() {
		return "Hello from kda azure !!!! haha";
	}

	public static void main(String[] args) {
		SpringApplication.run(KdaSbAzureDemoApplication.class, args);
	}
}