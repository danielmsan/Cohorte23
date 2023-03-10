package com.dmz.testers;
import com.dmz.clases.*;

public class TestFigurasGeometricas {
	
	public static void main(String[] args) {
		
		FiguraGeometrica rectangulo = new Rectangulo(10,2);
		FiguraGeometrica circulo = new Circulo(2);

		System.out.println(rectangulo.areas());

		System.out.println(rectangulo.toString());
		rectangulo.pedirDatos();
		System.out.println(rectangulo.areas());
		
	}
}
