package clases;

public class enfermedades {
	{System.out.println("A");}
	public enfermedades() {System.out.println("B");}
	}

class gripe extends enfermedades{
	static {System.out.println("C");}
	public gripe() {System.out.println("D");}
	{System.out.println("E");}
	static {System.out.println("F");}
}
class fiebre extends gripe {
	public static void main(String[] args) {
		System.out.println("G");
		new fiebre();
		System.out.println("H");
	}
}