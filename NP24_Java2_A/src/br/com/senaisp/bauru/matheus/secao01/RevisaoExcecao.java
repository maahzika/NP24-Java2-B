package br.com.senaisp.bauru.matheus.secao01;

import java.util.Scanner;

public class RevisaoExcecao {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int valor = 0;
		do {
			System.out.println("Digite um valor: ");
			
			try {
				valor = scn.nextInt();
			} catch (Exception e) {
				System.out.println("Você não digitou um número! Redigite burro!");
				scn.nextLine();
			}
			
		} while(valor<100);
		scn.nextLine(); // para capturar o enter do nextInt
		System.out.println("Deseja continuar? (S/N): ");
		String cont = scn.nextLine();
		System.out.println("Você digitou " + cont);
		
		scn.close();
	}

}
