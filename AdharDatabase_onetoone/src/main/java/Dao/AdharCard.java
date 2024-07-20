package Dao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class AdharCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long adharnumber;
	private String address;
	@OneToOne
	private PersonDbo person;
	
	public PersonDbo getPerson() {
		return person;
	}
	public void setPerson(PersonDbo person) {
		this.person = person;
	}
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
	public long getAdharnumber() {
		return adharnumber;
	}
	public void setAdharnumber(long adharnumber) {
		this.adharnumber = adharnumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "AdharCard id=" + id + ", name=" + name + ", adharnumber=" + adharnumber + ", address=" + address
				+ ", age=" + person.getAge();
	}
	
}
