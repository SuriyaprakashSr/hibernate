package com.ty.manytomanybiass.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.manytomanybiass.DTO.Student;
import com.ty.manytomanybiass.DTO.Teacher;



public class StudnetMain {
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.setName("suriya");
		student1.setRollNumber(4321);
		student1.setDegree("BCA");
		
		Student student2 = new Student();
		student2.setName("prakash");
		student2.setRollNumber(98765);
		student2.setDegree("BSC");
		
		Student student3= new Student();
		student3.setName("dimple");
		student3.setRollNumber(54633);
		student3.setDegree("BE.CS");
		
		Teacher teacher1 = new Teacher();
		teacher1.setName("tom");
		teacher1.setSubject("java");
		
		
		Teacher teacher2 = new Teacher();
		teacher2.setName("jerry");
		teacher2.setSubject("c programming");
		
		Teacher teacher3 = new Teacher();
		teacher3.setName("dimple");
		teacher3.setSubject("Html");
		
		
		List<Teacher> ls1 = new ArrayList<Teacher>();
		ls1.add(teacher1);
		ls1.add(teacher3);
		
		student1.setTeachers(ls1);
		
		List<Teacher> ls2= new ArrayList<Teacher>();
		ls2.add(teacher2);
		ls2.add(teacher3);
		
		student2.setTeachers(ls2);
		
		
		List<Teacher> ls3 = new ArrayList<Teacher>();
		ls3.add(teacher1);
		ls3.add(teacher2);
		ls3.add(teacher3);
		
		student3.setTeachers(ls3);
		
		
		
	   List<Student> l1 = new ArrayList<Student>();
	   l1.add(student1);
	   l1.add(student3);
	   
	   teacher1.setStudents(l1);
	   
	 
	   
	   List<Student> l2 = new ArrayList<Student>();
	   l2.add(student3);
	   l2.add(student2);
	   
	   teacher2.setStudents(l2);
	   
	   
	   List<Student> l3= new ArrayList<Student>();
	   l3.add(student1);
	   l3.add(student2);
	   l3.add(student3);
	   
	   teacher3.setStudents(l3);
	   
	   EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityManager.persist(teacher1);
		entityManager.persist(teacher2);
		entityManager.persist(teacher3);
		entityTransaction.commit();
	   
		
	
		
		
		

		
		
	}

}
