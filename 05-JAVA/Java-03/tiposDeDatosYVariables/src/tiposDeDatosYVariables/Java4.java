package tiposDeDatosYVariables;

public class Java4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int edad = 18;
		boolean tieneLicencia = true;
		if(edad >= 18 && tieneLicencia) {
			System.out.println("Puede conducir un coche");
		}else {
			System.out.println("No puede conducir un coche");
		}
		//---------------------------------------------------
		
		String nombre = "Juan";
		String apellido = "Pérez";
		if (nombre.equals("Juan") || apellido.equals("Pérez")) {
		    System.out.println("El usuario es Juan Pérez");
		} else {
		    System.out.println("El usuario no es Juan Pérez");
		}
		
		//----------------------------------------------------
		boolean esVerdadero = true;
		if (!esVerdadero) { //Aqui pregunta si es contrario a true
			//true
		    System.out.println("La condición es falsa");
		} else { 
			//false
		    System.out.println("La condición es verdadera");
		}
		
		//--------------------------Ejercicio 1 -----------------------------------
		System.out.println("-----------------Ejercicio 1 ----------------------------");
		//Verificar si un número es par y positivo:
		
			int num = 6;
			if(num > 0 && num%2 == 0) {
				System.out.println("Es par y positivo");
			}else {
				System.out.println("No es par o es negativo");
			}
			
		//----------------------------Ejercicio2---------------------------
			System.out.println("-----------------Ejercicio 2 ----------------------------");
			//Verificar si un número está dentro de un rango específico 1-50 
			
			int num2 = 50;
			if(num2>0 && num2<=50) {
				System.out.println("El numero esta entre 1 - 50: ");
			}else if(num2 >50 || num2<100){
				System.out.println("Es mayor a 50 o menor de 100");
			}
			
		//----------------------------Ejercico 3 --------------------------
			System.out.println("-----------------Ejercicio 3 ----------------------------");
			//Verificar si una cadena es igual a otra o no
			String cadena1 = "hola";
			String cadena2 = "hola";
			
			if(cadena1 != cadena2) {
				System.out.println("Son diferentes");
			}else {
				System.out.println("Son iguales");
			}
			
		//----------------------------------------------------------------
	}

}
