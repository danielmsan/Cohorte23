package clases;
import java.util.Scanner;
public class NuevoHola {
	
	private String nombre;
	// para inicializar la variable (obj tipo string)

	public NuevoHola(String nombre) {
		this.nombre = nombre;
	}
	public void saludo() {
		System.out.println("Hola desde java con sts de nuez"+ this.nombre);
	}
	
	public void saludoConNombre(String nombre) {
		System.out.print("Hola tu eres:  "+this.nombre);
		
	}
}
