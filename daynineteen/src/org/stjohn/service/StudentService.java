package org.stjohn.service;

import java.util.List;

import org.stjohn.entities.Student;

public interface StudentService {
	
	public boolean addStudent(Student student); // create

	public Student getStudent(int rollno); // retrive with specific id

	public List<Student> getAll(); // retrive all the data

	public Student updateStudent(Student student); // update

	public boolean deleteStudent(int i); // delete

	boolean deleteStudent(Student student);
}
