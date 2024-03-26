package br.com.senaisp.bauru.matheus.licao05.exercicio;

import java.util.Scanner;

public class ExemploSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor de 1 a 10: ");
		int vlr = sc.nextInt();
		switch(vlr) {
		case 1: System.out.println("Vocçe ganhou um boné!"); break; 
		case 2: System.out.println("Vocçe ganhou uma caneta!"); break;
		case 3: System.out.println("Vocçe ganhou um lápis!"); break;
		case 4: System.out.println("Vocçe ganhou uma calculadora!"); break;
		case 5: System.out.println("Vocçe ganhou uma borracha!"); break;
		case 6: System.out.println("Vocçe ganhou uma régua!"); break;
		case 7: System.out.println("Vocçe ganhou um transferidor!"); break;
		case 8: System.out.println("Vocçe ganhou um compasso!"); break;
		case 9: System.out.println("Vocçe ganhou um celular!"); break;
		case 10: System.out.println("Vocçe ganhou R$ 1.000,00!"); break;
		default: System.out.println("Que Pena, você perdeu tudo!"); 
		}
		sc.close();
	}

}
