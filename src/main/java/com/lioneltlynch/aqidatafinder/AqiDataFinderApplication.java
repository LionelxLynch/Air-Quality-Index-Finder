package com.lioneltlynch.aqidatafinder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AqiDataFinderApplication {
	@Autowired
	private TomcatServletWebServerFactory tomcatFactory;

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AqiDataFinderApplication.class);
		ApplicationContext ctx = SpringApplication.run(AqiDataFinderApplication.class, args);
	}
}