package br.com.senaisp.bauru.matheus.licao06.lacowhile;

public class Shape {
	public void criarRetangulo(int lar, int alt) {
		if (lar <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figura!");
		} else {
//			Aqui começa o código
			for (int lin = 1; lin <= alt; lin++) {
				for(int col=1;col<=lar;col++ ) {
					if(lin==1 || lin==alt||col==lar||col==1) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					} // fim do else
				} // fim do for col
				System.out.println();
			} // fim do for lin 
		} // fim do else
	} // fim do criarRentagulo

	public void criarTriangulo(int lar, int alt) {
		if (lar <= 0 || alt <= 0) {
			System.out.println("Não temos como fazer a figura!");
		} else {
//			Aqui começa o código
			for (int lin = 1; lin <= alt; lin++) {
				for(int col=1;col<=lar;col++ ) {
					if(col==1 || col==lin || lin==alt) {
						System.out.print("#");
					} else {
						System.out.print(" ");
					} // fim do else
				} // fim do for col
				System.out.println();
			} // fim do for lin 
		} // fim do else
	}// fim do criarTriangulo
}
