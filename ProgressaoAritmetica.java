package org.basic.oo;

public class ProgressaoAritmetica implements Progressao {

	@Override
	public void exibirElementos(int i) {
		for (int j = 0; j < i; j++) {
			System.out.println(j);
		}
	}

}
