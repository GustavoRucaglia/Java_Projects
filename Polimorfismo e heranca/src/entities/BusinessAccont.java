package entities;

public class BusinessAccont extends Accont {
	
	private Double loanLimit;
	
	public BusinessAccont() {
		super();
	}

	public BusinessAccont(String holder, Integer number, Double balence, Double loanLimit) {
		super(holder, number, balence);
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount < this.loanLimit) {
			balance +=amount -10;
		}
	}
	@Override
	public void withdraw(double amout) {
		super.withdraw(amout);
		balance -= 2.00;
	}
}
