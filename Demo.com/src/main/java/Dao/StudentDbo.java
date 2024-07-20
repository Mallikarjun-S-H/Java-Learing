package Dao;

import java.util.List;

import Dto.HibernateStudent;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDbo {

	public void saveStudent(HibernateStudent ht) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mallik");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(ht);
		et.commit();

	}

	public void deleteById(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mallik");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		try {
			HibernateStudent hts = em.find(HibernateStudent.class, id);
			System.out.println(hts.getId() + "" + hts.getName());

			et.begin();
			em.remove(hts);
			et.commit();

			System.out.println("Deleted");
		} catch (Exception e) {
			System.err.print("Id not Found");
		}

	}

	public List<HibernateStudent> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mallik");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		return em.createQuery("SELECT a from HibernateStudent a ",HibernateStudent.class).getResultList();

	}
	
}
