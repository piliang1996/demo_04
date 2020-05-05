package com.hm.service;

import java.util.List;

import com.hm.source.Student;



public interface IStudentService {

	public List<Student> queryAllStus();

	public Student login(Student stu);
	
}
