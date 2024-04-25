package com.example.springboot8;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.springboot8.model.BirthRepository;
import com.example.springboot8.model.BirthService;

@SpringBootApplication
public class Springboot8Application implements CommandLineRunner {
	
	@Autowired
	BirthService birth;

	public static void main(String[] args) {
		SpringApplication.run(Springboot8Application.class, args);
	}

	@Override
	
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
