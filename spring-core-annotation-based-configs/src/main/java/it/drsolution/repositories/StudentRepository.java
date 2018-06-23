package it.drsolution.repositories;


import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import it.drsolution.model.Student;

@Repository
public class StudentRepository {
	
	public List<Student> students=Arrays.asList(
			new Student("aaa", "bbb"),
			new Student("ccc", "ddd")
			);

	public StudentRepository() {
	}
	
	
	public List<Student> getStudents(){
		return students;
	}
	
	

}
