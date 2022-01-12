package com.codewithsouma.learnspringboot.courses.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.codewithsouma.learnspringboot.courses.bean.Course;

@Service
public class CoursesService {
	private List<Course> courses = Arrays.asList(new Course(1,"Learn Microservices","CodeWithSouma"),
			 new Course(2,"Learn Spring MVC","CodeWithSouma"),
			 new Course(3,"Learn Spring Core","CodeWithSouma"),
			 new Course(4,"Learn Spring Boot with React","CodeWithSouma"),
			 new Course(5,"Learn Servlet & JSP","CodeWithSouma"));
	
	
	public List<Course> retriveAllCourse(){
		return courses;
	}
	
	public List<Course> getCourse(int id) {
		return  courses.stream().filter(c -> c.getId() == id).collect(Collectors.toList());
	}

}
