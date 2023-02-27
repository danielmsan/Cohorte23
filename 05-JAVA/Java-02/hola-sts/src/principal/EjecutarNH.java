package principal;

import java.util.Scanner;

import clases.NuevoHola;

public class EjecutarNH {

	private static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		
		NuevoHola nh = new NuevoHola("Daniel Morales");
		nh.saludo();
		
		String nombre;
		System.out.print("Cual es tu nombre: ");
		nombre = sn.nextLine();
		
		NuevoHola nh1 = new NuevoHola(nombre);
		nh1.saludoConNombre();
	}

}
