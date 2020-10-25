package org.basic.java;

public class Carro {

	byte quantidadeDeCombustiveis;

	short quantidadeDePneus;

	int velocidadeMaxima;

	long kmRodados;

	float consumoMedio;

	double velocidadeMedia;

	boolean ligado;

	char etiquetaNacionalConservacaoDeEnergia;

	void mudaParaGastao() {
		this.etiquetaNacionalConservacaoDeEnergia = 'E';
	}
	
	void ligar() {
		this.ligado = true;
	}
	
	public static void main(String[] args) {
		
		Carro c = new Carro();
		
		c.etiquetaNacionalConservacaoDeEnergia='A';
		System.out.println(c.etiquetaNacionalConservacaoDeEnergia);
		c.mudaParaGastao();
		System.out.println(c.etiquetaNacionalConservacaoDeEnergia);
		
		System.out.println(c.ligado);
		c.ligar();
		System.out.println(c.ligado);
		
		System.out.println(c.kmRodados);
		c.kmRodados = 50000L;
		System.out.println(c.kmRodados);
		
		System.out.println(c.velocidadeMedia);
		c.velocidadeMedia = 87.5D;
		System.out.println(c.velocidadeMedia);
		
		
		
	}

}
