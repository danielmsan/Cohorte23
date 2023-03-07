package com.generation.dmz.clases;

public class FigurasGeometrica {
	//Atributos
	private String nombre;
	private double perimetro;
	private double area;
	
	
	//Constructor vacio
	public FigurasGeometrica() {
		super();
	}

	public FigurasGeometrica(String nombre) {
		this.nombre = nombre;
	}

	//Constructor
	public FigurasGeometrica(double perimetro, double area) {
		this.perimetro = perimetro;
		this.area = area;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public double getPerimetro() {
		return perimetro;
	}



	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}



	public double getArea() {
		return area;
	}



	public void setArea(double area) {
		this.area = area;
	}
	
	
	
}
