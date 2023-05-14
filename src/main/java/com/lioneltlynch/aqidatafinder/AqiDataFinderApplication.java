package com.lioneltlynch.aqidatafinder;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AqiDataFinderApplication {
	@Autowired
	private TomcatServletWebServerFactory tomcatFactory;

	@Bean
	public Dotenv dotenv() {
		return Dotenv.configure().load();
	}

	public static void main(String[] args) {
		// Load environment variables from .env file
		Dotenv dotenv = Dotenv.configure().load();

		// Set the environment variables as system properties
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

		// Run Spring boot app
		SpringApplication.run(AqiDataFinderApplication.class, args);
	}
}
