package model.entities;

public class Invoice {
		private Double basicPayment;
		private Double tax;
		private Double totalPayment;
		
		
		public Invoice(Double basicPayment, Double tax) {
			this.basicPayment = basicPayment;
			this.tax = tax;
			calculeTotalPayment();
		}

		
		public Double getTotalPayment() {
			return totalPayment;
		}


		public Double getBasicPayment() {
			return basicPayment;
		}


		public void setBasicPayment(Double basicPayment) {
			this.basicPayment = basicPayment;
		}


		public Double getTax() {
			return tax;
		}


		public void setTax(Double tax) {
			this.tax = tax;
		}


		public void calculeTotalPayment() {
			totalPayment = getBasicPayment() + getTax();
		}
}
