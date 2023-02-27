package clases;

//clase
public class NuevoHola {
	//Variable o atributo tipo string
	private String nombre;

	//Constructor
	public NuevoHola(String nombre) {
		this.nombre = nombre;
	}
	
	//metodo
	public void saludo() {
		System.out.println("Hola desde java con sts de nuez"+ nombre);
	}
	//metodo
	public void saludoConNombre(String nombre) {
		System.out.print("Hola tu eres:  "+nombre);
		
	}
}
