package com.bilgeadam.recipeapp.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bilgeadam.recipeapp.server.dbo.Allergen;
import com.bilgeadam.recipeapp.server.dbo.Ingredient;

public class HibernateUtil {

		private static final SessionFactory sessionFactory = sessionFactoryHibernate(); 
		
		private static SessionFactory sessionFactoryHibernate() {
			SessionFactory factory = null;
			try {
				Configuration config = new Configuration(); // instance oluşturduk
				
				config.addAnnotatedClass(Ingredient.class); //entity sınıflarımızı burada hibernate'e tanıtmamız gerekli
				config.addAnnotatedClass(Allergen.class);						// bu işlemin ismi "register etmek"tir
		
				
				factory = config.configure("hibernate.cfg.xml").buildSessionFactory();
			}
			catch (Exception ex) {
				System.err.println("Something went terribly wrong: " + ex.getMessage());
			}
			return factory;
		}
		
		public static SessionFactory getSessionFactory() {
			return sessionFactory;
		}

}
