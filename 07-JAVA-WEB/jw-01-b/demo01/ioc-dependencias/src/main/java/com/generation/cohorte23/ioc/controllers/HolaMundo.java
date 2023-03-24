package com.generation.cohorte23.ioc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HolaMundo {
	@RequestMapping("/")
	public String hola() {
		return "Hola mundo desde Spring Boot";
	}
	
}
