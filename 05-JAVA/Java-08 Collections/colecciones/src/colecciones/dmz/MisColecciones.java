package colecciones.dmz;

import java.util.*;

public class MisColecciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 wrapperClass();
	}
	
	public void listasCollections() {
		List miLista = new ArrayList();
		miLista.add(1);
		miLista.add(2);
		miLista.add(3);
	}
	
	
	
	static void wrapperClass() {
	//byte, short, char, long, float,double
		
		byte numeroB = 12;
		System.out.println("Tamaño de un byte"+ Byte.SIZE);
		System.out.println("Valor Maximo "+Byte.MAX_VALUE);
		System.out.println("Valor Min"+Byte.MIN_VALUE);
		System.out.println("----->"+numeroB);
	
		int numeroI = 21474836;
		System.out.println("Tamaño de un entero en bytes: "+Integer.BYTES);
		System.out.println("Tamaño de un entero: "+Integer.SIZE);
		System.out.println("Valor Maximo "+Integer.MAX_VALUE);
		System.out.println("Valor Min"+Integer.MIN_VALUE);
		System.out.println("----->"+numeroB);
		System.out.println("--->"+numeroI);
		
		short numeroS = 0;
		System.out.println("Tamaño de un short en bytes: "+Short.BYTES);
		System.out.println("Tamaño de un short: "+Short.SIZE);
		System.out.println("Valor Maximo "+Short.MAX_VALUE);
		System.out.println("Valor Min"+Short.MIN_VALUE);
		System.out.println("----->"+numeroS);
		System.out.println("--->"+numeroS);
		long numeroL = 0;
		System.out.println("Tamaño de un Long en bytes: "+Long.BYTES);
		System.out.println("Tamaño de un Long: "+Long.SIZE);
		System.out.println("Valor Maximo "+Long.MAX_VALUE);
		System.out.println("Valor Min"+Long.MIN_VALUE);
		System.out.println("----->"+numeroL);
		System.out.println("--->"+numeroL);
		float numerof = 0;
		System.out.println("Tamaño de un float en bytes: "+Float.BYTES);
		System.out.println("Tamaño de un float: "+Float.SIZE);
		System.out.println("Valor Maximo "+Float.MAX_VALUE);
		System.out.println("Valor Min"+Float.MIN_VALUE);
		System.out.println("----->"+numerof);
		System.out.println("--->"+numerof);
		
	}
	
}
