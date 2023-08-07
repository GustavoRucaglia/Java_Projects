package Application;

import dao.Produto;
import dao.ProdutoDao;

public class Main {

	public static void main(String[] args) {
	     ProdutoDao dao = new ProdutoDao();
	     
	     for(Produto p: dao.listar()) {
	    	 System.out.println(p.toString());
	     }

	}

}
