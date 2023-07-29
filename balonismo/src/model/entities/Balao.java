package model.entities;

import java.util.ArrayList;
import java.util.List;

public  abstract class Balao {
		private Integer identificacao;
		private Boolean regularidade;
		
		private Piloto piloto;
		protected List<Passageiro> passageiros = new ArrayList<>();

		public Balao(Integer identificacao, Boolean regularidade, Piloto piloto) {
			this.identificacao = identificacao;
			this.regularidade = regularidade;
			this.piloto = piloto;
		}

		public Piloto getPiloto() {
			return piloto;
		}

		public void setPiloto(Piloto piloto) {
			this.piloto = piloto;
		}

		public Integer getIdentificacao() {
			return identificacao;
		}

		public Boolean getRegularidade() {
			return regularidade;
		}
		
		public void adicionarPassageiros(List<Passageiro> passageiroslist) {
			  for(Passageiro pessoa : passageiroslist) {
				   passageiroslist.add(pessoa);
			  }
		}
		
		public void adicionarPassageiro(Passageiro passageiro) {
			passageiros.add(passageiro);
		}
		
		public void removerPassageiro(Passageiro passageiro) {
			passageiros.remove(passageiro);
		}
		
		public void removerPassageiros(List<Passageiro> passageiroslist) {
			  for(Passageiro pessoa : passageiroslist) {
				   passageiros.remove(pessoa);
			  }
		}
		
		public void exibirPassageiros(List<Passageiro> passageiroslist) {
			  for(Passageiro pessoa : passageiroslist) {
				   System.out.println(pessoa);
			  }
		}
}
