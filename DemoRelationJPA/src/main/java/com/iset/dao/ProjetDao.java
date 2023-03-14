package com.iset.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.iset.entities.Projet;
import com.iset.util.JPAutil;


public class ProjetDao {
	private EntityManager entityManager=JPAutil.getEntityManager("DemoRelationJPA");
	
	 public   void ajouter(Projet c)
		{
		 	EntityTransaction tx = entityManager.getTransaction();
		 	tx.begin();
		 	entityManager.persist(c);
		 	tx.commit();
		 	  
		}
	 
	
}
