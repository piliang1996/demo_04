package com.hm.dao;

import java.util.List;

import com.hm.source.Student;



public interface IStudentdao {
	
	List<Student> queryAllStus();
	
	Student getStu(Student stu);
}
