package com.zte.service;

import com.zte.dao.impl.StudentMapperImpl;
import com.zte.dao.model.Student;

public class StudentService {

	private StudentMapperImpl studentDao;
	
	public Student selectByPrimaryKey(Integer id) {
		return studentDao.selectByPrimaryKey(id);
	}

	public void setStudentDao(StudentMapperImpl studentDao) {
		this.studentDao = studentDao;
	}
}
