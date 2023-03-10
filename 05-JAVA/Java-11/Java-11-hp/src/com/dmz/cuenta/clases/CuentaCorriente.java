package com.dmz.cuenta.clases;

public class CuentaCorriente extends Cuenta {
	protected float sobregiro;

	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String consignar(float cantidad) {
		// TODO Auto-generated method stub
		super.consignar(cantidad);
	}

	@Override
	public String retirar(double cantidad) {
		// TODO Auto-generated method stub
		return super.retirar(cantidad);
	}

	@Override
	public void extractoMensual() {
		// TODO Auto-generated method stub
		super.extractoMensual();
	}



}
