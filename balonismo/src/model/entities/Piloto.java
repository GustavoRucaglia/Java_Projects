package model.entities;

public class Piloto extends Pessoa{
	
	  private Integer anac;

	public Piloto(String nome, Integer cPF, Integer anac) {
		super(nome, cPF);
		this.anac = anac;
	}

	public Integer getAnac() {
		return anac;
	}

	public void setAnac(Integer anac) {
		this.anac = anac;
	}

	@Override
	public String toString() {
		return super.toString() + "\nRegistro ANAC: " + anac;
	}

	
	 
	  
	  

}
