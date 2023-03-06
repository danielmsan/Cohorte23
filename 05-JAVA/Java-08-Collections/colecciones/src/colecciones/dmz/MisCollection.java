package colecciones.dmz;

import java.util.*;

public class MisCollection {

	public static void main(String[] args) {
		MisCollection c = new MisCollection();
		//imprimir(c.listaCollections());
		//imprimir(c.setCollections());
		//wrapperClass();
		mapCollections();
	}
	
	private static void mapCollections() {
		Map miMap = new HashMap();
		miMap.put("valor1","Juan");
		miMap.put("valor2", "Maria");
		miMap.put("valor3", "Arturo");
		miMap.put("valor4", "Karla");
		
		miMap.remove("valor3");
		imprimir(miMap.keySet());
		imprimir(miMap.values());
	}
	
	Set setCollections() {
		Set miSet = new HashSet();
		miSet.add("uno");
		miSet.add("dos");
		miSet.clear();
		miSet.add("tres");
		miSet.add("cuatro");
		miSet.add("dos");
		
		String palabra = "ocho";
		boolean siTiene = miSet.contains(palabra);
		if(siTiene) {
			System.out.println("Contiene "+palabra);
		}else {
			System.out.println("No tiene "+palabra+" Ahorita lo agregamos pa");
			miSet.add(palabra+" <------");
		}
		
		Object a[] = miSet.toArray();
		for(int i = 0; i < a.length; i++) {
			System.out.println("Esto es un set en un array "+a[i]);
		}
		miSet.clear();
		
		
		return miSet;
	}
	
	
	public List listaCollections() { //Funcion
		List miLista = new ArrayList();
		System.out.println(miLista + "tamaño de la lista antes " + miLista.size());
		System.out.println("Esta vacia "+ miLista.isEmpty());
		miLista.add("1");
		miLista.add(0,2);
		miLista.add(3);
		miLista.add(0,"pato");
		
		miLista.set(0,miLista);
		miLista.remove(0);
		
		System.out.println(miLista + "tamaño de la lista despues " + miLista.size());
		System.out.println("Esta vacia "+ miLista.isEmpty());
		
		
		boolean e = miLista.contains(3);
		System.out.println("--->"+e);
		
		return miLista;
		
	}
	
	private static void imprimir(Collection collection) {
		for(Object elementos : collection) {
			System.out.println("elementos "+ elementos);
		}
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
