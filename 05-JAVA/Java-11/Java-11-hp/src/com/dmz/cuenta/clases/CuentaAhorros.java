package com.dmz.cuenta.clases;

public class CuentaAhorros extends Cuenta{
	private boolean activa;

	
	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		this.activa = activa;
	}


	@Override
	public void consignar(float cantidad) {
		// TODO Auto-generated method stub
		super.consignar(cantidad);
	}


	@Override
	public void retirar(double cantidad) {
		// TODO Auto-generated method stub
		super.retirar(cantidad);
	}


	@Override
	public void extractoMensual() {
		// TODO Auto-generated method stub
		super.extractoMensual();
	}


	public void Imprimir() {
		// TODO Auto-generated method stub
	}
	
	
	
}
