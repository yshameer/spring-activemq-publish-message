package com.github.yshameer.spring.activemq.publish.service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = "com.github.yshameer.spring.activemq.publish.service")
public class PublishMessageServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PublishMessageServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	}
}
