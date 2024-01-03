package io.sachin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PokedexInitiatorRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		Pokemon p = entityManager.find(Pokemon.class , "sachin");
		
		System.out.println(p);
	}

}
