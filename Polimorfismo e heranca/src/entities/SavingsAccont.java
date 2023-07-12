package entities;

public final class SavingsAccont extends Accont{
	
	private Double interestRate;
	
	public SavingsAccont() {
		super();
	}

	public SavingsAccont(String holder, Integer number, Double balence, Double interestRate) {
		super(holder, number, balence);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBAllance() {
		balance += balance * interestRate;
	}
	
	@Override
	public final void withdraw(double amout) {
		balance -= amout;
	}
	
}
