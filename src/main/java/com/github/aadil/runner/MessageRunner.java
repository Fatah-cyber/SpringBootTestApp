package com.github.aadil.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MessageRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		int a=10;
		System.out.println("Welcome To Spring Boot App!!"+a);

	}

}
