package com.generation.dmz.clases;

public class Persona {
	//Atributos
	private String nombre;
	private int edad;
	private int nss;
	
	//Constructores
	
	//Constructor vacio
	public Persona() { 
		
	}
	//Constructor sobrecargado
	public Persona(String nombre, int edad, int nss) {
		super(); 
		this.nombre = nombre;
		this.edad = edad;
		this.nss = nss;
	}
	
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getNss() {
		return nss;
	}
	public void setNss(int nss) {
		this.nss = nss;
	}
	
	
	
}
