package com.zte.action;

import com.zte.dao.model.Student;
import com.zte.service.StudentService;

public class TestJsonAction extends BaseActionSupport {
	
	private static final long serialVersionUID = 1L;

	private StudentService studentService;
	private Student student;
	
	public String test() throws Exception {
		logger.info("=========>TestJsonAction execute start");
		System.out.println("=========>TestJsonAction execute start");
		student = studentService.selectByPrimaryKey(2);
		logger.info("=========>TestJsonAction execute end, student=" + student);
		System.out.println("=========>TestJsonAction execute end, student=" + student);
		
		return SUCCESS;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}

}
