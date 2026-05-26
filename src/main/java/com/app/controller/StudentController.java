package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Student;
import com.app.service.StudentService;

@CrossOrigin("*")
@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/add")
	public Student addRecord(@RequestBody Student student) {
		
		studentService.addStudent(student);
		return student;
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllRecords() {
		
		List<Student> allStudents = studentService.getAllStudents();
		return allStudents;
	}
	
	@GetMapping("/getByRollno/{rollno}")
	public Student getSingleRecord(@PathVariable Integer rollno) {
		
		Student byRollno = studentService.getByRollno(rollno);
		return byRollno;
	}
	
	@DeleteMapping("/delete/{rollno}")
	public String removeRecord(@PathVariable Integer rollno) {
		
		studentService.removeByRollno(rollno);
		return "Record removed...!!";
	}
	
	@PutMapping("/update/{rollno}")
	public Student updateRecord(@PathVariable Integer rollno, @RequestBody Student student) {
		Student updateByRollno = studentService.updateByRollno(rollno,student);
		return updateByRollno;
	}
	
}


