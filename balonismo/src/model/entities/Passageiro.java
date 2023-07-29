package model.entities;

public class Passageiro extends Pessoa {
	private Integer rg;
	private Integer telefone;
	private Integer telefoneFamilar;
	private Integer cep;
	private Boolean cienteDosRiscos;
	
	public Passageiro(String nome, Integer cPF, Integer rg, Integer telefone, Integer telefoneFamilar, Integer cep,
			Boolean cienteDosRiscos) {
		super(nome, cPF);
		this.rg = rg;
		this.telefone = telefone;
		this.telefoneFamilar = telefoneFamilar;
		this.cep = cep;
		this.cienteDosRiscos = cienteDosRiscos;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Integer getTelefoneFamilar() {
		return telefoneFamilar;
	}

	public void setTelefoneFamilar(Integer telefoneFamilar) {
		this.telefoneFamilar = telefoneFamilar;
	}

	public Boolean getCienteDosRiscos() {
		return cienteDosRiscos;
	}

	public void setCienteDosRiscos(Boolean cienteDosRiscos) {
		this.cienteDosRiscos = cienteDosRiscos;
	}

	public Integer getRg() {
		return rg;
	}

	public Integer getCep() {
		return cep;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRG: " + rg + "\ntelefone: " + telefone + ",\ntelefoneFamilar: " + telefoneFamilar + "\nCep: "
				+ cep + "\ncienteDosRiscos: " + cienteDosRiscos ;
	}
	
	

}
