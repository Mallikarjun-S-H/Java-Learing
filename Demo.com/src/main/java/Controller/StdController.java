package Controller;

import java.util.Scanner;

import Dao.StudentDbo;
import Dto.HibernateStudent;

public class StdController {

	public static void main(String[] args) {
		
		StudentDbo dbo = new StudentDbo();

		Scanner scan = new Scanner(System.in);
		boolean read = true;
		while (read) {
			System.out.println("Enter 1 to add \n2 to delete \n3 to get all \n4 to exit");

			switch (scan.nextInt()) {
			case 1: {
				HibernateStudent ht = new HibernateStudent();
				System.out.println("Enter name");
				ht.setName(scan.next());
				System.out.println("address");
				ht.setAddress(scan.next());
				System.out.println("Std");
				ht.setStd(scan.next());

				dbo.saveStudent(ht);
				System.out.println("saved");
			}
				break;
			case 2: {
				System.out.println("Enter Id");
				int id = scan.nextInt();
				dbo.deleteById(id);
			}
				break;
			case 3:{
				dbo.findAll().stream().forEach(x->System.out.println(x.toString()));
			}
				break;

			case 4: read = false; break;

			default:
				System.out.println("Invalid Option");
			}
		}
	}
}
