package no.hus.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {


	public static void main(String[] args) {
		System.out.println("notto was here again");
		SpringApplication.run(DemoApplication.class, args);
	}
}
