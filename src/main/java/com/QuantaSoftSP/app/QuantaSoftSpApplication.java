package com.QuantaSoftSP.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sound.midi.SysexMessage;

@SpringBootApplication
public class QuantaSoftSpApplication implements CommandLineRunner {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(QuantaSoftSpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	/*	String password = "programer";
		for (int i=0; i<4;i++)
		{
			String passwordBcrypt = passwordEncoder.encode(password);
			System.out.println(passwordBcrypt);
		}*/
	}
}
