package br.com.senaisp.bauru.matheus.licao06.secao01;

public class TestesFor {

	public static void main(String[] args) {
		TipoFor tp = new TipoFor();
		tp.montarQuadrado();
		tp.montarTrianguloEsquerda();
		tp.montarTrianguloDireita();
		tp.montarDiagonalPrincipal();
		tp.montarDiagonalInvertida();
		tp.montarX();
		
		System.out.print("\u001B[10;5H");
		System.out.print("Teste posição");
	}
}
