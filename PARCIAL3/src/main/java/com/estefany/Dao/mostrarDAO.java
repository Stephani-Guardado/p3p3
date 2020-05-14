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
			listad = em.createQuery("SELECT c.apellido, c.nombre, c.id FROM Consulta as c").getResultList();
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
		}
		return listad;
	}
	
	
		public void Eliminar(Consulta ge) {
			EntityManager em;
			EntityManagerFactory emf;
			emf = Persistence.createEntityManagerFactory("PARCIAL3");
			em = emf.createEntityManager();
			ge = em.getReference(Consulta.class,ge.getId());
	        em.getTransaction().begin();
			em.remove(ge);
			em.flush();
			em.getTransaction().commit();
			
		}
}
