package org.basic.oo;

public class AreaRetangulo implements CalculoDeAreaGeometrica {

	@Override
	public float calcularArea(int h) {
		throw new UnsupportedOperationException("Nao consigo calcular apenas com a altura!");
	}

	@Override
	public float calcularArea(int b, int h) {
		return b*h;
	}

}
