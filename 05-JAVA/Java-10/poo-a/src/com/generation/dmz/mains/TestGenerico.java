package com.generation.dmz.mains;

import com.generation.dmz.clases.ClaseGenerica;

public class TestGenerico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClaseGenerica <Integer> intObj = new ClaseGenerica(55);
		ClaseGenerica <String> caracteresObj = new ClaseGenerica<String>("Prueba");
	
		intObj.claseTipo();
		caracteresObj.claseTipo();
	}

}
