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
	
	//----------------------------------------
	public String consignar(float cantidad) {
		setSaldo(cantidad);
		return "Su saldo ahora es de: "+saldo;
	}
	public  String retirar(float cantidad) {
		if(cantidad>this.saldo) {
			System.out.println("No puedes retirar mas de lo que tienes");
			return " no puedes retirar mas de lo que tienes";
		}
		float resta = this.saldo - cantidad; 
		setSaldo(resta);
		System.out.println("Retiro exitoso");
		return " Retiro exitoso";
	}
	public void calcularInteres() {
		
	}
	public void extractoMensual() {
	}


	public String imprimir() {
		return "Cuenta [saldo=" + saldo + ", numConsignacion=" + numConsignacion + ", numRetiros=" + numRetiros
				+ ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}
	

}
