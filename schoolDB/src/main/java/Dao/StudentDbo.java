package Dao;

import java.util.List;

import Dto.HibStudent;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class StudentDbo {
		
	public void saveStudent(HibStudent student) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mallik");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(student);
		et.commit();
	}
	
	public List<HibStudent> findAll(){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mallik");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		return em.createQuery("select a from studentrecords a", HibStudent.class).getResultList();
	}
	
	public void delete(int id) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mallik");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		try {
		HibStudent hibstu = em.find(HibStudent.class, id);
		System.out.println(hibstu.getSid() + " " + hibstu.getSname()+ " " + hibstu.getSage());
		et.begin();
		em.remove(hibstu);
		et.commit();
		}catch (Exception e) {
			System.out.println("Data not found in the table");
		}		
		
	}
}
