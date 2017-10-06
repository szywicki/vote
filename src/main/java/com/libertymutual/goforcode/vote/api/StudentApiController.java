package com.libertymutual.goforcode.vote.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libertymutual.goforcode.vote.models.Student;
import com.libertymutual.goforcode.vote.services.StudentRepository;

@RestController
@RequestMapping("/api/students")
public class StudentApiController {

	private StudentRepository studentRepo;
	
	public StudentApiController(StudentRepository studentRepo) {
		this.studentRepo = studentRepo;
		studentRepo.save(new Student("Trace"));
		studentRepo.save(new Student("Luka"));
		studentRepo.save(new Student("Chad"));
	}
	
	@GetMapping("")
	public List<Student> getAll() {
		return studentRepo.findAll();
	}
	
	@PostMapping("")
	public Student create(@RequestBody Student student, @PathVariable long id) {
		student.setId(id);
		return studentRepo.save(student);
	}
}
