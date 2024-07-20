package Controller;

import java.util.Scanner;

import Dao.StudentDbo;
import Dto.HibStudent;

public class SchollDBController {

	public static void main(String[] args) {
		
		StudentDbo dbo = new StudentDbo();
		
		boolean status = true;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter 1 to add \n2 to show all \n3 delete \n4 to exit");

		while (status) {
		switch (sc.nextInt()) {
		case 1:{
				HibStudent student = new HibStudent();
				System.out.println("Enter student Name");
				student.setSname(sc.next());
				System.out.println("Enter student Age");
				student.setSage(sc.nextInt());
				System.out.println("Enter student Address");
				student.setSaddress(sc.next());
				
				dbo.saveStudent(student);
				System.out.println("saved");
		}break;
		case 2:{			
				dbo.findAll().stream().forEach(x->System.out.println(x.toString()));
			
		}break;
		case 3:{
				System.out.println("Enter ID to delete");
				int id = sc.nextInt();
				dbo.delete(id);			
		}break;
		
		case 4:{
				status = false;
				System.out.println("Exited");
		}break;
		
		default : System.out.println("Invalid input");
		}
	}
		
  }
}
