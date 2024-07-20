package Dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class HibernateStudent {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private String address;
		private String std;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getStd() {
			return std;
		}
		public void setStd(String std) {
			this.std = std;
		}
		@Override
		public String toString() {
			return "HibernateStudent id=" + id + ", name=" + name + ", address=" + address + ", std=" + std ;
		}
	
		
		

}
