package com.example.service.impl;

import java.util.List;

import com.example.dao.mapper.StudentMapper;
import com.example.model.Student;
import com.example.service.InterStudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional 
public class StudentServiceImpl implements InterStudentService {

	@Autowired(required=true)
	private StudentMapper testDao;
	
	public List<Student> showList() {
		// TODO Auto-generated method stub
		return testDao.getAll();
	}

	public boolean checkID(int id) {
		if(testDao.getStudentByID(id)!=null)
			return true;
		return false;
	}

	public boolean addStudent(Student stu) {
		if(testDao.insertStudent(stu)!=0)
			return true;
		return false;
	}

	public boolean deleteStudent(int id) {
		if(testDao.deleteStudent(id)!=0)
			return true;
		return false;
	}

	public boolean updateStudent(Student stu) {
		if(testDao.updateStudent(stu)!=0)
			return true;
		return false;
	}

	public List<Integer> getAllId() {
		// TODO Auto-generated method stub
		return testDao.selectAllId();
	}

	public Student getOneStudent(int id) {
		// TODO Auto-generated method stub
		return testDao.getStudentByID(id);
	}

}
