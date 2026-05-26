package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.Student;
import com.app.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public void addStudent(Student student) {
		
		studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		
		return studentRepository.findAll();
	}

	@Override
	public Student getByRollno(Integer rollno) {
		
		return studentRepository.findById(rollno).get();
	}

	@Override
	public void removeByRollno(Integer rollno) {
		
		studentRepository.deleteById(rollno);
	}
	
	@Override
	public Student updateByRollno(Integer rollno, Student student) {
		
		Student existingStudent = studentRepository.findById(rollno).get();
		existingStudent.setSname(student.getSname());
		existingStudent.setEmail(student.getEmail());
		existingStudent.setPassword(student.getPassword());
		existingStudent.setDob(student.getDob());
		existingStudent.setContact(student.getContact());
		existingStudent.setBatch(student.getBatch());
		existingStudent.setGender(student.getGender());
		existingStudent.setCourses(student.getCourses());
		existingStudent.setFees(student.getFees());
		existingStudent.setImageUrl(student.getImageUrl());
		existingStudent.getAddress().setPincode(student.getAddress().getPincode());
		existingStudent.getAddress().setArea(student.getAddress().getArea());
		existingStudent.getAddress().setCity(student.getAddress().getCity());
		studentRepository.save(existingStudent);
		return existingStudent;
	}

}
