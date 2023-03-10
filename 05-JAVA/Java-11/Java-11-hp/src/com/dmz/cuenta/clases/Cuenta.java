package com.dmz.cuenta.clases;

public class Cuenta {
	protected float saldo;
	protected int numConsignacion = 0;
	protected int numRetiros = 0;
	protected float tasaAnual;
	protected float comisionMensual = 0;
	
	
	
	public Cuenta(float saldo, float tasaAnual) {
		super();
		this.saldo = saldo;
		this.tasaAnual = tasaAnual;
	}
	

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumConsignacion() {
		return numConsignacion;
	}

	public void setNumConsignacion(int numConsignacion) {
		this.numConsignacion = numConsignacion;
	}

	public int getNumRetiros() {
		return numRetiros;
	}

	public void setNumRetiros(int numRetiros) {
		this.numRetiros = numRetiros;
	}

	public float getTasaAnual() {
		return tasaAnual;
	}

	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}
	
	
	public void consignar(float cantidad) {
		this.saldo += cantidad;
	}
	public void retirar(double cantidad) {
		this.saldo -= cantidad;
	}
	public void calcularInteres() {
		
	}
	public void extractoMensual() {
	}


}
