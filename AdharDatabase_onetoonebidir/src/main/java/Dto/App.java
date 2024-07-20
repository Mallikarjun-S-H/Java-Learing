package Dto;

import java.util.Scanner;

import AdharDatabase.Controller;
import Dao.AdharCard;
import Dao.PersonDbo;

public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Name");
		String name = sc.next();
		System.out.println("Enter address");
		String address = sc.next();
		System.out.println("Enter adhar number");
		Long anum = sc.nextLong();
		
		AdharCard adharCard = new AdharCard();
		adharCard.setName(name);
		adharCard.setAddress(address);
		adharCard.setAdharnumber(anum);
		
		
		System.out.println("enter age");
		int age = sc.nextInt();
		
		PersonDbo person = new PersonDbo();
		
		person.setName(name);
		person.setAddress(address);
		person.setAge(age);
		person.setAdharcard(adharCard);
		
		adharCard.setPerson(person);
		
		Controller con = new Controller();
		
		con.saveAdhar(adharCard);
		System.out.println("Adhar details saved");
		System.out.println("Current Data avilable");
		con.viewAll().stream().forEach(x -> System.out.println(x));
		
		
		
		
	}
}
