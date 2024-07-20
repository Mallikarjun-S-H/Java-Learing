package Dao;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class LibBooks {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	private String bname;
	private String bauthor;
	@ManyToMany
	@JoinTable(joinColumns={@JoinColumn }, inverseJoinColumns ={@JoinColumn(name="id")})
	private List<LibStudent> student;
	
	
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBauthor() {
		return bauthor;
	}
	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}
	public List<LibStudent> getStudent() {
		return student;
	}
	public void setStudent(List<LibStudent> student) {
		this.student = student;
	}
}
