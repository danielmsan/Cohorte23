package com.dmz.clases;

public class Cuadrado extends FiguraGeometrica{
	double lado;
	
	
	public Cuadrado(double lado) {
		super("Cuadrado");
		this.lado = lado;
	}


	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return (lado*lado);
	}


	public double getLado() {
		return lado;
	}


	public void setLado(double lado) {
		this.lado = lado;
	}


	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}

}
