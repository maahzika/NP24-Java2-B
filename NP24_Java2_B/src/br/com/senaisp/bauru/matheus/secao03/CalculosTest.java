package br.com.senaisp.bauru.matheus.secao03;

public class CalculosTest {
	public static void main(String[] args) {
		int x = 10;
		int y = 50 + (x++);
		System.out.println(x);
		System.out.println(y);
		while (x<20) {
			x++;
			System.out.println(x);
		}
	}
}