package control;

import java.util.Scanner;

public class Estructuraif {
	Scanner entrada = new Scanner(System.in);
	public void controlIF() {
	// TODO Auto-generated method stub
		/*
	 	if (condition) {
			
		} 
		*/
		/*
		if (condition) {
			//verdadero
		} else {
			//falso
		}
		*/
		long nota = 4;
		if (nota > 5) {
			System.out.println("Nota aprobada "+ nota);
		}
		System.out.println("continua el control de flujo...");
		
		if (nota >=5) {
			System.out.println("Nota aprobada "+ nota);
		}else {
			System.out.println("Nota no aprobada "+ nota);
		}
	}
	
	public void divisible() {
		System.out.println("Introduzca el primer numero: ");
		int dato1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		int dato2 = entrada.nextInt();
		if(dato1 % dato2 ==0){
			System.out.println(dato1 +" es divisible entre "+dato2);
		}else {
			System.out.println("no es divisible");
		}
		
	}
	public void compara() {
		System.out.println("Introduzca el primer numero: ");
		int dato1 = entrada.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		int dato2 = entrada.nextInt();
		if (dato1 > dato2) {
			System.out.println(dato1+" es mayor a "+dato2);
		}else {
			System.out.println(dato1+" es menor a "+dato2);
		}
		
	}
	public void anidado() {
		/*
		if (condition) {
			
		}else if (condition) {
			
		}else {
			
		}
		*/
		System.out.println("Introduzca un numero: ");
		int mayor1 = entrada.nextInt();
		if(mayor1 > 0) {
			System.out.println("El numero es positivo " + mayor1 );
		}else if(mayor1 < 0) {
			System.out.println("El numero es negativo "+mayor1);
		}else {
			System.out.println("***numero igual a cero***");
		}
		
	}
		
	
}