package com.app.service;

import java.util.List;

import com.app.model.Student;

public interface StudentService {

	public void addStudent(Student student);
	
	public List<Student> getAllStudents();
	
	public Student getByRollno(Integer rollno);
	
	public void removeByRollno(Integer rollno);
	
	public Student updateByRollno(Integer rollno, Student student);
}
