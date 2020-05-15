package com.estefany.Dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.estefany.model.Usuariosp;

public class usuarioDao {
	
	public List<Usuariosp> ingresarUser(Usuariosp u){
		
		List<Usuariosp> usuario = new ArrayList ();
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("PARCIAL3");
		em = emf.createEntityManager();
		try {
			
			em.getTransaction().begin();
			usuario = em.createQuery("FROM Usuariosp AS u where u.Nombre='"+u.getNombre()+"' and u.Contrasenia='"+u.getContrasenia()+"'").getResultList();
			em.getTransaction().commit();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e+"TIENES UN ERROR");
		}
		
		return usuario;
	}

}
