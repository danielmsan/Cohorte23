package com.dmz.cuenta.clases;

public class CuentaCorriente extends Cuenta {
	protected float sobregiro;

	public CuentaCorriente(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		// TODO Auto-generated constructor stub
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
