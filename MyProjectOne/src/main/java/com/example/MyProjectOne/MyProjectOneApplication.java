package com.example.MyProjectOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyProjectOneApplication.class, args);
		String fName="Vajith";
		String sName="Chamuditha";
		System.out.println("Hello "+ fName + " " + sName + welcome() + ". " + goodMorning() );
	}

	private static String goodMorning() {
		return "Good Morning!!!";
	}

	private static String welcome() {
		return "Welcome bhaai.";
	}
}
