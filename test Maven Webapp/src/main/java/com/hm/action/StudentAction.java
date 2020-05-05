package com.hm.action;


import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.request;

import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.hm.service.IStudentService;
import com.hm.source.Student;

@Controller
@RequestMapping("/student")
@SessionAttributes("student")
public class StudentAction {

	
	private IStudentService studentService;

	@Autowired
	public void setStudentService(IStudentService studentService) {
		this.studentService = studentService;
	}
	
//	@ModelAttribute("student")
//	public Student getStudent() {
//		Student student =new Student();
//		student.setID(4);
//		student.setUsername("66666");
//		student.setPassword("12314");
//		return student;
//	}
	
	
//	@RequestMapping("/queryAllStudent/")
//	public String queryAllStudent() {
//		List<Student> stus=this.studentService.queryAllStus();
//		for (Student student : stus) {
//			System.out.println(student);
//		} 
//		return "test";
//	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(Student student) {
		
		student=this.studentService.login(student);
		//会话对象
		ModelAndView model=new ModelAndView();		
		if(student!=null) {
			//将数据放到请求作用域
			model.addObject("student", student);
		}else {
			//return "默认页面";
		}
		
		//request.setAttribute("student", student);
		return this.queryAllStudent();
	}
	
	
	@RequestMapping("/queryAllStudent/")
	public ModelAndView queryAllStudent() {
		List<Student> stus=this.studentService.queryAllStus();
		
		ModelAndView mav=new ModelAndView("test");
		mav.addObject("stus",stus);
		return mav;
	}
	
	@RequestMapping(value="/login_",method=RequestMethod.POST)
	public String login_(Student student,ModelMap modelMap) {
		
		student=this.studentService.login(student);
		
		Student stu=(Student)modelMap.get(student);
		modelMap.addAttribute("student",student);
		
		
		//request.setAttribute("student", student);
		return "test";
	}
}
