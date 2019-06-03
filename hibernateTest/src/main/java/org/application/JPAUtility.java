/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtility {
 	private static final EntityManagerFactory emFactory;
	static {
		   emFactory = Persistence.createEntityManagerFactory("MYPU");
	}
	public static EntityManager getEntityManager(){
		return emFactory.createEntityManager();
	}
	public static void close(){
		emFactory.close();
	}
} 