package com.generation.dmz.ManejoExcepciones;

import java.util.Scanner;

public class noComprobadasExceptions {
public static void main(String[] args) {
	Scanner dato = new Scanner(System.in);
	System.out.println("Introduzca un valor:");
	int divisor;
	
	try {
		divisor = Integer.parseInt(dato.next());
		
		int division = 10/divisor;
		System.out.println("--->"+division);


	}catch(ArithmeticException e) {
		System.out.println("capturando la exception"+e.getMessage());
	}catch(NumberFormatException nfe) {
		System.out.println("el dato es un caracter"+nfe.getMessage());
	}finally {
		System.out.println("Este block es opcional y se va a ejecutar con o sin la exception");
	}
	
	System.out.println("continuamos con el flujo de la aplicacion");
	
}
}
