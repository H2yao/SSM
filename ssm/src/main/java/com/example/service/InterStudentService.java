package com.example.service;

import java.util.List;

import com.example.model.Student;

public interface InterStudentService {

	public List<Student> showList();
	
	public boolean checkID(int id);
	
	public Student getOneStudent(int id);
	
	public boolean addStudent(Student stu);
	
	public boolean deleteStudent(int id);
	
	public boolean updateStudent(Student stu);
	
	public List<Integer> getAllId();
}
