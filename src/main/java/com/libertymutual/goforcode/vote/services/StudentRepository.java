package com.libertymutual.goforcode.vote.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libertymutual.goforcode.vote.models.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	

}
