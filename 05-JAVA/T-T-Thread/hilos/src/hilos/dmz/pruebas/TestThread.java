package hilos.dmz.pruebas;

import hilos.dmz.formathread.Hilo1;

public class TestThread {
	    public static void main(String[] args) {
	        // TODO Auto-generated method stub
	        Thread h = new Hilo1("Juan");
	        h.start();
	        Thread h0 = new Hilo1("Maria");
	        h0.start();
	        Thread h1 = new Hilo1("Raul");
	        h1.start();
	        
	        try {
	        	Thread.sleep(10);
	        } catch(InterruptedException e) {
	        	e.printStackTrace();
	        }
	        
	        System.out.println(h.getState());
	    }
}
