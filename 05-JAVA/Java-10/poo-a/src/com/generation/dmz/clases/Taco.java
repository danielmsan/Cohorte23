package com.generation.dmz.clases;

public class Taco {
	//Atributos
	private String tipoDeTortilla;
	private String guisado;
	private int numeroDeTortilla;
	private String tamañoDeTortilla;
	private float precio;
	
	//----------Constructores--------
	
	public Taco() {
		super();
	}

	public Taco(String tipoDeTortilla, String guisado, int numeroDeTortilla, String tamañoDeTortilla, float precio) {
		super();
		this.tipoDeTortilla = tipoDeTortilla;
		this.guisado = guisado;
		this.numeroDeTortilla = numeroDeTortilla;
		this.tamañoDeTortilla = tamañoDeTortilla;
		this.precio = precio;
	}

	
	
	/// --------To String---------
	@Override
	public String toString() {
		return "Taco [tipoDeTortilla=" + tipoDeTortilla + ", guisado=" + guisado + ", numeroDeTortilla="
				+ numeroDeTortilla + ", tamañoDeTortilla=" + tamañoDeTortilla + ", precio=" + precio + "]";
	}

	//---------GET Y SET---------
	public String getTipoDeTortilla() {
		return tipoDeTortilla;
	}

	public void setTipoDeTortilla(String tipoDeTortilla) {
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public String getGuisado() {
		return guisado;
	}

	public void setGuisado(String guisado) {
		this.guisado = guisado;
	}

	public int getNumeroDeTortilla() {
		return numeroDeTortilla;
	}

	public void setNumeroDeTortilla(int numeroDeTortilla) {
		this.numeroDeTortilla = numeroDeTortilla;
	}

	public String getTamañoDeTortilla() {
		return tamañoDeTortilla;
	}

	public void setTamañoDeTortilla(String tamañoDeTortilla) {
		this.tamañoDeTortilla = tamañoDeTortilla;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	//----------Metodos---------
	public String preparar() {
		return "preparando taco de: "+guisado;
	}
	public String vender() {
		return "La orden de: "+guisado+" anda en: $"+precio;
	}
	public String ponerSalsa() {
		return "ahi esta la salsa werito";
	}
	public String subirPrecio() {
		return "ya subio de precio carnal";
	}
}
