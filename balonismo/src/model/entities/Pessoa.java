package model.entities;

public class Pessoa {
		private String nome;
		private Integer cpf;
		
		public Pessoa(){}

		public Pessoa(String nome, Integer cPF) {
			this.nome = nome;
			this.cpf = cPF;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public Integer getcpf() {
			return cpf;
		}

		@Override
		public String toString() {
			return "\nNome: " + nome + "\nCPF: " + cpf;
		}
		
		
	}
