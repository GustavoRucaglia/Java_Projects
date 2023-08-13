package application;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;


public class Program {

	public static void main(String[] args) {
	    //Pessoa p1 = new Pessoa(null, "Vava", "vavatina@gmail.com");
	    //Pessoa p2 = new Pessoa(null, "guga", "gugatina@gmail.com");
	   // Pessoa p3 = new Pessoa(null, "yas", "yas1608@gmail.com");
	    
	    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpa");
	    
	    EntityManager em = emf.createEntityManager();
	    em.getTransaction().begin();
	    Pessoa p = em.find(Pessoa.class, 2);
	    em.getTransaction().commit();
	    em.remove(p);
	    
	 //   Pessoa p = em.find(Pessoa.class, 2);
	  //  System.out.println(p);
	    //em.getTransaction().begin();
	  //  em.persist(p1);
	   // em.persist(p2);
	   //em.persist(p3);
 	   // em.getTransaction().commit();
	    
	   em.clear();
	   emf.close();

	}

}
