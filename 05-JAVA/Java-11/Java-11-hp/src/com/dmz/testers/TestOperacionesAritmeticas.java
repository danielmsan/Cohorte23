package com.dmz.testers;
import com.dmz.clases.*;
public class TestOperacionesAritmeticas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Suma s = new Suma(5,2);
		OperacionesAritmeticas ss = new Suma(10,3);
		Mensajes sss = new Suma();
		
		System.out.println("Suma: "+s.sumar());
		System.out.println("OperacionesAritmeticas: "+ss.sumar());
		s.mensaje();
		sss.mensaje();
	}

}
