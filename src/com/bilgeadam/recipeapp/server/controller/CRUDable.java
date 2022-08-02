package com.bilgeadam.recipeapp.server.controller;

import java.util.ArrayList;

import org.hibernate.Session;
import com.bilgeadam.recipeapp.utils.HibernateUtil;


/*
 * CRUD = C(reate), R(etrieve), U(pdate), D(elete)
 */

public interface CRUDable<T> { //buradaki t harfi buraya bir sınıfın geleceğini belirtiyor. ne yazdığımız önemli değil
	
	void create(T entity);
	
	ArrayList<T> retrieve();
	void update(T oldOne, T newOne);
	void delete(T entity);
	
	default Session databaseConnectionViaHibernate() {
		return HibernateUtil.getSessionFactory().openSession();
	}
}
