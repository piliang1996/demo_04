package com.hm.dao.impl;



import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.hm.dao.IStudentdao;
import com.hm.source.Student;

@Repository
public class StudentDao implements IStudentdao {

	private JdbcTemplate JdbcTemplate;
	
	public  StudentDao() {
		
	}
	
	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.JdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Student> queryAllStus() {
		String sql = "select * from acount";		 
		List<Student> stus = this.JdbcTemplate.query(sql,new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {				
				Student stu=new Student();
				stu.setID(rs.getInt("ID"));
				stu.setUsername(rs.getString("username"));
				stu.setPassword(rs.getString("password"));				
				return stu;
			}
		});
		return stus;
	}

	@Override
	public Student getStu(Student stu) {
		String sql = "select * from acount where username=?";		 
		stu = this.JdbcTemplate.queryForObject(sql, new Object[] { stu.getUsername() }, new RowMapper<Student>() {

			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student stu_ = new Student();
				stu_.setID(rs.getInt("ID"));
				stu_.setUsername(rs.getString("username"));
				stu_.setPassword(rs.getString("password"));
				return stu_;
			}
		});
		return stu;
	}





}
