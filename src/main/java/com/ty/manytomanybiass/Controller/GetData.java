package com.ty.manytomanybiass.Controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


import com.ty.manytomanybiass.DTO.Student;

public class GetData {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
		
	Student student=	entityManager.find(Student.class, 1);
	System.out.println(student);
	}

}
