package io.sachin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.TransactionManager;

public class PokeddoxInitiatorDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			EntityTransaction entityTransaction = entityManager.getTransaction();
			
			Pokemon p = entityManager.find(Pokemon.class, "nagar");
			entityTransaction.begin();
			entityManager.remove(p);
			entityTransaction.commit();
			
	}

}
