package main;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculoTeste {

	@Test
	public void test() {
		float retorno = Calculo.calcular(10, 5);
		float retornoEsperado = 15;
		assertEquals(retornoEsperado, retorno, 0);
	}

}
