package br.com.senaisp.bauru.matheus.licao07.exercicio;

public class TesteJogo {

	public static void main(String[] args) {
		Cartao ct01 = new Cartao();
		System.out.println(ct01);
		Cartao ct02 = new Cartao();
		System.out.println(ct02);
//		Instanciando Terminal
		Terminal tm = new Terminal();
//		Carregando saldo para os cartões
		tm.carregarCartao(ct01, 50);
		tm.carregarCartao(ct02, 100);
//		Criando duas máquinas de jogo
		MaquinaFliperama m1 = new MaquinaFliperama("MK1");
		MaquinaFliperama m2 = new MaquinaFliperama("LoL");
//		Usar as máquinas
		System.out.println("jogando....\n\n\n");
		m1.lerCartao(ct01);
		m2.lerCartao(ct02);
		System.out.println("Segunda rodada de jogos...\n\n");
		m1.lerCartao(ct02);
		m2.lerCartao(ct01);
		System.out.println("Transferindo o saldo do cartão1 para o 2...\n\n");
		tm.transferirCreditos(ct01, ct02);
		System.out.println("Tentar jogar com o cartão 1...\n\n");
		m1.lerCartao(ct01);
		System.out.println("Transferir um pouco para o cartão 1...\n\n");
		tm.transferirCreditos(ct02, ct01, 10);
		System.out.println("Consultar saldos de prêmios...\n\n\n");
		tm.consultarPremios();
		System.out.println("Resgatando um dos prêmios");
		tm.resgatarPremio(ct01, 1);
	}

}
