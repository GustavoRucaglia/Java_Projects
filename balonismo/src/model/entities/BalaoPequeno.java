package model.entities;

import java.util.List;

public class BalaoPequeno extends Balao{

	@SuppressWarnings("unused")
	private Cor cor = Cor.BLUE;
	private int maxQtd = 2;
	

	public BalaoPequeno(Integer identificacao, Boolean regularidade, Piloto piloto) {
		super(identificacao, regularidade, piloto);
	}
	
	@Override
	public void adicionarPassageiros(List<Passageiro> passageiroslist) {
		int qtdPessoas = passageiroslist.size();
		 if( qtdPessoas > maxQtd) {
			 System.out.println("Tamanho máximo de pessoas utrapassou");
			 return;
		 }
		  for(Passageiro pessoa : passageiroslist) {
			   passageiroslist.add(pessoa);
		  }
	}
	@Override
	public void adicionarPassageiro(Passageiro passageiro) {
	    if (passageiros.size() >= maxQtd) {
	        System.out.println("Tamanho máximo de pessoas ultrapassou");
	        return;
	    }
	    passageiros.add(passageiro);
	}
		
}
