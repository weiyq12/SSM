package com.zte.action;

import com.zte.service.StudentService;

public class StudentAction extends BaseActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private StudentService studentService;
	
	public String aaMethod() throws Exception {
		logger.info("========>StudentAction aaMethod");
		System.out.println("========>StudentAction execute result: " + studentService.selectByPrimaryKey(1));
		return SUCCESS;
	}

	public void setStudentService(StudentService studentService) {
		this.studentService = studentService;
	}
}
