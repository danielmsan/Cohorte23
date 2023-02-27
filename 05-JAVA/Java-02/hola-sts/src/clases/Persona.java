package clases;

import java.util.Scanner;

public class Persona {
	
	String nombre;

	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public void saludar() {
	System.out.println("Hola soy"+nombre);
	}
	
	public void preguntarNombre() {
	System.out.println("Cual es tu nombre?");
	}
	public void saludarAmigo(String amigo) {
		System.out.println("Hola!"+amigo);
	}
	
}
