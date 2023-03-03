package Funciones;

public class Funciones {
	
	
	
	//Las funciones se pueden declarar en cualquier lugar de la clase(si retorna algo)
	public static int sumar (int num1, int num2) {
		int resultado = num1 + num2;
		return resultado;
	} //cierre sumar
	
	public static int restar (int num1, int num2) {
		int resultado = num1 - num2;
		return resultado;
	} //cierre restar
	
	public static int multiplicar (int num1, int num2) {
		int resultado = num1 * num2;
		return resultado;
	} //cierre multiplicar
	
	public static int dividir (int num1, int num2) {
		int resultado = num1 / num2;
		return resultado;
	} //cierre dividir
	
	
	
	
	//Funcion para imprimir arsteriscos (void) //funcion void no necesita especificar el tipo de dato
	public static void imprimirAsteriscos() {
		System.out.println("**************");
	}//cierre imprimirAsteriscos
	
	//Funcion que combina distintos tipos de valores
	public static float sumaDecimal(float valor1, int valor2) {
		float resultadoDecimal = valor1 + valor2;
		return resultadoDecimal;
	}
	
	//Funcion que usa String como argumentos
	public static String awitaDeLimon (String ingrediente1, String ingrediente2, String ingrediente3){
		String recetaCompletada = ingrediente1+ingrediente2 + ingrediente3;
		return recetaCompletada;
	}
	
	//este metodo tiene como funcion, ejecutar cosas
	public static void main(String[] args) {
		
		//Las invocaciones de la funcion se hacen generalmente 
		//dentro del metodo principal o main
		
		System.out.println("El resultado de la suma es: " + sumar(5,8));
		
		imprimirAsteriscos();
		System.out.println("el resultado de la suma decimal es: "+ sumaDecimal(5.5f,5));
		imprimirAsteriscos();
		
		System.out.println("Estos son los pasos para preparar agua de limon: "
				+awitaDeLimon("limon","agua","azucar"));
		
		//Funciones de la biblioteca d ematematicas (math)
		
		double valorEjemplo = 7.65497834d;
		
		System.out.println("La raiz cuadrada de mi valor es:  "+Math.sqrt(valorEjemplo));
		
		System.out.println("El seno de mi valor es: "+Math.sin(valorEjemplo));
		
		System.out.println("La potencia de mi valor es: "+Math.pow(valorEjemplo, 2));
		
		
//EJERCICIO
        
        // Primero, vamos a imprimir los datos que tenemos:
        
        //System.out.println("Distancia desde la persona a la base de la torre: 100 metros");
        //System.out.println("Ángulo de elevación: 30 grados");
        
        // Ahora, necesitamos obtener la longitud del cateto opuesto (altura de la torre) usando la fórmula de la tangente:
        
        //double distancia = 100.0; // en metros
        //double angulo = Math.toRadians(30); // convertimos el ángulo a radianes
        //double altura = distancia * Math.tan(angulo);
        //System.out.println("La altura de la torre es: " + altura + " metros");
        
        //Finalmente, podemos imprimir todos los datos juntos:
        
        System.out.println("Distancia desde la persona a la base de la torre: 100 metros");
        System.out.println("Ángulo de elevación: 30 grados");
        double distancia = 100.0; // en metros
        double angulo = Math.toRadians(30); // convertimos el ángulo a radianes
        double altura = distancia * Math.tan(angulo);
        System.out.println("La altura de la torre es: " + altura + " metros");
        System.out.println("La distancia desde la persona a la base de la torre es: " + distancia + " metros");
        System.out.println("El ángulo de elevación es: " + Math.toDegrees(angulo) + " grados");
		
	} //Cierre metodo main
}//Cierre clase Funciones


/*
 * Funciones
 * 
 * 	-no retornar valores: No devuelven nada, no se especifica nada,
 * 	 y no usamos la palabra return
 * 	
 * 	-si retornan valores: Se especifica el tipo de dato, el tipo de valor que 
 * 	 regresa y se usa return para esto
 * 
 * - Sintaxis de las funciones que si retornan valores
    tipoDeRetorno nombreDeLaFuncion(tipoDeDato argumento1, tipoDeDato argumento2, ...) {
  // Cuerpo de la función
	}

    - Sintaxis de las funciones que no retornan valores
    palabraReservada nombreDeLaFuncion(){
    //cuerpo de la funcion
     }

//Funciones de la biblioteca de Matematicas 
 
//Calcula la altura de una torre que se encuentra a 100 metros de una persona,
 * que observa la punta de la torre con un angulo de elevacion de 30°
 * 
 * Levantamiento de requerimientos
 * 
 * -Torre es recta(90°)
 * -Usen funciones de la libreria de Math
 * -Tiempo es de 20 minutos
 * -Impresiones en consola de todos los datos
 * 		/ tu base es de 
 * 		/ tu altura
 * -Datos del tipo double o float
 * 
 * 
 * -Estatura de la persona
 * -Torre recta
 * -Tipos de datos 
 * -distancia
 * -imprima todos los datos
 */