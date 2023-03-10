package com.dmz.cuenta.clases;

public class CuentaAhorros extends Cuenta{
	private boolean activa;
	
	
	public CuentaAhorros(float saldo, float tasaAnual) {
		super(saldo, tasaAnual);
		if(saldo>10000) {
			this.activa = true;
		}
	}


	@Override
	public String consignar(float cantidad) {
		// TODO Auto-generated method stub
		if(activa==false) {
			return "No esta activa tu cuenta";
		}
		super.consignar(cantidad);
		return "Operacion realizada correctamente";
	}


	@Override
	public String retirar(float cantidad) {
		// TODO Auto-generated method stub
		if(activa==false) {
			
			return "Tu cuenta no esta activa"; 
		}
		return super.retirar(cantidad);
	}


	@Override
	public void extractoMensual() {
		// TODO Auto-generated method stub
		super.extractoMensual();
	}


	@Override
	public String imprimir() {
		// TODO Auto-generated method stub
		return super.imprimir();
	}




	
}
