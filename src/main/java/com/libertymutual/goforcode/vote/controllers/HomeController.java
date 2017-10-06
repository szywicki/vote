package com.libertymutual.goforcode.vote.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.vote.services.ProjectRepository;
import com.libertymutual.goforcode.vote.services.StudentRepository;


@Controller
@RequestMapping("/")
public class HomeController {

	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private ProjectRepository projectRepo;
	
	@GetMapping("")
	public ModelAndView showDefault() {
		ModelAndView mv = new ModelAndView("home/default");
		mv.addObject("project", projectRepo.findAll());
		mv.addObject("students", studentRepo.findAll());
		return mv;
	}
	
	@PostMapping("")
	public ModelAndView vote() {
		ModelAndView mv = new ModelAndView("vote/project");
		mv.addObject("project", projectRepo.findAll());
		mv.addObject("students", studentRepo.findAll());
		return mv;
	}
}
