package pruebasJunit.dmz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import pruebasJunit.dmz.app.Calculadora;

class CalculadoraTest {
	private Calculadora ct;
	private Calculadora ct1 = null;
	
	
	@BeforeEach
	public void configurandoBefore() {
		ct = new Calculadora();
		System.out.println("Ejecutando Before ---> configurandoBefore()");
	}

	@AfterEach
	public void configurandoAfter(){
			ct=null;
			System.out.println("Ejecutando AfterEach() ---> configurandoAfter()");
			System.out.println("--------------------");
	}
	
	@Test
	public void calculadoraNull() {
		assertNull (ct1,"La clase es una instancia no nula");
		System.out.println("ejecutando el primer test ---> calculadora");
		
	}

	@Test
	public void calculadoraNotNull() {
		assertNotNull(ct, "La clase esta instanciada ");
		System.out.println("ejecutando segundo test ---> calculadora");
	}
	/*************Primeras Pruebas*****************/
	
	@Test 
	public void primerosAssert() {
		/*
		 * 1.-Indicar que se va a evaluar
		 * 2.- Indicar lo que se va a realizar
		 * 3.- Evaluar con el assert indicado
		 * 
		 * */
		int resultadoEsperado = 10;
		int resultadoActual ;
		resultadoActual = ct.sumar(6,4);
		assertEquals(resultadoEsperado,resultadoActual);
		System.out.println("Ejecutando tercer test --> primerosAssert()");
		
	}
	@Test
	public void sumaTest() {
		Calculadora calculadora = new Calculadora();
		assertEquals(20,calculadora.sumar(10, 10));
		System.out.println("Ejecutando cuarto test --> primerosAssert()");

	}
	
	/*************TIPOS DE TEST***************/
	@Test 
	public void tiposAsserts() {
		assertTrue(1 == 1); 
		assertEquals("Generation","Generation"); 
		assertNull(ct1);
		Calculadora c1 = new Calculadora();
		Calculadora c2 = new Calculadora();
		Calculadora c3 = c1;
		assertSame(c1,c3);
		assertNotSame(c2,c3);
		assertEquals(1,1.2,.5);
	}
	@Test
	public void validandoSuma() {
		assertEquals(11,ct.sumar(5, 6));
	}
	@Test
	public void validandoResta() {
		assertEquals(20,ct.restar(40, 20));
	}
	@Test
	public void validandoRestaNegativa() {
		assertEquals(-10,ct.restar(10, 20));
	}
	@Test
	public void validandoDivision(){
		assertEquals(2, ct.division(10, 5));
	}
	/*
	@Test
	public void validandoByZero(){
		assertThrows(ArithmeticException.class, 
				()->ct.divisionByZero(10, 0),"No se puede dividir por cero");
	}*/
	 @Disabled("En espera")
	@Test
	public void validandoByZero(){
		assertThrows(ArithmeticException.class, 
				()->ct.divisionByZero(10, 0),"No se puede dividir por cero");
	}

}
