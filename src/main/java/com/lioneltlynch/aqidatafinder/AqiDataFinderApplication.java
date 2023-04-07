package com.lioneltlynch.aqidatafinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class AqiDataFinderApplication {
	public static void main(String[] args) {SpringApplication.run(AqiDataFinderApplication.class, args);
	}
}