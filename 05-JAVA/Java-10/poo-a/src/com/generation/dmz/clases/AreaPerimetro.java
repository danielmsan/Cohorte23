package com.generation.dmz.clases;

public class AreaPerimetro {

	
	public double areaCuadrado(double lado) {
		double area = lado * lado;
		return area;
	}
	public double perimetroCuadrado(double lado) {
		double perimetro = lado*4;
		return perimetro;	
	}
	
	public double areaTriangulo(int base, int altura) {
		return (base*altura)/2;
	}
	public double perimetroTriangulo(double ladoA, double ladoB, double LadoC) {
		
		return (ladoA+ladoB+LadoC);
	}
	
	public double areaCirculo(double radio) {
		double pi = Math.PI;
		return pi* (radio*radio);
	}
	public double perimetroCirculo(double radio) {
		double pi = Math.PI;
		 return radio * pi * 2;
	}
	
	
}
