package br.com.senaisp.bauru.matheus.licao05.exercicio;

public class Exemplo01 {

	public static void main(String[] args) {
		int idade = 17;
		boolean bPodeDirigir = !(idade < 18 || idade > 65);
		System.out.println("Você " + 
						( bPodeDirigir ? "Pode" : "Não Pode" ) +
						" Dirigir");
	}

}
