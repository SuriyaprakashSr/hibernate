package com.ty.manytomanybiass.DTO;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private long rollNumber;
	private String degree;
	@ManyToMany(mappedBy = "students")
	List<Teacher> teachers;

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

	public long getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNumber=" + rollNumber + ", degree=" + degree
				+ ", teachers=" + teachers + "]";
	}
	
	
	
	
	
}
