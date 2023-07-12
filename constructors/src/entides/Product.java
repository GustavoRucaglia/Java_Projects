package entides;

public class Product {
	
	//declaração
	String name;
	private double price;
	private int quantity;
	
	//construtores
	
		public Product(String name, double price, int quantity) {
			this.name = name;
			this.price = price;
			this.quantity = quantity;
		}
		
		public Product(String name, double price) {
			this.name = name;
			this.price = price;
			this.quantity = 0;
		}
		
		//methodos para trasformar em public
		public void setName(String name) {
			this.name = name;
		}
		
		public String getName() {
			return this.name;
		}
		
		public void setPrice(double price) {
			this.price = price;
		}
		
		public double getPrice() {
			return price;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		
	//methodos
	public double totalValueInStock() {
		return quantity * price;
	};
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
	};
	
	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	};
	
	//trasfromar o objeto em string
	public String toString() {
		return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " quantity, total: $ " + totalValueInStock();
	}

}
