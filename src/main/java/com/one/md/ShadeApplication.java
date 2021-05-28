package com.one.md;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ShadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShadeApplication.class, args);
	}

}
