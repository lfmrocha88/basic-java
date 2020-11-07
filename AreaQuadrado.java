package org.basic.oo;

public class AreaQuadrado implements CalculoDeAreaGeometrica {

	@Override
	public float calcularArea(int h) {
		return h*h;
	}

	@Override
	public float calcularArea(int b, int h) {
		throw new UnsupportedOperationException("Basta apenas 1 valor para saber a area!");
	}

}
