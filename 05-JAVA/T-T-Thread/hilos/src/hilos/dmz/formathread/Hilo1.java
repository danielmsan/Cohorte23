package hilos.dmz.formathread;

public class Hilo1 extends Thread{
    
public Hilo1(String name) {
        super(name);
    }
@Override
public void run() {
System.out.println("***Se inicia el Thread/Hilo "+ this.getName() + " ***");
System.out.println("***Finaliza el Thread/Hilo "+ this.getName() + " ***");
}
}