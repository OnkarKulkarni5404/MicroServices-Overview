package com.StudentClient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentClient.beans.Branch;
import com.StudentClient.beans.Gender;
import com.StudentClient.beans.Student;
import com.StudentClient.dao.StudentDaoImpl;

@Service("service")
public class StudentService {

	@Autowired
	StudentDaoImpl student;

	public String updateStudent(Student s) {
		return student.updateStudent(s);
	}

	public List<Student> showByBranch(Branch branch) {
		return student.showByBranch(branch);
	}

	public List<Student> showByGender(Gender gender) {
		return student.showByGender(gender);
	}

}
