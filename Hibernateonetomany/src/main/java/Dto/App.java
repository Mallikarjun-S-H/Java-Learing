package Dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import Dao.LibBooks;
import Dao.LibStudent;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class App {
	
	
	public static void main(String[] args) {
	
		
		Scanner sc = new Scanner(System.in);
		
		LibStudent s1 = new LibStudent();
		s1.setSname("Raj");
		s1.setSclass(8);
		
		LibStudent s2 = new LibStudent();
		s2.setSname("Rajiv");
		s2.setSclass(8);
		
		LibStudent s3 = new LibStudent();
		s3.setSname("Naveen");
		s3.setSclass(8);
		
		LibBooks b1 = new LibBooks();
		b1.setBname("Science");
		b1.setBauthor("B H K");
		
		LibBooks b2 = new LibBooks();
		b2.setBname("Social Science");
		b2.setBauthor("B B R");
		
		LibBooks b3 = new LibBooks();
		b3.setBname("History");
		b3.setBauthor("G H K");
		
		List<LibStudent> student1 = new ArrayList<>();
		student1.add(s1);
		student1.add(s2);
		student1.add(s3);
		b1.setStudent(student1);
		
		List<LibStudent> student2 = new ArrayList<>();
		student2.add(s1);
		student2.add(s2);
		student2.add(s3);
		b2.setStudent(student2);
		
		List<LibStudent> student3 = new ArrayList<>();
		student3.add(s1);
		student3.add(s2);
		student3.add(s3);
		b3.setStudent(student3);
		
		List<LibBooks> book1 = new ArrayList<LibBooks>();
		book1.add(b1);
		book1.add(b2);
		book1.add(b3);
		s1.setBook(book1);
		
		List<LibBooks> book2 = new ArrayList<LibBooks>();
		book2.add(b1);
		book2.add(b2);
		book2.add(b3);
		s2.setBook(book2);
		
		List<LibBooks> book3 = new ArrayList<LibBooks>();
		book3.add(b1);
		book3.add(b2);
		book3.add(b3);
		s3.setBook(book3);
		
		EntityManagerFactory emt = Persistence.createEntityManagerFactory("mallik");
		EntityManager em = emt.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();	
		em.persist(s1);
		em.persist(s2);
		em.persist(s3);
		em.persist(b1);
		em.persist(b2);
		em.persist(b3);
		et.commit();
	}
}
