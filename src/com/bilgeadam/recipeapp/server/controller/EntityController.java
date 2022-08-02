package com.bilgeadam.recipeapp.server.controller;

import java.util.ArrayList;

import org.hibernate.Session;

import com.bilgeadam.recipeapp.utils.HibernateUtil;

public class EntityController <T> implements CRUDable<T> {

	@Override
	public void create(T entity) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.getTransaction().begin();
		session.persist(entity);
		session.getTransaction().commit();
	}

	@Override
	public ArrayList<T> retrieve() {
		return null;
	}

	@Override
	public void update(T oldOne, T newOne) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(T entity) {
		// TODO Auto-generated method stub
		
	}

}
