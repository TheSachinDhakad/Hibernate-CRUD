package io.sachin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Pokedoxinitiatorupdate {
	public static void main(String[] args) {
		
		
		EntityManagerFactory  entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Pokemon p = entityManager.find(Pokemon.class, "sachin");
		if(p!=null) {
			p.setPower(200);
			transaction.begin();
			entityManager.persist(p);
			transaction.commit();
		}
		
		else {
			System.out.println("entry not exist....");
		}
	}

}
