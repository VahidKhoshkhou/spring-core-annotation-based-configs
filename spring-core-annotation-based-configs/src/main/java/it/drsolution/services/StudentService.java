package it.drsolution.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.drsolution.model.Student;
import it.drsolution.repositories.StudentRepository;

@Service
public class StudentService {    
	
	private StudentRepository studentRepository;
	
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}
	
	
	public List<Student> getListOfStudents(){
		return studentRepository.getStudents();
	}
	
}
