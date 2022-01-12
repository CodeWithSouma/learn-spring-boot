package com.codewithsouma.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codewithsouma.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {
	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1,"Learn Microservices","CodeWithSouma"),
							 new Course(2,"Learn Spring MVC","CodeWithSouma"),
							 new Course(3,"Learn Spring Core","CodeWithSouma"),
							 new Course(4,"Learn Spring Boot with React","CodeWithSouma"),
							 new Course(5,"Learn Servlet & JSP","CodeWithSouma"));
	}

}
