package com.libertymutual.goforcode.vote.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.libertymutual.goforcode.vote.models.Project;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
