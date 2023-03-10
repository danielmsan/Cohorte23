package com.dmz.clases;

public class Circulo extends FiguraGeometrica{
	private int radio;
	
	public Circulo(int radio) {
		super("Circulo");
		this.radio = radio;
	}

	@Override
	public double areas() {
		// TODO Auto-generated method stub
		return Math.PI*Math.pow(radio, 2);
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	@Override
	public void pedirDatos() {
		// TODO Auto-generated method stub
		
	}


}
