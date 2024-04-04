package br.com.senaisp.bauru.matheus.licao08.exercicio;

public class Equipe {
		private String nome;
		private int vitoria;
		private int empate;
		private int derrota;
		private int golSofrido;
		private int golMarcado;
		
		public Equipe(String nm) {
			nome = nm;
			vitoria = 0;
			empate = 0;
			derrota = 0;
			golSofrido = 0;
			golMarcado = 0;
		}
		//getters e setters
		public int getVitoria() {
			return vitoria;
		}

		public int getEmpate() {
			return empate;
		}

		public int getDerrota() {
			return derrota;
		}

		public int getGolSofrido() {
			return golSofrido;
		}

		public int getGolMarcado() {
			return golMarcado;
		}

		public String getNome() {
			return nome;
		}
		
		public void addVitoria() {
			vitoria++;
		}
		
		public void addDerrota() {
			derrota++;
		}
		
		public void addEmpate() {
			empate++;
		}
		
		public void addGolMarcado(int value) {
			golMarcado += value;
		}
		
		public void addGolSofrido(int value) {
			golSofrido += value;
		}
	}
