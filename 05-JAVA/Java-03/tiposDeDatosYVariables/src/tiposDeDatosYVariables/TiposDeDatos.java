package tiposDeDatosYVariables;

public class TiposDeDatos {

    public static void main(String[] args) {
    

        byte centigrados = 1;
        double fahrenheit = (centigrados * 1.8) + 32;
        double kelvin = centigrados + 273.15;

        System.out.println("1 centigrado a fahrenheit es" + fahrenheit);

        System.out.println("1 centigrado a kelvin es" + kelvin);

        /*
         * ºF = ºC x 1.8 + 32 formula para convertir grados centigrados a fahrenheit K =
         * ºC + 273.15
         */
        byte horasTrabajadas = 8;
        byte pago = 10;
        int multiplicacionB = horasTrabajadas * pago;
        System.out.println(multiplicacionB);
        
        double num = 1.61;
        int numInt = (int)num;
        //Aqui ta lo estamos diciendo que lo cambie a entero
        long numLong = (long)num;
        //Aqui ya lo cambiamos a long
        		
        System.out.println("double: " + num);
        System.out.println("int: " + numInt);
        System.out.println("long: " + numLong);
        
        //String
        
        String cantidad = "15";
        String precio = "115.20";

        //Aqui convertimos a entero la variable cantidad y precio a double
        int cantEntero = Integer.parseInt(cantidad);  
        double precioDouble = Double.parseDouble(precio);

        //Aqui se suma el total
        System.out.println("El valor total de la compra es: " + (cantEntero * precioDouble));

         

        int edad = 30;
        double estatura = 1.61;
         

        String edadString = String.valueOf (edad);
        String estaturaString = String.valueOf (estatura); //y ahi mismo te da todos los valores que puedes utilizar para hacer conversion 

        System.out.println("Edad: " + edadString + estatura + estaturaString);

        
        int numero1 = 5;
        int numero2 = 7;
        int numero3 =12;
        
        int suma = numero1 + numero2 + numero3; //operador +, esperamos un 24
        int resta = numero1 - numero2 - numero3; //esperamos -14
        int multiplicación = numero1 * numero2 * numero3; //operador *, esperamos 420
        int división = numero2 / numero1; //operador /, esperamos 1,4
        int modulo = numero2 % numero1; //operador %, esperamos un 2
        int incremento = ++numero3;
        int decremento= --numero2;
        
        System.out.println("La suma es: "+ suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ multiplicación);
        System.out.println("La división es: "+ división);
        System.out.println("La modulo es: "+ modulo);
        System.out.println("El incremento es: "+ incremento);
        System.out.println("El decremento: "+ decremento);
        
        //Ejercicio 
        float num1 = 3;
        float num2 = 2;
        float num3 = 2;
        float num4 = 5;
        float sumaf = num1 + num2;
        float multiplicaciónf = num3 * num4;
        float divisiónf = sumaf / multiplicaciónf;

        System.out.println(sumaf);
        System.out.println(multiplicaciónf);
        System.out.println(divisiónf);
        
       /* Ejercicio 1
        Declara 3 variables de tipo entero y utiliza el operador * y % */
        byte nume1 = 5;
        byte nume2 = 8;
        byte nume3 = 10;
        int multiplicacion = nume1*nume2;
        int mod = nume3 % nume1;
        System.out.println("Ejercicio 1 -----------------");
        System.out.println("Resultado multi: " + multiplicacion);
        System.out.println("Resultado modulo: "+mod);
         
       /* Ejercicio 2
        Declara dos variables de tipo boolean y utiliza el operador == */
        System.out.println("Ejercicio 2 -----------------");
        boolean bulli1 = true;
        boolean bulli2 = false;
        System.out.println(bulli1 == bulli2);
        
        
      /*  Ejercicio 3
        Declara dos variables de tipo Double y utiliza el operador < */
        System.out.println("Ejercicio 3 -----------------");
        double num5 = 3.67;
        double num7 = 11.11;
        	System.out.println(num5 < num7);
        
      /* Ejercicio 4 Farenheit a celcius y farenheit a kelvin*/
        	//fahrenheit a celcius //(32 °F − 32) × 5/9 = 0 °C
        	//fahrenheit a Kelvin //(32 °F − 32) × 5/9 + 273.15 = 273.15 K
        	
        	double farenheit2 = 1;
        	double celsius2 = (farenheit2 -32)*5/9;
        	double kevin2 = (farenheit2-32)*5/9+273.15;
        	
        	System.out.println("1 centrigrado a farenheit es "+ celsius2+" °C");
        	
        	System.out.println("1 centigrado a Kelvin es "+kevin2+" K");
        	
       //----------------------------------------------------------
        /*	Operadores Logicos ( || && !)
        	 && AND (Y)
        	 || OR (O) 
        	 ! NOT (No) */
        	
        	
        	
        	
    }
    

}