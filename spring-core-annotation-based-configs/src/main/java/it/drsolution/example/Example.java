package it.drsolution.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import it.drsolution.model.TestBean;
import it.drsolution.services.StudentService;

public class Example {

	public static void main(String[] args) {
		/**
		 * ApplicationContext as heart of spring framework which contains BeanFactory + many other configuration
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		StudentService studentService=(StudentService)context.getBean(StudentService.class);
		studentService.getListOfStudents().stream()
		     .map(s -> s.toString())
		     .forEach(System.out::println);
	}
}
