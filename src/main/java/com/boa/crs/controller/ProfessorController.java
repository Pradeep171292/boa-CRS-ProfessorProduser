package com.boa.crs.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.boa.crs.entity.Grade;
import com.boa.crs.entity.Student;
import com.boa.crs.service.ProfessorService;

@RestController
@RequestMapping("/Professor")
public class ProfessorController {
	
	private static final Logger logger = LoggerFactory.getLogger(ProfessorController.class);
	
	@Autowired
	ProfessorService professorService;
	
	@RequestMapping(value = "/addGrade", method = RequestMethod.POST)
	public HttpStatus addGrade(@RequestBody Grade professor) {
		logger.info("Controller Adding  Grade");
		return professorService.addGrade(professor) ? HttpStatus.CREATED : HttpStatus.BAD_REQUEST;
	}
	
	@RequestMapping(value = "/getEnrolledStudent", method = RequestMethod.GET)
	public List<Student> getAll() {
		return professorService.getAllStudent();
	}

}
