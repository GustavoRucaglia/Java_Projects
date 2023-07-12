package entides;

public class Banck {
		private  int numberAccont;
		private String name;
		private double balance;
		
		public Banck(int numberAccont, String name) {
			this.name = name;
			this.numberAccont = numberAccont;
		}
		
		public int getNumberAccont() {
			return this.numberAccont;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
		public  void setBalance( double balance) {
			this.balance = balance;
		}
		
		public double getBalance() {
			return this.balance;
		}
		
		public void depositBalance(double value) {
			this.balance += value;
			System.out.println("Updated accont data:" + this);
		}
		
		public void withdrawBalance(double value) {
			this.balance -= (value +5);
			System.out.println("Updated accont data:" + this);
		}
		
		public String toString() {
			return "\nAccont: " + this.numberAccont + ", Holder: " + this.name + ", balance: $ " + this.balance;
		}
		
}
