package com.example.MyProjectOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectOneApplication.class, args);
		String name="Vajith";
		System.out.println("Hello "+ name + ". " + goodMorning() );
	}

	private static String goodMorning() {
		return "Good Morning!!!";
	}
}
