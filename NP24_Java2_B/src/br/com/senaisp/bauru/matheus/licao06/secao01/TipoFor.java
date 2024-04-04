package br.com.senaisp.bauru.matheus.licao06.secao01;

public class TipoFor {
	public void montarQuadrado() {
		for (int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				System.out.print(""+lin+col+" ");
			}
			System.out.println();
		}
	}
	
	public void montarTrianguloEsquerda() {
		for (int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				if (col<=lin)
					System.out.print(""+lin+col+" ");
			}
			System.out.println();
		}
	}
	
	public void montarTrianguloDireita() {
		for (int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				if (col>=lin)
					System.out.print(""+lin+col+" ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

	public void montarDiagonalPrincipal() {
		for (int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				if (col==lin)
					System.out.print(""+lin+col+" ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

	public void montarDiagonalInvertida() {
		for (int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				if (col+lin==9)
					System.out.print(""+lin+col+" ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}

	public void montarX() {
		for (int lin=0;lin<10;lin++) {
			for (int col=0;col<10;col++) {
				if (col+lin==9 || col==lin)
					System.out.print(""+lin+col+" ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}
	}
	
}