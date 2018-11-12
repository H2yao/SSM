package com.example.dao.mapper;

import java.util.List;

import com.example.model.Student;

public interface StudentMapper {

	public List<Student> getAll();
	
	public Student getStudentByID(int id);
	
	public int insertStudent(Student stu);
	
	public int deleteStudent(int id);
	
	public int updateStudent(Student stu);
	
	public List<Integer> selectAllId();
}
