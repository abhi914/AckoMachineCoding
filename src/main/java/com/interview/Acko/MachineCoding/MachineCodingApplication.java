package com.interview.Acko.MachineCoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("appConfig.xml")
public class MachineCodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MachineCodingApplication.class, args);
	}

}
