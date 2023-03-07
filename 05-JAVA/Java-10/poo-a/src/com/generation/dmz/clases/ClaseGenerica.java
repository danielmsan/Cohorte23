package com.generation.dmz.clases;

public class ClaseGenerica<T> {
T obj;

public ClaseGenerica(T obj) {

	this.obj = obj;
}

public void claseTipo() {
	System.out.println("El tipo T es: "+obj.getClass().getName());
}


}
