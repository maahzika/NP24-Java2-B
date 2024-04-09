package br.com.senaisp.bauru.matheus.testers;

import java.sql.SQLException;
import java.util.Scanner;

import br.com.senaisp.bauru.matheus.classes.ProdutoSimples;

public class TesteProdutoSimples {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		int op;
		do {
			System.out.println("Menu");
			System.out.println("1 - Criar Produto");
			System.out.println("2 - Consultar Produto");
			System.out.println("3 - Alterar Produto");
			System.out.println("4 - Excluir Produto");
			System.out.println("9 - Fim");
			op = sc.nextInt();
			switch(op) {
			case 1 -> criarProduto(sc);
			case 2 -> consultarProduto(sc);
			case 3 -> alterarProduto(sc);
			case 4 -> excluirProduto(sc);
			case 9 -> System.out.println("Bye!");
			default -> System.out.println("Opção inválida!");
			}
		}while (op!=9);
	}

	private static void excluirProduto(Scanner sc) throws SQLException {
		System.out.println("Exclusão de Produtos");
		ProdutoSimples prd = pesquisarProduto(sc);
//		Confirmação de exclusão
		System.out.println("Deseja cancelar a exclusão? (S/N)");
		String res = sc.nextLine();
//		Estou ...
		if(res.equalsIgnoreCase("N")) {
			try {
			prd.apagar();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}//fim do catch
		}// fim do if
//		Voltando para o menu
		System.out.println("Digite algo para voltar ao menu");
		sc.nextLine();//Captura do ultimo enter numerico
	}
	
	private static void alterarProduto(Scanner sc) {
		System.out.println("Alteração de produto");
		ProdutoSimples prd = pesquisarProduto(sc);
		if(prd!=null) {
			System.out.println("Digite a descrição do produto:");
			prd.setDescricao(sc.nextLine());
			
			System.out.println("Digite o saldo do produto:");
			prd.setSaldo(sc.nextInt());
			
			System.out.println("Digite o custo do produto");
			prd.setCusto(sc.nextDouble());
//			Como o ultimo campo foi número, capturamos o enter
			sc.nextLine();
			System.out.println("Confirma a alteração? (S/N)");
			String conf = sc.next();
			if(conf.equalsIgnoreCase("S")) {
				try {
					prd.gravar();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			}//fim do if de confirmação
			
		}//fim do if de pesquisa produto
		
//		Voltando para o menu
		System.out.println("Digite algo para voltar ao menu");
		sc.nextLine();//Captura do ultimo enter numerico
	}

	private static void consultarProduto(Scanner sc) {
		System.out.println("Consulta de produtos");
		
		pesquisarProduto(sc);
//		Pausa para voltar para o menu
		System.out.println("Digite algo para voltar ao menu");
		sc.nextLine();//Captura do ultimo enter numerico
		sc.nextLine();//Pausa para voltar
	}
	
	private static ProdutoSimples pesquisarProduto(Scanner sc) {
		System.out.println("Digite o código do produto a pesquisar:");
		int cod = sc.nextInt();
		sc.nextLine();// captura do enter
		try {
	//		Pesquisando o produto
			ProdutoSimples prd = ProdutoSimples.findByPK(cod);
	//		Mostrando o produto
			System.out.println("prd");
			return prd;
} catch (Exception e) {
	System.out.println(e.getMessage());
}
			return null;
	}

	private static void criarProduto(Scanner sc) {
		sc.nextLine(); //Captura do enter do menu
		System.out.println("Cadastramento de produto");

		System.out.println("Digite a descrição do produto:");
		String des = sc.nextLine();

		System.out.println("Digite o saldo do produto:");
		int sal = sc.nextInt();

		System.out.println("Digite o custo do produto:");
		double cus = sc.nextDouble();

		try {
			//Criando o produto
			ProdutoSimples prd = ProdutoSimples.create(des, sal, cus);
			//Mostrando o produto
			System.out.println(prd);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

		//Pausa para voltar ao menu
		System.out.println("Digite enter para voltar ao menu");
		sc.nextLine();
	}

}