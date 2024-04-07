package com.boa.crs.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boa.crs.entity.Grade;
import com.boa.crs.entity.Student;
import com.boa.crs.repo.GradeRepository;
import com.boa.crs.repo.StudentRepository;

import jakarta.transaction.Transactional;

@Service
public class ProfessorService {
	private static final Logger logger = LoggerFactory.getLogger(ProfessorService.class);
	
	@Autowired
	GradeRepository gradeRepository;
	
	@Autowired
	StudentRepository studentRepository;
	
	@Transactional
	public boolean addGrade(Grade grade) {
		logger.info("Servce Adding Professor");
		return gradeRepository.save(grade) != null;
	}
	
	@Transactional
	public List<Student> getAllStudent() {
		return (List<Student>) studentRepository.findAll();
	}
}
