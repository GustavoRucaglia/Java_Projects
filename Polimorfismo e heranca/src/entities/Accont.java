package entities;

public abstract class Accont {
	
	private String holder;
	private  Integer number;
	protected Double balance;
	
	public Accont() {
	}

	public Accont(String holder, Integer number, Double balence) {
		this.holder = holder;
		this.number = number;
		this.balance = balence;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Double getBalence() {
		return balance;
	}

	public void setBalence(Double balence) {
		this.balance = balence;
	}
	
	public void withdraw(double amout) {
		balance -= amout + 5;
	}
	public void deposit(double amout) {
		balance += amout;
	}
	
}
