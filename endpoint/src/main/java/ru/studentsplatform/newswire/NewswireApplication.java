package ru.studentsplatform.newswire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"ru.studentsplatform.*"})
@EntityScan(basePackages = {"ru.studentsplatform.entities.*"})
@EnableDiscoveryClient
public class NewswireApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewswireApplication.class, args);
	}

}
