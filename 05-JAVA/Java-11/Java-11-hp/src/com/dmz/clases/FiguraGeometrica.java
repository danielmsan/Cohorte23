package com.dmz.clases;

public abstract class FiguraGeometrica {
	private String nombre;

	public FiguraGeometrica(String nombre) {
		this.nombre = nombre;
	}

	public abstract double areas();
	public abstract void pedirDatos();

	@Override
	public String toString() {
		return "FiguraGeometrica [nombre=" + nombre + ", areas()=" + areas() + "]";
	}
}
