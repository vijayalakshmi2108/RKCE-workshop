package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	@PostMapping("/insertStudentData")
	public String insertStudent(@RequestBody Student std)
	{
		studentservice.saveStudent(std);
		return "Student Data Inserted";
	}
	@GetMapping("/getStudentData")
	public List<Student> getStudent()
	{
		ArrayList list;
		list=(ArrayList) studentservice.getStudents();
		return list;
	}
	@DeleteMapping("/deleteStudent")
	public String deleteStudent(@RequestBody Student std)
	{
		studentservice.deleteStudent(std);
		return "Student Delete Successfully";
	}

}
