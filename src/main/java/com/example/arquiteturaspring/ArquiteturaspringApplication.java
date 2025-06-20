package com.example.arquiteturaspring;

import org.springframework.boot.Banner.Mode;
// import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class ArquiteturaspringApplication {

	public static void main(String[] args) {
		// SpringApplication.run(ArquiteturaspringApplication.class, args);
		SpringApplicationBuilder builder = new SpringApplicationBuilder(ArquiteturaspringApplication.class);
		builder.run(args);
		
		builder.bannerMode(Mode.OFF);
		builder.profiles("production"); // não é o ideal
		builder.properties("spring-datasource-url=jdbc://"); // não é o ideal

		ConfigurableApplicationContext context = builder.context();
		
		// var productRepository = context.getBean("productRepository");
		
		ConfigurableEnvironment environment = context.getEnvironment();
		String appName = environment.getProperty("spring.application.name");
		System.out.println("Nome da aplicação: " + appName);
	}

}
