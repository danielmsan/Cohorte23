package principal;

import java.util.Scanner;
import clases.Persona;

public class SaludarPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("Daniel");
		p1.saludar();
		p1.preguntarNombre();
		Scanner sn = new Scanner(System.in); 
		String amigo;
		amigo = sn.nextLine();
		p1.saludarAmigo(amigo);
		
	}

}
