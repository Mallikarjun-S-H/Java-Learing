package AdharDatabase;

import java.util.List;
import Dao.AdharCard;
import Dao.PersonDbo;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Controller {

	public void saveAdhar(AdharCard adhar) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("adhar");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		et.begin();
		em.persist(adhar); 
		PersonDbo p = adhar.getPerson();
		em.persist(p);
		et.commit();
		
		System.out.println("data saved");
	}
	
	public List<AdharCard> viewAll(){
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("adhar");
		EntityManager em  = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		return em.createQuery("SELECT a FROM AdharCard a", AdharCard.class).getResultList();
		
	}
}
