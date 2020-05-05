package com.hm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hm.dao.IStudentdao;
import com.hm.service.IStudentService;
import com.hm.source.Student;

@Service
public class StudentService implements IStudentService {
	
	private IStudentdao Studentdao;

	
	@Autowired
	public void setStudentdao(IStudentdao studentdao) {
		this.Studentdao = studentdao;
	}



	@Override
	public List<Student> queryAllStus() {
		
		return this.Studentdao.queryAllStus();
	}



	@Override
	public Student login(Student stu) {
		
		String inputPwd=stu.getPassword();
		
		stu=this.Studentdao.getStu(stu);
		if(stu!=null) {
			if(inputPwd.equals(stu.getPassword())) {
				return stu;
			}
		}
		return null;
	}



	

}
