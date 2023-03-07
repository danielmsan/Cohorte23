package com.generation.dmz.mains;

import com.generation.dmz.clases.Taco;

public class TestTaco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taco bistek = new Taco(); //Instanciar vacio
		bistek.setTipoDeTortilla("maiz");
		System.out.println("Tipo de tortilla: "+bistek.getTipoDeTortilla());
		
		bistek.setGuisado("bistek");
		System.out.println("Tipo de guiso: "+bistek.getGuisado());
		
		bistek.setNumeroDeTortilla(2);
		System.out.println("numero de tortilla: "+bistek.getNumeroDeTortilla());
		
		bistek.setTamañoDeTortilla("chikita");
		System.out.println("Tamaño de tortilla: "+bistek.getTamañoDeTortilla());
		
		bistek.setPrecio(50);
		System.out.println("El precio es:"+bistek.getPrecio());
		System.out.println("-------------------");
		
		System.out.println(bistek.preparar());
		System.out.println(bistek.vender());
		System.out.println(bistek.ponerSalsa());
		System.out.println(bistek.subirPrecio());
		System.out.println("-------------------");
		//--------------------------------------
		//Instanciar con argumentos
		Taco gringa = new Taco("harina","trompo",1,"grande",35);	
		System.out.println(gringa.toString());
		
		System.out.println("-------------------");
		System.out.println(gringa.preparar());
		System.out.println(gringa.vender());
		System.out.println(gringa.ponerSalsa());
		System.out.println(gringa.subirPrecio());


		
		
	}

}
