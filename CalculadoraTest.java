package org.basic.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void dadoDoisInteirosQuandoSomadosMostraSoma() {
		Calculadora c = new Calculadora();
		assertEquals(2, c.soma(1, 1));
	}
	
	@Test
	public void subtracao() {
		Calculadora c = new Calculadora();
		assertEquals(2, c.subtracao(4, 2));
	}

}
