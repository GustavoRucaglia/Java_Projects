package application;

import Entities.Cliente;

public class Equals {
		public static void main(String[] args) {
			
			Cliente c1 = new Cliente("maria", "maria@gmail");
			Cliente c2 = new Cliente("alex", "maria@gmail");
			System.out.println(c1.hashCode());
			System.out.println(c1.equals(c2));
			
		}
}
