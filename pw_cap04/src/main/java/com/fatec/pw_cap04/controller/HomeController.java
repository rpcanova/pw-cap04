package com.fatec.pw_cap04.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@GetMapping("/")
	public ModelAndView menu() {
		return new ModelAndView ("paginaMenu");
	}
	
	@GetMapping("/login")
	public ModelAndView login() {
		return new ModelAndView ("paginaLogin");
	}
	
	@GetMapping("/aluno/cadastrar")
	public ModelAndView cadastrarAluno() {
		return new ModelAndView ("cadastrarAluno");
	}
	
	@GetMapping("/livro/cadastrar")
	public ModelAndView cadastrarLivro() {
		return new ModelAndView("cadastrarLivro");
	}
}
