package com.gayan.rentacar.demoapplication.service;

import com.gayan.rentacar.demoapplication.model.Student;

public interface StudentService {

	public Student save(Student student);
	
	public Student fetchFindByID(int id);
}
