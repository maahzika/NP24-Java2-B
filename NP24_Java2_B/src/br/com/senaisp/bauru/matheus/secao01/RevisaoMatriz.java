package br.com.senaisp.bauru.matheus.secao01;

import java.util.Scanner;

public class RevisaoMatriz {

	public static void main(String[] args) {
		char[][] acentos = new char[9][9];
		Scanner scn = new Scanner(System.in);
		for(int lin=0;lin<9;lin++) {
			for(int col=0;col<9;col++ ) {
				acentos[lin][col] = '_';
			}
		}
//		Reserva de lugar
		for(int lin=0;lin<9;lin++) {
			for(int col=0;col<9;col++ ) {
			System.out.print(acentos[lin][col]+" ");
			}
			System.out.println();
	}
//		Solicitando a posição
		System.out.println("Digite a posiçao desejada: ");
		System.out.println("Fileira: ");
		int fil = scn.nextInt();
		System.out.println("Poltrona: ");
		int pol = scn.nextInt();
//		Marcando o acento
		acentos[fil-1][pol-1] = 'X';
//		Mostrando os acentos
		for(int lin=0;lin<9;lin++) {
			for(int col=0;col<9;col++ ) {
			System.out.print(acentos[lin][col]+" ");
			}
			System.out.println();
	    }
		scn.close();
	}
}
