package Dao;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;


@Entity
public class LibStudent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	private int sclass;
	@ManyToMany(mappedBy = "student")
	private List<LibBooks> book;
	
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSclass() {
		return sclass;
	}
	public void setSclass(int sclass) {
		this.sclass = sclass;
	}
	public List<LibBooks> getBook() {
		return book;
	}
	public void setBook(List<LibBooks> book) {
		this.book = book;
	}
	@Override
	public String toString() {
		return "LibStudent sid=" + sid + ", sname=" + sname + ", sclass=" + sclass + ", book taken=" + book ;
	}
	
}

