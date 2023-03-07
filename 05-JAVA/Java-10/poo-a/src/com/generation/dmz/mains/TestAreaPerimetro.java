package com.generation.dmz.mains;

import com.generation.dmz.clases.AreaPerimetro;
import com.generation.dmz.clases.FigurasGeometrica;

public class TestAreaPerimetro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaPerimetro ap= new AreaPerimetro();
		FigurasGeometrica fg = new FigurasGeometrica("cuadrado");
		fg.setArea(ap.areaCuadrado(5));
		System.out.println("Area Cuadrado--->"+fg.getArea());
		fg.setPerimetro(ap.perimetroCuadrado(5));
		System.out.println("Perimetro del cuadrado-->"+fg.getPerimetro());
		
		FigurasGeometrica fg2 = new FigurasGeometrica("triangulo");
		System.out.println("------------>"+fg2.getNombre());
		fg2.setArea(ap.areaTriangulo(2,3));
		System.out.println("Area triangulo--->"+fg2.getArea());
		fg2.setPerimetro(ap.perimetroTriangulo(5,5,5));
		System.out.println("Perimetro del triangulo-->"+fg2.getPerimetro());
		
		FigurasGeometrica fg3 = new FigurasGeometrica("Circulo");
		System.out.println("------------>"+fg3.getNombre());
		fg3.setArea(ap.areaCirculo(5));
		System.out.println("Area Circulo--->"+fg3.getArea());
		fg3.setPerimetro(ap.perimetroCirculo(4));
		System.out.println("Perimetro del circulo-->"+fg3.getPerimetro());
	}

}
