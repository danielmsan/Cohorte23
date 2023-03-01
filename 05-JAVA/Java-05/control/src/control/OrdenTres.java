package control;
import java.util.Scanner;

public class OrdenTres {
	//Recibir 3 valores y ordenarlos de mayor a menor
	Scanner dato = new Scanner(System.in);
	
	public void mayorAmenor() {
		System.out.print("Introduzca un primer valor numerico: ");
		int a= dato.nextInt();
		System.out.println("Introduzca un segundo valor numerico: ");
		int b = dato.nextInt();
		System.out.println("Introduzca tercer valor numerico: ");
		int c = dato.nextInt();
		
		if(a >= b && a >= c){  //a es mayor que todos
		    if(b > c ){
		    	System.out.println(a+","+b+","+c);
		        //console.log(c+","+b+","+a)
		    }else if(c > b){
		    	System.out.println(a+","+c+","+b);
		       // console.log(b+","+c+","+a)
		    }else if(b==c){
		    	System.out.println(a+","+c+","+b);
		       // console.log(b+","+c+","+a)
		    }
		}else if(b >= a && b >= c){
		    if(a >c){
		    	System.out.println(b+","+a+","+c);
		      //  console.log(c+","+a+","+b)
		    }else if(c > a){
		    	System.out.println(b+","+c+","+a);
		     //   console.log(a+","+c+","+b)
		    }
		    }else if(c > a && c > b){
		        if(a >b){
			    	System.out.println(c+","+a+","+b);
		         //   console.log(b+","+a+","+c)
		        }else if(b > a){
			    	System.out.println(c+","+b+","+a);
		        //    console.log(a+","+b+","+c)
		        }
		    }else{
		    	System.out.println("ingresa un numero valido");
		    }
	}
}
