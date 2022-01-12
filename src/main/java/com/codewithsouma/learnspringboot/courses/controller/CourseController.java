package com.codewithsouma.learnspringboot.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.codewithsouma.learnspringboot.courses.bean.Course;
import com.codewithsouma.learnspringboot.courses.service.CoursesService;

@RestController
public class CourseController {
	@Autowired
	private CoursesService coursesService;
	
	// http://localhost:8080/courses
	@GetMapping("/courses")
	public List<Course> getAllCourses(){
		return coursesService.retriveAllCourse();
	}

	@GetMapping("/courses/{id}")
	public List<Course> getCourseDetails(@PathVariable(value = "id") int id){
		return coursesService.getCourse(id);
	}

}
