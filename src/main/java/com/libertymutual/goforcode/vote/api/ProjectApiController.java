package com.libertymutual.goforcode.vote.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.libertymutual.goforcode.vote.models.Project;
import com.libertymutual.goforcode.vote.services.ProjectRepository;

@RestController
@RequestMapping("/api/projects")
public class ProjectApiController {
	
	private ProjectRepository projectRepo;
	
	public ProjectApiController(ProjectRepository projectRepo) {
		this.projectRepo = projectRepo;
	}
	
	@GetMapping("")
	public List<Project> getAll() {
		return projectRepo.findAll();
	}
	
	@PostMapping("")
	public Project create(@RequestBody Project project, @PathVariable long id) {
		project.setId(id);
		return projectRepo.save(project);
	}
 
}
