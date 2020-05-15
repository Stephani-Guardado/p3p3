package com.estefany.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.estefany.model.Consulta;



public class mostrarDAO {
	public List<Consulta> mostrar() {
		List<Consulta> listad = new ArrayList<>();
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("PARCIAL3");
		em = emf.createEntityManager();
		try {
			em.getTransaction().begin();
			listad = em.createQuery(" FROM Consulta").getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
		}
		return listad;
	}
	
	public void agregarC(Consulta c) {
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("PARCIAL3");
	     em=emf.createEntityManager();
		
	     em.getTransaction().begin();
			em.persist(c);
			em.flush();
			em.getTransaction().commit();
		

		
		
	}
	public void Actualizar(Consulta c) {
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("PARCIAL3");
		   em=emf.createEntityManager();
		c.getId();
		c.getNombre();
		c.getApellido();
		
		em.getTransaction().begin();
			em.merge(c);
			
			em.flush();
		
			em.getTransaction().commit();
		
	}

	public void EliminarC(Consulta c) {
		EntityManager em;
		EntityManagerFactory emf;
		emf= Persistence.createEntityManagerFactory("PARCIAL3");
		   em=emf.createEntityManager();
		   c= em.getReference(Consulta.class,c.getId());
		   em.getTransaction().begin();
		em.remove(c);
		
		em.flush();

		em.getTransaction().commit();
	}
	
}
