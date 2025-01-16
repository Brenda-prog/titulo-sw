package com.example.ejercicio4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ejercicio4Application {

	public static void main(String[] args) {
		SpringApplication.run(Ejercicio4Application.class, args);

	}

	public void getSaludo(){
		System.out.println("Hola");
	}

	public void getDespedida(){
		System.out.println("Adios");
	}



}
