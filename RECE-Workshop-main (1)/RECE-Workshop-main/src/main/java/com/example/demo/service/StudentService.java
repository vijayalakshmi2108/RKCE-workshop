package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService 
{
    @Autowired
    StudentRepository studentrepo;
    
	public void saveStudent(Student std) {
		// TODO Auto-generated method stub
		studentrepo.save(std);
	}

	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		List<Student> list=new ArrayList();
		list=studentrepo.findAll();
		return list;
	}

	public void deleteStudent(Student std) {
		// TODO Auto-generated method stub
		studentrepo.delete(std);
	}
   
	
	
}
