package util;

import java.util.function.Consumer;

import entities.Product;

public class ConsumerTeste implements Consumer<Product>{

	@Override
	public void accept(Product p) {
		 p.setPrice(p.getPrice() * 1.1);
	}

}
