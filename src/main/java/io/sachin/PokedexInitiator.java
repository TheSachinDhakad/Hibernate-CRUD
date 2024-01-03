package io.sachin;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PokedexInitiator {

	public static void main(String[] args) {
		Pokemon p1 = new Pokemon();

		p1.setName("nagar");
		p1.setType("nagar");
		p1.setPower(100);

		Pokemon p2 = new Pokemon();

		p2.setName("khushi");
		p2.setType("deshmukh");
		p2.setPower(100);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("sachin");

		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		entityManager.persist(p1);
		entityManager.persist(p2);
		entityTransaction.commit();

	}

}


















































//
//
//h2 confugration
//
//<?xml version="1.0" encoding="UTF-8"?>
//<persistence version="2.2"
//	xmlns="http://xmlns.jcp.org/xml/ns/persistence"
//	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/persistence
//  http://xmlns.jcp.org/xml/ns/persistence/persistence_2_2.xsd">
//
//	<persistence-unit name="sachin"
//		transaction-type="RESOURCE_LOCAL">
//		<provider>org.hibernate.jpa.HibernatePersistenceProvider</provider>
//		<!-- Entities mapping -->
//		
//
//		<!-- Database configuration -->
//		<properties>
//			<property name="javax.persistence.jdbc.driver" value="org.h2.Driver" />
//
//			<property name="javax.persistence.jdbc.url"
//				value="jdbc:h2:tcp://localhost/~/test" />
//
//			<property name="javax.persistence.jdbc.user" value="sa" />
//			<property name="javax.persistence.jdbc.password" value="" />
//
//			<!-- Hibernate specific properties -->
//			<property name="hibernate.dialect"
//				value="org.hibernate.dialect.H2Dialect" />
//			<property name="hibernate.show_sql" value="true" />
//			<property name="hibernate.format_sql" value="true" />
//
//			<!-- Enable H2 console -->
//			<property name="hibernate.hbm2ddl.auto" value="create" />
//			<property name="hibernate.temp.use__jdbc_metadata_defaults"
//				value="false" />
//		</properties>
//	</persistence-unit>
//</persistence>
