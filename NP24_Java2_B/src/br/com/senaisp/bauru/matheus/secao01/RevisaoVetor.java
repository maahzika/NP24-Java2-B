package br.com.senaisp.bauru.matheus.secao01;

import java.util.Scanner;

public class RevisaoVetor {

	public static void main(String[] args) {
		String[] nomes = new String[10];
		Scanner scn = new Scanner(System.in);
// Colocando os dados na memória
		for (int i = 0;i<10;i++) {
			System.out.println("Digite o nome " + (i+1) + ":");
			nomes[i] = scn.nextLine();
		}
//		Listando os nomes
		for(String nome : nomes) { // For each
			System.out.println(nome);
		}
//		Fechando o scanner
		scn.close();
	}

}
